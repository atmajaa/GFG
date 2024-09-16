import java.util.Arrays;

public class Anagram {
    boolean checkIfAnagram(String str1, String str2){
        int[] arr1 = new int[str1.length()];
        int[] arr2 = new int[str2.length()];
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            arr1[i] = (int)str1.charAt(i);
            arr2[i] = (int)str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    boolean checkIfAnagramEfficient(String s1, String s2){
        int CHAR = 256;
        int count[] = new int[CHAR];
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i<CHAR;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.checkIfAnagram("apple", "ppale"));
        Anagram anagram2 = new Anagram();
        System.out.println(anagram2.checkIfAnagramEfficient("Hope", "Hope"));
    }
}
