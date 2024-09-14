public class printdigitsRec {
    
   void print(int n){
    if(n == 0){
        return;
    }
    print(n-1);
    System.out.println(n);
   }
    public static void main(String[] args) {
        printdigitsRec p = new printdigitsRec();
        p.print(5);
    }
}
