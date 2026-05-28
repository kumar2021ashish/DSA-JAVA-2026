package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfElement {
    public static void main(String[] args){
        System.out.println("Binary Search");
        int[] arr = {1,2,4,4,4,4,4,4,5,6,7,8,9,10};
        int element=4;
        int first =  FirstOccurence(arr,element);
        int last = LastOccurence(arr,element);
        int countOfElement= last-first+1;

        if(first == -1 || last == -1){
            System.out.println("element not found");
        }else{
            System.out.println("Count of an Element in a sorted array :: "+ countOfElement);
        }

    }

    // FirstOccurence
    public  static int FirstOccurence(int [] arr,int element){
        int start=0;
        int end=arr.length;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(element == arr[mid]){
                //return mid; --> Do not return mid immedieately
                // as it is first possibility of element to be this mid
                // but element will exist at left side for first occurence
                end=mid-1;
                res=mid;

            }else if(element<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return res;
    }

    // LastOccurence
    public  static int LastOccurence(int [] arr,int element){
        int start=0;
        int end=arr.length;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(element == arr[mid]){
                //return mid; --> Do not return mid immedieately
                // as it is first possibility of element to be this mid
                // but element will exist at right side for last occurence
                start=mid+1;
                res=mid;

            }else if(element<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return res;
    }

}
