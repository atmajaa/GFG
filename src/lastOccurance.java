public class lastOccurance {
    int lastOcc(int arr[], int low, int high, int x){
        int result = -1;
        while(low<=high){
           int mid = (low + high)/2;
           if(arr[mid] == x ){
            low = mid + 1;
            result = mid;
           }
           else if(arr[mid] < x){
            low = mid + 1;
           }
           else{
            high = mid - 1;
           }
        }
        return result;
    }
    public static void main(String[] args) {
        lastOccurance lc = new lastOccurance();
        int[] arr = {10,20,20,20,20,30,30};
        System.out.println(lc.lastOcc(arr, 0, arr.length-1, 20));
    }
}
