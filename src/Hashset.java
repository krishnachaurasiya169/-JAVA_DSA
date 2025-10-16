
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {

//        declare HashSet or Creating hashset
//        isme integer store hoga
        HashSet<Integer> set=new HashSet<>();
//        insert elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(10);
        set.add(20);
        set.add(33);
        set.add(44);

//        search element
        if(set.contains(1)){
            System.out.println("set contain 1");
        }
//        delete element
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("no set not contain 1 ");
        }
        if(! set.contains(5)){
            System.out.println("set does not contain 5");
        }
//        size
        System.out.println("size of set is "+set.size());
//        print all element of set
        System.out.println(set);

//        iterate
//         Iterator it = set.iterator(); for loop me ek tarah se i=0 se start hota hai
//      for( Iterator it = set.iterator();it.hasNext();)
//           hasNext() ye check karega tb tk element ho waha tk chalega
          Iterator it = set.iterator();
      while(it.hasNext())
      {
           System.out.println(it.next());
       }
    }
}
