public class SelectionSort {
    //Select minimum and swap
    void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int  min = arr[i];
            int minPos = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minPos = j;
                }
            }
            //Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr={45,12,74,52,23,10,56,89};
        selectionSort.sort(arr);
    }
}
