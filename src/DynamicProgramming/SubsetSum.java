package DynamicProgramming;

public class SubsetSum {
    public static void main(String[] args){
        System.out.println("Subset Sum");
        int[] arr ={2,3,7,8,10};
        int n= arr.length;
        int sum = 11;
        boolean  result = subsetSum(arr , sum , n);
        System.out.println(result);
    }

    public static  boolean subsetSum(int[] arr,int sum, int n){
        boolean[][] t= new boolean[n+1][sum+1];

//              0   1   2   3   4   5 .... 11
//                --------------------------------
//        0      T   F   F   F   F   F      F
//        2      T
//        3      T
//        7      T
//        8      T

        // Initilization
        for (int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    // If array size is 0, we cannot form any positive sum therefore first row = false
                    t[i][j]=false;
                }
                if(j==0){
                    // If required sum is 0, empty subset is always possible therefore first column = true
                    t[i][j]=true;
                }
            }
        }


        // Choice Diagram
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){

                //If current item can fit into knapsack
                if(arr[i-1]<=j){
                    t[i][j]= t[i-1][j-arr[i-1]] // include current item
                                ||
                             t[i-1][j]; // exclude current item
                }
                // Current item cannot fit
                // Only  option is to exclude it
                else if ( arr [i-1]>j){
                    t[i][j]=t[i-1][j]; //exclude current item

                }

            }
        }

        return t[n][sum];
    }
}