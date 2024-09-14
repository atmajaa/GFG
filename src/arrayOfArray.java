public class arrayOfArray{
   static int[][] arr = {{1,2},{3,4}};
    public static void main(String[] args) {
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
        System.out.println(arr[0][1]);
    }
}