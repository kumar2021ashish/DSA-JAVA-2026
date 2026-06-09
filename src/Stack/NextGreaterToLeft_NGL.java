package Stack;

import java.util.*;

public class NextGreaterToLeft_NGL {
    public static void main(String[] args){
        int [] arr={1,3,2,4};
        int size=arr.length-1;
        List<Integer> result= nextGreaterElementToLeft(arr,size);
        System.out.println(result); // [-1, -1, 3, -1]
    }
    public static List<Integer> nextGreaterElementToLeft(int [] arr, int size){
        List<Integer> result= new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<=size;i++){

            // Case 1 : Stack is Empty
            if(stack.isEmpty()){
                result.add(-1);
            }

            //Case 2 : Stack top is greater
            if(!stack.isEmpty() && stack.peek() > arr[i]){
                result.add(stack.peek());
            }

            // Case 3: Stack top is smaller or equal
            if(!stack.isEmpty() && stack.peek() <= arr[i]){
                // Case 3a : Stack top is greater
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();

                }

                // Case 3b : Stack is empty
                if(stack.isEmpty()){
                    result.add(-1);
                }else{
                    result.add(stack.peek());
                }

            }

            stack.push(arr[i]);

        }
          return result;
         }
    }
