package DynamicProgramming;

public class EqualSumPartition {

    public static void main(String[] args) {

        System.out.println("Equal Sum Partition");

        int[] arr = {1, 5, 11, 5};

        int n = arr.length;

        boolean result = equalSumPartition(arr, n);

        System.out.println(result);
    }

    public static boolean equalSumPartition(int[] arr, int n) {
        // Equal Sum Partition
//
// Total Sum = S
//
// We need:
//
// S1 = S2
//
// Therefore:
//
// S1 + S2 = S
//
// If S is odd
// Equal partition not possible
//
// If S is even
// Find subset having sum S/2
//
// Hence problem reduces to Subset Sum

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        // If total sum is odd
        // Equal partition is not possible

        if (sum % 2 != 0) {
            return false;
        }

        // If total sum is even
        // Problem reduces to Subset Sum(sum/2)

        return subsetSum(arr, sum / 2, n);
    }

    public static boolean subsetSum(int[] arr, int sum, int n) {

        boolean[][] t = new boolean[n + 1][sum + 1];


//              0   1   2   3   4   5 .... sum
//                --------------------------------
//        0      T   F   F   F   F   F
//        1      T
//        5      T
//       11      T
//        5      T


        // Initialization
        for (int i = 0; i < n + 1; i++) {

            for (int j = 0; j < sum + 1; j++) {

                if (i == 0) {

                    // No elements available
                    // Cannot form any positive sum

                    t[i][j] = false;
                }

                if (j == 0) {

                    // Sum = 0
                    // Empty subset always possible

                    t[i][j] = true;
                }
            }
        }

        // Choice Diagram
        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < sum + 1; j++) {

                // If current item can fit

                if (arr[i - 1] <= j) {

                    t[i][j] =
                            t[i - 1][j - arr[i - 1]] // include current item
                                    ||
                                    t[i - 1][j]; // exclude current item

                }

                // Current item cannot fit
                // Only option is to exclude it

                else if (arr[i - 1] > j) {

                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}