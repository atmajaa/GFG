package StriverPatterns;

public class p9 {
    void printPattern(){
        for(int i=5; i>0; i--){
            //space
            for(int j=i-1; j>0; j--){
                System.out.print("  ");
            }
            //stars
            int numberOfStars = 11-2*i;
            for(int j=1; j<=numberOfStars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<5; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            //stars
            int numberOfStars = 9-2*i;
            for(int j=1; j<=numberOfStars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p9 p9 = new p9();
        p9.printPattern();
    }
}
