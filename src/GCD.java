//Greatest common divisor
public class GCD{
    int gcd(int num1, int num2){
        int gcd = 0;
        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);
        if(max%min == 0){
            gcd = min;
        }
        else{
            for(int i=min-1; i>=1; i--){
                if(max%i == 0 && min%i == 0){
                    gcd = i;
                    break;//Important to break or else it will run till 1 and return 1
                }
            }
        }
       return gcd;
    }
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(10,25));
    }
}