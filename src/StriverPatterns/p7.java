package StriverPatterns;

public class p7 {
    void printPattern(){
        for(int i=5; i>0; i--){
        //space
        for(int j=i-1; j>0; j--){
            System.out.print("  ");
        }
        //star
        int numberOfStars = 11 - 2 * i; 
        for(int j=1; j<=numberOfStars; j++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        p7 p7 = new p7();
        p7.printPattern();
    }
}
