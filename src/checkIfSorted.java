public class checkIfSorted {
    //NAIVE METHOD
    int arr[] = {1,7,4,4};
    boolean isSorted(){
       for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[i]){
                return false;
            }
        }
       }
       return true;
    }
    boolean isSortedEfficient(){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        checkIfSorted checkIfSorted = new checkIfSorted();
        System.out.println(checkIfSorted.isSorted());
        System.out.println(checkIfSorted.isSortedEfficient());
    }
}
