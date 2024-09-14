public class searchArray {
    int search(int num){
        int[] arr = {14,75,75,36,85,20,48,23};
        int index = 0;
        System.out.println("Elements in array are - ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                index = i;
                break;
            }
            else{
                index = -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        searchArray searchArray = new searchArray();
        System.out.println(searchArray.search(23));
    }
}
