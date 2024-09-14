public class missingNumbers {
    int missing(int[] arr, int n){
        n = arr.length;
        int missing = -1;
        int count = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] != count){
                missing = i;
                return missing;
            }
            count++;
        }
        return missing;
    }
    public static void main(String[] args) {
        missingNumbers mn = new missingNumbers();
        int[] arr = {1,2,4,5};
        System.out.println(mn.missing(arr, arr.length));
    }
}
