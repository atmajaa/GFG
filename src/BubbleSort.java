public class BubbleSort {
    void Bsort(int[] arr){
        //Because the last element gets sorted  on its own
        for(int i=0; i<arr.length-1; i++){
            //The array gets sorted from the last (in increasing order)
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {45,10,52,96,36};
        bubbleSort.Bsort(arr);
    }
}
