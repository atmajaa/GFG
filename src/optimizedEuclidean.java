public class optimizedEuclidean {
    int Optimized(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        else{
            return Optimized(num2,num1%num2);
        }
    }
    public static void main(String[] args) {
        optimizedEuclidean optimizedEuclidean = new optimizedEuclidean();
        System.out.println(optimizedEuclidean.Optimized(45,100));
    }
        
}
