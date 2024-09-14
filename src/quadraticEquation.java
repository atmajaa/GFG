public class quadraticEquation {
    void roots(double a, double b,double c){
        double firstRoot,secondRoot;
        double det = (b*b)-4*(a*c);
        if(det>0){
            firstRoot = (-b + Math.sqrt(det))/(2*a);
            secondRoot = (-b - Math.sqrt(det) / (2*a));
            System.out.println("First root - " + firstRoot + " Second root - " + secondRoot);
        }
        else if(det == 0){
            firstRoot = secondRoot = (-b / (2 * a));
            System.out.println("First root - " + firstRoot + " Second root - " + secondRoot);
        }
        else if(det < 0){
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-det)/(2*a);
            System.out.println("First root - " + real + "Second root - " + imaginary);

        }
    }
    public static void main(String[] args) {
        quadraticEquation quadraticEquation = new quadraticEquation();
        quadraticEquation.roots(4,-4,1);
    }
}
