public class palindromeString {
    void isPalindrome(String s){
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    s1.append(s);
    s2 = s1.reverse();
    if(s2.toString().equals(s)){
        System.out.println("It is a palindrome");
    }
    else{
        System.out.println("Its not a palindrome");
    }
    }
    public static void main(String[] args) {
        palindromeString p = new palindromeString();
        p.isPalindrome("aazbbaa");
    }
}
