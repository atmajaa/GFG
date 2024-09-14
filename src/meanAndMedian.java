public class meanAndMedian {
    int mean(){
        int arr[] = {1,78,58,36,46,96,78,7};
        int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i];
            }
            int mean = sum / arr.length;
            System.out.println("Mean - " + mean);
            return mean;
    }
    void median(){
        int arr[] = {45,74,63,25,59,10,5,36};
        int temp = 0, middle = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        if(arr.length % 2 != 0){
            middle = arr.length/2;
            System.out.println(arr[middle]);;
        }
        else if(arr.length % 2 == 0){
            middle = arr.length/2;
            System.out.println("Median - " + (arr[middle] + arr[middle - 1]) / 2);
        }
    }
    public static void main(String[] args) {
        
        meanAndMedian meanAndMedian = new meanAndMedian();
        meanAndMedian.mean();
        meanAndMedian.median();

    }
}
