public class leftRotateByOne {
    void leftRotate(int[] arr){
        int firstElement = arr[0];
        for(int i=1; i< arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = firstElement;
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {10,82,56,47};
        leftRotateByOne leftRotateByOne = new leftRotateByOne();
        leftRotateByOne.leftRotate(array);
    }
}
