public class leadersInAnArray {
    //O(n^2)
    void findLeaders(){
        int[] arr = {10,8,7,6,3,4};
        Boolean flag = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length-1]);

    }
    //O(n)
    void findLeadersEfficient(){
        int[] arr = {0,12,30,17,4,15};
        int currentLeader = arr[arr.length-1];
        System.out.println(currentLeader);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > currentLeader){
                currentLeader = arr[i];
                System.out.println(currentLeader);
            }
        }
    }
    public static void main(String[] args) {
        leadersInAnArray leadersInAnArray = new leadersInAnArray();
        leadersInAnArray.findLeaders();
        System.out.println("Efficient solution");
        leadersInAnArray.findLeadersEfficient();
    }
}
