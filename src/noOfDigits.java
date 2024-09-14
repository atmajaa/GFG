import java.lang.Math;
public class noOfDigits {
    int countDigitsRegular(int n){
        int count = 0;
        while(n !=0 ){
            n = n/10;
            count++;
        }
        return count;
    }
    int countDigitsRecurssive(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigitsRecurssive(n/10);
    }
    int countDigitsLogarithmic(int n){
        return (int) Math.floor(Math.log10(n)+1);
    }
    public static void main(String[] args) {
        noOfDigits noOfDigits = new noOfDigits();
        System.out.println(noOfDigits.countDigitsRegular(4879));
        System.out.println(noOfDigits.countDigitsRegular(586301));
        System.out.println(noOfDigits.countDigitsLogarithmic(12));
    }
}

