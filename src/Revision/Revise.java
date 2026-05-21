package Revision;

import javax.swing.*;
import java.util.*;

public class Revise {

    public static void main(String[] args){
        System.out.println("Revision HashMap Implementation :: ");

        System.out.println("Frequency count of elements in String :: ");

        // 1 : Frequency count of elements in String
        String s = "my name is ashish kumar kumar and it is my official name";

        Map<String , Integer> freqMap = new HashMap<>();

        for(String word : s.split(" ")){

            freqMap.put(word , freqMap.getOrDefault(word , 0)+1);

        }

        System.out.println(freqMap);


        // 2 : Frequency count of elements in arraylist
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("apple");
        list.add("grapes");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        System.out.println("Frequency count of elements in ArrayList :: ");
        Map<String , Integer> fruitMap = new LinkedHashMap<>();
        for(String word : list){
            fruitMap.put(word , fruitMap.getOrDefault(word , 0)+1);
        }

        System.out.println(fruitMap);

        System.out.println("Sorting HashMap using Priority Queue MinHeap :: ");

        //Min Heap
       PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>((a,b)->a.getValue() - b.getValue());

        // Add map enteries into min heap
        minHeap.addAll(fruitMap.entrySet());

        // Pop sorted by ascending frequency
        while (!minHeap.isEmpty()){
            Map.Entry<String, Integer> e = minHeap.poll();
            System.out.println(e.getKey()+ " --->  "+ e.getValue());
        }

        System.out.println("Sorting HashMap using Priority Queue Maxeap :: ");
        // Max Heap
        PriorityQueue<Map.Entry<String,Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());
        // Add map enteries into max heap
        maxHeap.addAll(fruitMap.entrySet());
        // Pop sorted by descending frequency
        while (!maxHeap.isEmpty()){
            Map.Entry<String, Integer> e = maxHeap.poll();
            System.out.println(e.getKey()+ " --->  "+ e.getValue());
        }


        // 3: Find First Non-Repeating Character
        String str = "abcabcdefghabc";

        Map<Character , Integer> hmap = new LinkedHashMap<>();

        for (char c : str.toCharArray()){
            hmap.put(c, hmap.getOrDefault(c,0)+1);
        }
         System.out.println(hmap);

        for(Map.Entry<Character , Integer> map : hmap.entrySet()){

            if(map.getValue() == 1){
                System.out.println(" First Non-Repeating Character :: "+ map.getKey());
                break;
            }
        }

        // 4: Find Duplicate elements in a array
        int [] arr = {1,2,3,4,5,6,7,8,8,8,8,8,9,1,2,3,5,6,7,8,10};
        Map<Integer,Integer> freq = new HashMap<>();

        for(int n : arr){
            freq.put(n , freq.getOrDefault(n,0)+1);
        }
         System.out.println(freq);

        for(Map.Entry<Integer,Integer> map : freq.entrySet()){
            if(map.getValue() > 1){
                System.out.print(" Duplicate element :: "+ map.getKey());
            }
        }


    }

}
