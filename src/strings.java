public class strings {
    public static void main(String[] args) {
        //4 ways to create a string in Java
        //1.Character array
        char[] arr = {'a','t','m','a','j','a'};
        //2. String class
        String name = "Atmaja";
        //3. String Buffer Class
        //Not suitable for multi threaded programs
        StringBuffer str = new StringBuffer("Atmaja");
        //4. String Builder Class
        //Suitable for multi threaded programs
        StringBuilder stb = new StringBuilder("Pitale");
        //Only String class is immutable. String Buffer and String Builder are mutable.

        //String Functions
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.substring(0, 4));

    }
}
