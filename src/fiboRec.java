public class fiboRec {
    int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        fiboRec f = new fiboRec();
        System.out.println(f.fibonacci(7));
    }
}
