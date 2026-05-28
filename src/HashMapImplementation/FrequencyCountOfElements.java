package HashMapImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCountOfElements {
    public static void main(String[] args){
        // Basic operation
        List<String> li=new ArrayList<>();
        li.add("Apple");
        li.add("Orange");
        li.add("Grapes");
        li.add("Mango");
        li.add("Banana");
        li.add("Banana");
        li.add("Apple");
        li.add("Mango");

        HashMap<String,Integer> newMap = new HashMap<>();
        System.out.println(newMap);

        for(String fruit: li){
            newMap.put(fruit,newMap.getOrDefault(fruit,0)+1);
        }
      //  System.out.println(newMap);

        for (Map.Entry<String,Integer> entry: newMap.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }



    }
}
