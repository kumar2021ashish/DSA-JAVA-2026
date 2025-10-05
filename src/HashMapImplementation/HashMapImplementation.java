package HashMapImplementation;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {
        System.out.println("HashMap Implementation :: ");

        Map<Integer,String> hmap = new HashMap<>();
        hmap.put(1,"Apple");
        hmap.put(2,"Orange");
        hmap.put(3,"Apple");
        hmap.put(4,"Grapes");
        hmap.put(5,"Banana");
        hmap.put(6,"Apple");
        hmap.put(7,"Apple");
        hmap.put(8,"Orange");
        hmap.put(9,"Orange");
        hmap.put(10,"Orange");
        hmap.put(11,"Banana");

        for(Map.Entry<Integer,String> e : hmap.entrySet()){
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println("Key :: "+key + " , " +"Value :: "+value);

        }

        // it will give hashmap all values
        //System.out.println(hmap.values());
        // it will give hashmap all Key
        //System.out.println(hmap.keySet());

        // try to print hashmap
        System.out.println(hmap);

        if(hmap.containsKey(11)){
            System.out.println("keyfound 11");
        }

        if(hmap.containsValue("Orange")){
            System.out.println("value found orange");
        }else{
            System.out.println("value not found orange");
        }


        Map<Integer,String> fruitMap = new HashMap<>();
        fruitMap.put(1,"Apple");
        fruitMap.put(2,"Orange");
        fruitMap.put(3,"Apple");
        fruitMap.put(4,"Grapes");
        fruitMap.put(5,"Banana");
        fruitMap.put(6,"Apple");
        fruitMap.put(7,"Apple");
        fruitMap.put(8,"Orange");
        fruitMap.put(9,"Orange");
        fruitMap.put(10,"Orange");
        fruitMap.put(11,"Banana");

        Map<String,Integer> freqMap = new HashMap<>();

        for(String fruit : fruitMap.values()){
            if(freqMap.containsKey(fruit)){
                freqMap.put(fruit,freqMap.get(fruit) +1 );
            }else{
                freqMap.put(fruit,1);
            }
        }

        System.out.println("Fruit Frequency Map :: "+ freqMap);




    }

}
