public class firstOccurance {
    public static void main(String[] args) {
        int arr[] = {5,5,5};
        int low = 0;
        int high = arr.length-1;
        int target = 5;
        int res = -1;
        while(low<=high){
            int mid = (high+low)/2;
            if(target == arr[mid]){
                res = mid;
                high = mid -1;
            }
            else if(target>arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(res);
    }
}
