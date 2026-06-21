package DynamicProgramming;

public class CountSubsetSum {

    public static void main(String[] args) {

        System.out.println("Count Subset Sum");

        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        int n = arr.length;

        int result = countSubsetSum(arr, sum, n);

        System.out.println(result);
    }

    public static int countSubsetSum(int[] arr, int sum, int n) {

        int[][] t = new int[n + 1][sum + 1];


//              0   1   2   3   4   5 .... sum
//                --------------------------------
//        0      1   0   0   0   0   0
//        2      1
//        3      1
//        5      1
//        6      1


        // Initialization
        for (int i = 0; i < n + 1; i++) {

            for (int j = 0; j < sum + 1; j++) {

                if (i == 0) {

                    // No elements available
                    // Number of ways to form positive sum = 0

                    t[i][j] = 0;
                }

                if (j == 0) {

                    // Empty subset always possible
                    // Number of ways = 1

                    t[i][j] = 1;
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
                                    +
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
