public class sumOfNumsRecursion {
    int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        sumOfNumsRecursion sumOfNumsRecursion = new sumOfNumsRecursion();
        System.out.println(sumOfNumsRecursion.sum(5));
    }
}
