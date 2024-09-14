import java.util.*;
public class Hashmaps {
    public static void main(String[] args) {
        //Contains key value pairs.
        //In Map elements are stored in sorted order
        HashMap <String, Integer> studentData = new HashMap<>();
        studentData.put("Atmaja", 148);
        studentData.put("Rohan", 88);
        studentData.put("Faraz", 7);
        System.out.println(studentData.get("Atmaja"));

        //Sets
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(5);
        System.out.println(set);
    }
    
}
