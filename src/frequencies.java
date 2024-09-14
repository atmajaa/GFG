public class frequencies {
    void frequenciesInSortedArr(){
        int[] arr = {10,10,0,30,40,40,50};
        int freq = 1;
        for(int i=1; i<arr.length; i++){
            while(arr[i-1] == arr[i]){
                freq++;
            }
           System.out.println(arr[i-1] + " " + freq);
           freq = 1;
        }

    }
}
