package StriverPatterns;

public class p3 {
    void printPattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p3 p3 = new p3();
        p3.printPattern();
    }
}
