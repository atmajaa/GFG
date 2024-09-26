public class mergeTwoSortedArrays {
    void merge(int a[], int b[]){
        int aCounter = 0;
        int bCounter = 0;
        while(aCounter < a.length && bCounter < b.length){
            if(a[aCounter] < b[bCounter]){
                System.out.print(a[aCounter]+" ");
                aCounter++;
            }
            else{
                System.out.print(b[bCounter] +" ");
                bCounter++;
            }
        }
        if(aCounter != a.length){
            for(int i=aCounter; i<a.length; i++){
                System.out.print(a[aCounter]+" ");
            }
        }
        else{
            for(int i=bCounter; i<b.length; i++){
                System.out.print(b[bCounter]+" ");
            }
        }
    }
    public static void main(String[] args) {
        mergeTwoSortedArrays mergeTwoSortedArrays = new mergeTwoSortedArrays();
        int a[] = {3,5,7,8,10};
        int b[] = {5,8,10,12};
        mergeTwoSortedArrays.merge(a, b);
    }
}
