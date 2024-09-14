public class palindromeNumber {
    String checkPalindrome(int n){
        int temp = n;
        int reversed = 0;
        String isPalindrome = "";
        while(temp!=0){
            int lastDigit = temp%10;
            reversed = reversed*10+lastDigit;
            temp = temp/10;
        }
        if(n == reversed){
            isPalindrome = "YES";
        }
        else{
            isPalindrome = "NO";
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        palindromeNumber checkPalindrome = new palindromeNumber();
        System.out.println(checkPalindrome.checkPalindrome(145481));
    }
}
