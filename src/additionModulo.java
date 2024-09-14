public class additionModulo {
    int add(int num1, int num2, int mod){
        int sum = num1+ num2;
        sum = sum % mod;
        return sum;
    }
    public static void main(String[] args) {
        additionModulo additionModulo = new additionModulo();
        System.out.println(additionModulo.add(48,478, 10^9+7));
    }

}
