//Optimized solution to find the Greatest Common Divisor using the Euclidean method.
//Basic Idea :-
//Let b be smaller than a
//Then, gcd(a,b) = gcd(a-b,b)
public class GCDOptimized {
  int euclidean(int num1, int num2){
    while(num1 != num2){
        if(num1>num2){
            num1 = num1-num2;//It will reduce num1 and when the condition is not met it will go to the else block
        }
        else{
            num2 = num2-num1; //It will take the value of num1 from the if condition if it is true.
        }
    //Stops when num1 and num2 becomes equal
    }
    return num1;//can return any number
  }  
  public static void main(String[] args) {
    GCDOptimized GCDOptimized = new GCDOptimized();
    System.out.println(GCDOptimized.euclidean(45,12));
    
  }
}

