public class ropeCutting {
    int aCount = 1, bCount = 1, cCount = 1;
    int max(int n, int a, int b, int c){
    //Can't form pairs for odd nums
        if(n%2 != 0){
            if(a%2 != 0 && b%2 != 0 && c%2 != 0){
                return -1;
            }
        }
        //Till how many iterations of A, B and C
            for(int i=0; i*a<=n; i++){
                aCount = i;
            }
            for(int i=0; i*b<=n; i++){
                bCount = i;
                
            }
            for(int i=0; i*c<=n; i++){
                cCount = i;
               
            }
        int max = Math.max(aCount, Math.max(bCount, cCount));
        return max;
    }
    public static void main(String[] args) {
        ropeCutting r = new ropeCutting();
        System.out.println(r.max(9, 2, 2, 2));
    }
}
