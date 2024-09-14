public class palindromeStringRecurssion {
    String s = "aabswbaa";
    boolean isPalindrome(int low, int high){
        if(low>=high){
            return true;
        }
        else if(s.charAt(high) != (s.charAt(low))){
            return false;
            }
        return isPalindrome(low+1, high-1);
    }
    public static void main(String[] args) {
        palindromeStringRecurssion ps = new palindromeStringRecurssion();
        System.out.println(ps.isPalindrome(0, ps.s.length()-1));
    }
}
