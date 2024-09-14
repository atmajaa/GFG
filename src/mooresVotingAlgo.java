public class mooresVotingAlgo {
    //Finding the majority element by using Moore's voting algorithm
    public static void main(String[] args) {
        int[] arr  = {8,8,2,5,8,8,8,6,8,6,8,8,9,6};
        int element = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == element){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                element = arr[i];
                //Since we put a new element so it has one count
                count = 1;
            }
        }
        //Check if it is an actual majority element
        //Because we don't get the actual count so it might cause error in the further code
        count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == element){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("Majority element is " + element);
        }
        else{
            System.out.println("No majority element");
        }
    }
    
}
