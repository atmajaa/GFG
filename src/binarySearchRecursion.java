public class binarySearchRecursion {
    int binarySearch(int arr[], int low, int high, int x){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(x == arr[mid]){
            return mid;
        }
        else if(x>arr[mid]){
            return binarySearch(arr, mid+1, high, x);
        }
        else{
            return binarySearch(arr, low, mid-1, x);
        }
        
    }
    public static void main(String[] args) {
        binarySearchRecursion binarySearchRecursion = new binarySearchRecursion();
        int arr[] = {10,20,40,50,60};
        System.out.println(binarySearchRecursion.binarySearch(arr, 0, arr.length-1,50));
        
    }
}
