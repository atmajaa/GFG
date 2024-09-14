public class factorialRecursion {
    int fact = 1;
    int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);

    }
    public static void main(String[] args) {
        factorialRecursion factorialRecursion = new factorialRecursion();
        System.out.println(factorialRecursion.factorial(5));
    }
}
