public class reverseArray {
    int[] arr = {10,20,30,40,5};
    int low = 0;
    int high = arr.length-1;
    int temp = 0;
    void  reverse(){
        while(low < high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        reverseArray reverseArray = new reverseArray();
        reverseArray.reverse();
    }
}
