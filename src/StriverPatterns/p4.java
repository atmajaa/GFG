package StriverPatterns;

public class p4 {
    void printPattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p4 p4 = new p4();
        p4.printPattern();
    }
}
