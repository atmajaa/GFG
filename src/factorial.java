public class factorial {
    int findFactorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        factorial factorial = new factorial();
        System.out.println(factorial.findFactorial(5));
    }
}
