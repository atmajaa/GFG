public class IntersectionOfTwoSortedArrays {
    void findIntersection(int arr1[], int arr2[]){
       int i = 0, j = 0;
       while(i<arr1.length && j<arr2.length){
        if(i>0 && arr1[i] == arr1[i-1]){
            i++;
            continue;
        }
        if(arr1[i] < arr2[j]){
            i++;
        }
        else if(arr1[i] > arr2[j]){
            j++;
        }
        else{
            System.out.println(arr1[i]);
            i++;
            j++;
        }
       }
    }
    public static void main(String[] args) {
        IntersectionOfTwoSortedArrays intersectionOfTwoSortedArrays = new IntersectionOfTwoSortedArrays();
        int[] arr1 = {1,3,3,5,7,9,9};
        int[] arr2 = {2,4,4,5,6,6,6,9};
        intersectionOfTwoSortedArrays.findIntersection(arr1, arr2);
    }
}
