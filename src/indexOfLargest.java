public class indexOfLargest {
    int findIndex(){
        int arr[] = {75,65,99,35,10,48,96};
        int largest = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        indexOfLargest indexOfLargest = new indexOfLargest();
        System.out.println(indexOfLargest.findIndex());
    }
}
