package DynamicProgramming;

public class Knapsack_0_1_Recursive {
    public static void main(String[] args){
        System.out.println("Knapsack 0/1 Recursive Code");
        int[] wt = {1,3,4,5};
        int[] val= {1,4,5,7};
        int W = 7;
        int n = wt.length;
        int result = knapsack(wt, val, W, n);
        System.out.println("Maximum Profit :: " + result);
    }

    static int knapsack(int[] wt, int[] val, int W, int n){

        // Base Condition
        if(n==0 || W==0){
            return 0;
        }

        // Choice Diagram
        //If current item can fit into knapsack
        if(wt[n-1]<=W){

            return Math.max (
                    // Include current item
                    val[n-1] + knapsack(wt,val,W-wt[n-1],n-1),
                    // Exlude current item
                    knapsack(wt,val,W,n-1)
            );
        }

        // Current item cannot fit
        // Only  option is to exclude it
        else if (wt[n-1] > W){
            return knapsack(wt,val,W,n-1);
        }

        return -1;
    }
}
