import java.util.*;
public class ticketkaroute
{

    public static String getStart(HashMap<String,String> tick) {

        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tick.keySet())
        {
            String value = tick.get(key);
            revMap.put(value, key);
        }
        for (String key : tick.keySet())
        {
            if (!revMap.containsKey(key))
            {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        HashMap<String,String> orignal=new HashMap<>();
        orignal.put("chennai","benguluru");
        orignal.put("mumbai","delhi");
        orignal.put("goa","chennai");
        orignal.put("delhi","goa");
// ab tick me orignal wale hashmap data store ho gya hai
//        ab jo bhi hai wo tick me operation perform hoga
        String start=getStart(orignal);
        while (orignal.containsKey(start))
        {
            System.out.print(start+"->");
            start= orignal.get(start);
        }
        System.out.println(start);
    }
}
