
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
       HashMap<String,Integer> map=new HashMap<>();

//       insert the value in map
        map.put("china",23);
        map.put("india",234);
        map.put("russia",54);
        map.put("usa",544);
        System.out.println(map);

//        update the value
        map.put("china",130);
        System.out.println(map);


//        search key
        if(map.containsKey("usa")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }

        System.out.println(map.get("china"));

//
//        int[]arr={1,2,3,4};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//        for(int val:arr){
//            System.out.print(val);
//        }
//        System.out.println();


//iterate hashmap
        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        only key contain
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key);
        }


    }
}
