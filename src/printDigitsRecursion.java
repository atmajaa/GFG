public class printDigitsRecursion {
    void printNums(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNums(n-1);
    }
    
    public static void main(String[] args){
        printDigitsRecursion printDigitsRecursion = new printDigitsRecursion();
        printDigitsRecursion.printNums(10);
    }
}
