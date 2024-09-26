public class merge {
    // Merge function of Merge Sort
    void mergeFun(int arr[]) {
        int low = 0;
        int mid = arr.length / 2;
        int high = arr.length - 1;

        // Define sizes of the two halves
        int a[] = new int[mid - low + 1];
        int b[] = new int[high - mid];

        // Copy elements into first half (array a)
        int i = 0;
        while (i < a.length) {
            a[i] = arr[low + i];
            i++;
        }

        // Copy elements into second half (array b)
        int j = 0;
        while (j < b.length) {
            b[j] = arr[mid + 1 + j];  // Adjusted to start from mid + 1
            j++;
        }

        // Merging arrays a[] and b[] back into arr[]
        int k = 0;  // Pointer for merged array
        i = 0;  // Reset pointer for a[]
        j = 0;  // Reset pointer for b[]

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from a[]
        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements from b[]
        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }

        // Print the merged array
        int x = 0;
        while (x < arr.length) {
            System.out.println(arr[x]);
            x++;
        }
    }

    public static void main(String[] args) {
        merge merge = new merge();
        int arr[] = {10, 15, 20, 40, 8, 11, 55};
        merge.mergeFun(arr);
    }
}
