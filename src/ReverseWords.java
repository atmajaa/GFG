public class ReverseWords {
    String Reverse(String s){
        String rev = "";
        String words[] = s.split(" ");
        for(int i=words.length-1; i>=0; i--){
            rev += words[i];
            if(i != 0){
                rev += " ";
            }
        }
        
        return rev;
    }
    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.Reverse("I love Maths"));
    }
}
