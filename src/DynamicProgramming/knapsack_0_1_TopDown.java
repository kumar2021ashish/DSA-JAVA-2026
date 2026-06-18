package DynamicProgramming;

import java.util.Arrays;

public class knapsack_0_1_TopDown {
//    One-line conversion to remember
//    knapsack(wt,val,W,n-1)
//            ↓
//    t[i-1][j]
//
//    knapsack(wt,val,W-wt[n-1],n-1)
//            ↓
//    t[i-1][j-wt[i-1]]


    public static void main(String[] args){
        System.out.println("Knapsack 0/1 TopDown Code");
        int[] wt = {1,3,4,5};
        int[] val= {1,4,5,7};
        int W = 7;
        int n = wt.length;
        int result = knapsack(wt, val, W, n);
        System.out.println("Maximum Profit :: " + result);
    }

    public static int knapsack(int[] wt,int[] val,int W,int n){
        int[][] t= new int[n+1][W+1];

        // Initialization
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0 ){
                    t[i][j]=0;
                }
            }
        }
//        Choice Diagram of Memoization Code
//        else if(wt[n-1]<=W){
//
//            return t[n][W]= Math.max(val[n-1] + knapsack(wt,val,W-wt[n-1],n-1),
//                    knapsack(wt,val,W,n-1)
//            );
//        }
//        else if(wt[n-1]>W){
//            return t[n][W]= knapsack(wt,val,W,n-1);
//        }

        // Tips Final Mapping : val[n-1]-> val[i-1] , wt[n-1]-> wt[i-1] , knapsack(wt,val,W,n-1)-> t[i-1][j] ,
        // knapsack(wt,val,W-wt[n-1],n-1)-> t[i-1][j-wt[i-1]] , So n-1-> i-1 and W->j


        // Choice Diagram
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){

                if(wt[i-1]<=j){
                    t[i][j]= Math.max(val[i-1] + t[i-1][j-wt[i-1]],
                            t[i-1][j]

                    );
                }
                else if(wt[i-1]>j){
                    t[i][j]=t[i-1][j];
                }
            }
        }


        return t[n][W];
    }


    }
