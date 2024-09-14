class sumOfseries {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        long sum = 0L;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
        sumOfseries sum = new sumOfseries();
        sum.seriesSum(10);
    }
}