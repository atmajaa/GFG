import java.util.Arrays;

public class equalArrays{

public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        if(Arrays.equals(A, B)){
            System.out.println("yes");
        }
        return true;
    } 
    
public static void main(String[] args) {
    equalArrays eq = new equalArrays();
       long A[] = {1L,2L,5L,4L,0L};
       long B[] = {2L, 4L, 5L, 0L, 1L};
       check(A, B, 5);
       
}
}