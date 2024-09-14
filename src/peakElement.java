public class peakElement {
    int getPeakElement(int[] arr){
        int peak = -1;
        if(arr.length == 1){
            peak = arr[0];
            return peak;
        }
        if(arr[0] > arr[1]){
            peak = arr[0];
            return peak;
        }
        if(arr[arr.length - 1]>arr[arr.length-2]){
            peak = arr[arr.length-1];
            return peak;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                peak = arr[i];
                return peak;
            }
        }
        return peak;
    }
    public static void main(String[] args) {
        peakElement pk = new peakElement();
        int[] arr = {5,45,85,32,96,45,10};
        System.out.println(pk.getPeakElement(arr));
    }
}
