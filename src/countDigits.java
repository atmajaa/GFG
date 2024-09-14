public class countDigits {
    int count(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        countDigits countDigits = new countDigits();
        System.out.println(countDigits.count(785627));
    }
}
