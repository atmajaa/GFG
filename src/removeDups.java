public class removeDups {
    int remDups(int arr[], int n){
        int temp[] = new int[n];
        temp[0] = arr[0];
        int counter=1;
        for(int i=1;i<n;i++){
            //SEE IF IT IS SAME AS THE LAST COPIED ELEMENT
            if(temp[counter-1] != arr[i]){
                temp[counter] = arr[i];
                counter++;
            }
        }
        for(int i=0; i<counter; i++){
            arr[i] = temp[i];
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] array = {10,20,30,30,40};
        removeDups removeDups = new removeDups();
        System.out.println(removeDups.remDups(array, 5));
    }
}
