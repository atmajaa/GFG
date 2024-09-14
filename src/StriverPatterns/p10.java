package StriverPatterns;

public class p10 {
    void printPattern(){
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p10 p10 = new p10();
        p10.printPattern();
    }
}
