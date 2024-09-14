public class prime {
    String isPrime(int num){
        String isPrime = "";
        for(int i = 2; i*i<num; i++){
            if(num % i == 0){
                isPrime = "No";
            }
            else{
                isPrime = "Yes";
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        prime prime = new prime();
        System.out.println( prime.isPrime(72));
    }
}
