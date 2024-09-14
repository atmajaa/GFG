public class trailingZeros {
    int trailingZerosFact(int n){
        int res = 0;
        for(int i=5; i<n; i= i*5){
            res = res + n/i;
        }
        return res;
    }
    public static void main(String[] args) {
        trailingZeros trailingZeros = new trailingZeros();
        System.out.println(trailingZeros.trailingZerosFact(251));
        
    }
     
}
