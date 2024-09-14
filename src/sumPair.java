public class sumPair {
    String pair(int[] arr, int target){
        String found = "NO";
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    found = "YES";
                    break;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        sumPair sp = new sumPair();
        int[] arr = {3,5,9,2,8,10,11};
        System.out.println(sp.pair(arr, 7));
        
    }
}
