package StriverPatterns;

public class p1 {
    void printPattern(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p1 p1 = new p1();
        p1.printPattern();
    }
}
