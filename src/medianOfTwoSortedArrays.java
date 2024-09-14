import java.util.*;
public class medianOfTwoSortedArrays {
    float median(int[] arr1, int[] arr2){
        int arr3[] = new int[arr1.length+arr2.length];
        int mid = 0;
        for(int i=0; i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int i=0; i<arr2.length;i++){
            arr3[arr1.length+i] = arr2[i];
        }
        Arrays.sort(arr3);
        if(arr3.length % 2 == 0){
            mid = arr3.length/2;
            float sum = arr3[mid] + arr3[mid-1];
            return sum/2;
        }
        else{
            mid = arr3.length/2;
            return (float)arr3[mid];
        }
    }
    public static void main(String[] args) {
        medianOfTwoSortedArrays ms = new medianOfTwoSortedArrays();
        int[] arr1 = {1,2,3,4,5,8};
        int[] arr2 = {10,20,50,60,70};
        System.out.println(ms.median(arr1, arr2));
    }
}
