package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchCode {
    public static void main(String[] args){
        System.out.println("Binary Search");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int element=4;
        int result =  BinarySearch(arr,element);

        if(result==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index :: "+result);
        }

    }

    public  static int BinarySearch(int [] arr,int element){
        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(element == arr[mid]){
                return mid;
            }else if(element<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }

}
