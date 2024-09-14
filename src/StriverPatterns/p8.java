package StriverPatterns;

public class p8 {
    void printPattern(){
        for(int i=0; i<5; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            //star
            int numberOfStars = 9-2*i;
            for(int j=0; j<numberOfStars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p8 p8 = new p8();
        p8.printPattern();
    }
}
