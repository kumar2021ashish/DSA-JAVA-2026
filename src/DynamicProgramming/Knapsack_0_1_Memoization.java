package DynamicProgramming;

import java.util.Arrays;

public class Knapsack_0_1_Memoization {
    static int[][] t = new int[1001][1001];

    public static int knapsack(int[] wt,int[] val,int W,int n){

        //Base Condition
        if(n==0 || W==0){
            return 0;
        }
        //Memoization Check
        if(t[n][W]!=-1){
            return t[n][W];
        }

        // Choice Diagram
        else if(wt[n-1]<=W){

            return t[n][W]= Math.max(val[n-1] + knapsack(wt,val,W-wt[n-1],n-1),
                    knapsack(wt,val,W,n-1)
            );
        }
        else if(wt[n-1]>W){
            return t[n][W]= knapsack(wt,val,W,n-1);
        }

            return -1;
    }

    public static void main(String[] args){
        System.out.println("Knapsack 0/1 Memoization Code");
        int[] wt = {1,3,4,5};
        int[] val= {1,4,5,7};
        int W = 7;
        int n = wt.length;
        for (int [] row : t){
            Arrays.fill(row,-1);
        }
        int result = knapsack(wt, val, W, n);
        System.out.println("Maximum Profit :: " + result);
    }


}
