package StriverPatterns;

public class p5 {
    void printPattern(){
        for(int i=5; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p5 p5 = new p5();
        p5.printPattern();
    }
    
}

