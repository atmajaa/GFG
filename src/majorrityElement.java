import java.util.*;
public class majorrityElement {
//By using hashmap
    int majority(int[] arr){
        //Key is the element and value is the frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(map.containsKey(element)){
                //Increment the frequency
                map.put(element, map.get(element)+1);
            }
            //If not present put it and frequesncy is 1
            else{
                map.put(element, 1);
            }
        }
        int max = 0;
        int saveKey = 0;
        int ans = 0;
        for(Integer key:map.keySet()){
            //Get values
            if(map.get(key)>max){
                saveKey = key;
                max=map.get(key);
            }
        }
        if(max > arr.length/2){
            ans = map.get(saveKey);
        }
        else{
            ans = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        majorrityElement me = new majorrityElement();
        int[] arr = {8,3,4,8,8};
        System.out.println(me.majority(arr));
    }
}
