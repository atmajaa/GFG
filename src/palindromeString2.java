public class palindromeString2{
    boolean checkIfPalindrome(String s){
        String s2 = "";
        for(int i= s.length()-1; i>=0; i--){
            s2 += s.charAt(i);
        }
        if(s.equals(s2)){
            return true;
        }
        return false;
    }
    boolean checkIfPalindrome2(String s){
        //without using extra space
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        palindromeString2 p2 = new palindromeString2();
        palindromeString2 p3 = new palindromeString2();
        System.out.println(p2.checkIfPalindrome("ABBA"));
        System.out.println(p3.checkIfPalindrome("ABCCBA"));
    }
}
