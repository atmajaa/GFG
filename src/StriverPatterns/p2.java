package StriverPatterns;

public class p2 {
    void printPattern(){
        for(int i=0;i<5;i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p2 p2 = new p2();
        p2.printPattern();
    }
}
