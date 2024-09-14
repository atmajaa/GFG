public class sumPairSortedArray {
    boolean findPair(int[] arr, int n, int x){
        int left = 0;
        int right = n-1;
        boolean found = false;
       while(left<right){
            if(arr[left] + arr[right] == x){
                found = true;
                return found;
            }
            else if(arr[left] + arr[right] > x){
                right--;
            }
            else if(arr[left] + arr[right] < x){
                left++;
            }
            
        }
        return found;
    }
    public static void main(String[] args) {
        sumPairSortedArray sp = new sumPairSortedArray();
        int[] arr = {2,3,4,8,9,20,40};
        System.out.println(sp.findPair(arr, 7, 88));
    }
}
