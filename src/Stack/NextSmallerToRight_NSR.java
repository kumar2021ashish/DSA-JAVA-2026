package Stack;

import java.util.*;

public class NextSmallerToRight_NSR {
    public static void main(String[] args){
        int [] arr={1,3,2,4};
        int size=arr.length-1;
        List<Integer> result= nextSmallerElementToRight(arr,size);
        System.out.println(result); // [-1, 2, -1, -1]
    }

    public static List<Integer> nextSmallerElementToRight(int [] arr, int size){
        List<Integer> result= new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=size;i>=0;i--){

            // Case 1: Stack is Empty
            if(stack.isEmpty()){
                result.add(-1);
            }

            // Case 2 : Stack top is smaller
            else if(!stack.isEmpty() && stack.peek()<arr[i]){
                result.add(stack.peek());

            }

            // Case 3: Stack top is greater or equal

            else if(!stack.empty() && stack.peek()>=arr[i]){
                // Case 3a: Stack top grater than arr[i]
                while (!stack.empty() && stack.peek()>=arr[i]){
                    stack.pop();
                }

                // Case 3b: Stack is Emtpy
                if(stack.empty()){
                    result.add(-1);
                }else{
                    result.add(stack.peek());
                }

            }

            stack.push(arr[i]);

        }

        Collections.reverse(result);
        return result;
    }
}
