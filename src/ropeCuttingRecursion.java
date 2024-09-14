public class ropeCuttingRecursion {
    int max(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        int res = Math.max(Math.max(max(n - a, a, b, c), max(n - b, a, b, c)), max(n - c, a, b, c));
        if (res == -1)
        return -1;

        return res + 1;
    }
    public static void main(String[] args) {
        ropeCuttingRecursion  r = new ropeCuttingRecursion();
        System.out.println(r.max(9,2,2,2));
    }
}
