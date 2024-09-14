public class count1s {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1};
        int low = 0;
        int high = arr.length-1;
        int first = -1;
        //Just find the first occurance and then subtract it with the length of the array
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == 1){
                high = mid-1; 
                first = mid;
            }
            else if(arr[mid]<1){
                low = mid + 1;
            }
        }
        if(first == -1){
            System.out.println("0");
        }
        else{
            System.out.println(arr.length-first);
        }
    }
}
