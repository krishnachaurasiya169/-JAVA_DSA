
import java.util.*;

public class majorityEle {

    public static void majotityElelment(int nums[]){
   HashMap<Integer,Integer> map=new HashMap<>();
int n=nums.length;
for(int i=0;i<n;i++){
    if(map.containsKey(nums[i])){
     map.put(nums[i],map.get(nums[i])+1);
    } else {
        map.put(nums[i],1);
    }
}
  for(int key: map.keySet()){
      if(map.get(key)>n/3){
          System.out.println(key);
      }
  }

    }


    public static void main(String[] args) {
//        majority elemet 2
        int[] nums={1,2,3,4,4,5,3,2,2,2};
majotityElelment(nums);

    }

}
