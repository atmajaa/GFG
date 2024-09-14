public class lcmNaive {
    int lcm(int num1, int num2){
        int lcm = 0;
        int max = Math.max(num1, num2);
        int temp = max;
        int min = Math.min(num1, num2);
        if(max % min == 0){
            lcm = max;
        }
        else{
            while (temp % min != 0) {
                temp += max;
                lcm = temp;
            }
        }
        return lcm;
    }
    public static void main(String[] args) {
        lcmNaive lcmNaive = new lcmNaive();
        System.out.println(lcmNaive.lcm(45,150 ));
    }
}
