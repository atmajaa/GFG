public class sortedRotated {
    int searchInSorted(int[] arr, int low, int high, int x){
        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == x) {
                return mid;
            }

            // Check if the left side is sorted
            if(arr[low] <= arr[mid]) {
                if(x >= arr[low] && x < arr[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            } 
            // Otherwise, the right side must be sorted
            else {
                if(x > arr[mid] && x <= arr[high]) {
                    low = mid + 1; // Search in the right half
                } else {
                    high = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        sortedRotated sr = new sortedRotated();
        int[] arr = {100, 200, 300, 500, 1000, 2000, 10, 20};
        System.out.println(sr.searchInSorted(arr, 0, arr.length - 1, 200)); // Output should be 1
    }
}
