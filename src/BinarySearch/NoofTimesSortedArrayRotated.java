package BinarySearch;

public class NoofTimesSortedArrayRotated {
    public static void main(String[] args){

        int[] arr={11,12,15,18,2,5,6,8};
        int n = arr.length;
        int result = SortedArrayRotated(arr,n);
        System.out.println("No of times a sorted array is rotated :: "+result);

    }

    public  static int SortedArrayRotated(int[] arr, int n){
     int start=0;
     int end=n-1;
     while (start<=end){
         int mid=start+(end-start)/2;
         int next=(mid+1)%n;
         int previous=(mid+n-1)%n;

        if (arr[mid] <= arr[previous] && arr[mid] <= arr[next]) {
            return mid;
        }else if(arr[end] <= arr[mid]){
            start= mid+1;
        }else{
            end= mid-1;
        }

     }

        return -1;

    }
}
