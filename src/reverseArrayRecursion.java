public class reverseArrayRecursion {
    int arr[] = {10,78,58,63,89,45};
    int temp = 0;
    void reverse(int low, int high){
        if(high <= low){
            return ;
        }
        else{
            temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            reverse(low+1, high-1);
        }
    }
    public static void main(String[] args) {
        reverseArrayRecursion reverseArrayRecursion = new reverseArrayRecursion();
        reverseArrayRecursion.reverse(0,reverseArrayRecursion.arr.length-1);
        for (int num : reverseArrayRecursion.arr) {
            System.out.print(num + " ");
        }
    }
}
