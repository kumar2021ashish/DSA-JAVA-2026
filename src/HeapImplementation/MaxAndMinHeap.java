package HeapImplementation;

import java.util.*;

public class MaxAndMinHeap {
    public static void main(String[] args){
        System.out.println("Max and Min Heap Implementation");

        List<Integer> list1 = Arrays.asList(7,10,4,3,20,15);

        //Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        System.out.println("List :: "+ list1);

        for(Integer li : list1){
            minHeap.add(li);
        }


        System.out.println("Min Heap :: "+ minHeap);
        // Peek Operation return top element in Min Heap
        System.out.println("Min Heap top element :: "+ minHeap.peek());
        System.out.println("Min Heap Size :: "+ minHeap.size());
        System.out.println("Removing element from Min Heap removed Element");
        while (minHeap.size()>0){
            System.out.println(minHeap.poll());
        }



        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        List<Integer> list2 = Arrays.asList(7,10,4,3,20,15);

        for(Integer li : list2){
            maxHeap.add(li);
        }

        System.out.println("Max Heap :: "+ maxHeap);
        // Peek Operation return top element in Max Heap
        System.out.println("Max Heap top element :: "+ maxHeap.peek());
        System.out.println("Max Heap Size :: "+ maxHeap.size());
        System.out.println("Removing element from Max Heap removed Element");

        // Remove elements from Heap
        for(int i=0 ; i<=maxHeap.size();i++){  // We cant do like this beacuse heap size always dynamically changes if we have to do using for loop then first store original size of heap then use it in for loop
            System.out.println(maxHeap.poll());

        }

        // Removing elements from heap using While loop
        while (!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }



    }
}
