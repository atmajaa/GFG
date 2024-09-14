public class threeDivisors {
    int three(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        threeDivisors threeDivisors = new threeDivisors();
        System.out.println(threeDivisors.three(10));
    }
}
