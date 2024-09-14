import java.util.Arrays;

public class secondLargest {
    int arr[] = {45,42,51,96,36,50};
    int[] arr1 =  new int[arr.length];
    int index = 0;
    int indexSecondLargest(){
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        int secondHighest = arr1[arr1.length - 2];
        for(int i=0; i<arr.length; i++){
            if(arr[i] == secondHighest){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        secondLargest secondLargest = new secondLargest();
        System.out.println(secondLargest.indexSecondLargest());
    }
}
