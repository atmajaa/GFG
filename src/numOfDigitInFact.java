public class numOfDigitInFact {
    int noOfDigits(int n){
        int factorial = 1;
        int count = 0;
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }
        int temp = factorial;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
    return count;
    }
    public static void main(String[] args) {
        numOfDigitInFact numOfDigitInFact = new numOfDigitInFact();
        System.out.println(numOfDigitInFact.noOfDigits(5));
        
    }
}
