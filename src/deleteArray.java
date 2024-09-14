import java.util.Scanner;
public class deleteArray {
    Scanner scanner = new Scanner(System.in);
    int arr[] = {10,75,64,36,64};
    void delete(){
        System.out.println("The array elements are - ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element position you want to delete");
        int del = scanner.nextInt();
        if(del <= 0 || del >= arr.length){
            System.out.println("Incorrect position");
        }
        for(int i=del-1; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println("After deletion");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        deleteArray deleteArray = new deleteArray();
        deleteArray.delete();
    }
}
