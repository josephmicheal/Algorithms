package com.array;

public class SpiralMatrix {

	 // Function print matrix in spiral form
    static void spiralPrint(int er, int ec, int a[][])
    {
        int sr = 0, sc = 0;
 
        /*  
        sr - starting row index
        er - ending row index
        sc - starting column index
        ec - ending column index
        */
 
        while (sr < er && sc < ec) {
            // Print the first row from the remaining rows
            for (int i = sc; i < ec; ++i) {
                System.out.print(a[sr][i] + " ");
            }
            sr++;
 
            // Print the last column from the remaining
            // columns
            for (int i = sr; i < er; ++i) {
                System.out.print(a[i][ec - 1] + " ");
            }
            ec--;
 
            // Print the last row from the remaining rows */
            if (sr < er) {
                for (int i = ec - 1; i >= sc; --i) {
                    System.out.print(a[er - 1][i] + " ");
                }
                er--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (sc < ec) {
                for (int i = er - 1; i >= sr; --i) {
                    System.out.print(a[i][sc] + " ");
                }
                sc++;
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                      { 7, 8, 9, 10, 11, 12 },
                      { 13, 14, 15, 16, 17, 18 } };
 
        // Function Call
        spiralPrint(a.length, a[0].length, a);
    }
}
