public class moveZeroToEnd {
    void moveZeros(int arr[]){
        int[] temp = new int[arr.length];
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[counter] = arr[i];
                //System.out.println(temp[i]);
                counter++;
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(temp[i] + " ");
        }
    }
    //EFFICIENT METHOD
    int count = 0, temp = 0;
    void moveZerosSwap(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {10,0,4,60,0,7,0};
        moveZeroToEnd moveZeroToEnd = new moveZeroToEnd();
        System.out.println("My Solution - O(n)");
        moveZeroToEnd.moveZeros(array);
        System.out.println();
        System.out.println("Efficient solution - O(1)");
        moveZeroToEnd.moveZerosSwap(array);
    }
}
