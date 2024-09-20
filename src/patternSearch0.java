public class patternSearch0 {
    void patternSearching(String txt, String pat){
        int m = pat.length();
        int n = txt.length();
        for(int i=0; i<=n-m; i++){
            for(int j=0; j<m;j++){
                if(pat.charAt(j) != txt.charAt(i+j)){
                    break;
                }
                if(j==m-1){
                    System.out.println(i+ " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        patternSearch0 patternSearch0 = new patternSearch0();
        patternSearch0.patternSearching("ABAABBA", "BBA");
    }
}
