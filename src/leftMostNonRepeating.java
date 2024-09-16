public class leftMostNonRepeating {
    int nonRepeating(String str){
        int CHAR = 256;
        int[] count = new int[CHAR];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int i=0; i<str.length();i++){
            if(count[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        leftMostNonRepeating leftMostNonRepeating = new leftMostNonRepeating();
        System.out.println(leftMostNonRepeating.nonRepeating("geeksForgeeks"));
    }
}
