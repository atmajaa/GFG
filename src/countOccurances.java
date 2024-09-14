//For this problem if we start counting the number of occurances the time complexity becomes
//O(n). We need to achieve the solution in O(log(n)) time complexity
//To do so we will get the index of first occurance by performing binary search.
//Then, we will get the index of the last occurance. By using the formula last-first+1 we achieve our count with time complexity of O(log(n))
public class countOccurances {
    int occurances(int[] arr, int x){
        int first = firstOccurance(arr, x);
        if(first == -1){
            return 0;
        }
        int last = lastOccurance(arr, x);   
        return (last-first)+1;
    }
    int firstOccurance(int arr[], int x){
        int low=0;
        int high =arr.length-1;
        int first = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(x == arr[mid]){
                first = mid;
                high = mid - 1;//First high. First occurance. Searching towards the right side
            }
            else if(x>arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }
        int lastOccurance(int arr[], int x){
            int low=0;
            int high =arr.length-1;
            int last = -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(x == arr[mid]){
                    last = mid;
                    low = mid + 1;//Searching towards the left side
                }
                else if(x>arr[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
        }
        return last;
    }
    public static void main(String[] args) {
        countOccurances countOccurances = new countOccurances();
        int arr[] = {10,20,20,20,30,30,40,50,50};
        System.out.println(countOccurances.occurances(arr, 10));
        
    }
}
