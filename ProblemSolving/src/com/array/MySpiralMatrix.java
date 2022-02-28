package com.array;

public class MySpiralMatrix {

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
 
       while(sr < er && sc < ec) {
    	   
    	   //print first row
    	   for(int i= sc;i<ec;i++) {
    		   System.out.print(a[sr][i]+" ");
    	   }
    	   sr++;
    	   
    	   //print last column
    	   for(int i= sr;i<er;i++) {
    		   System.out.print(a[i][ec-1]+" ");
    	   }
    	   ec--;
    	   
    	   //print last row
    	   if(sr < er)
    	   for(int i= (ec-1);i>=sc;i--) {
    		   System.out.print(a[er-1][i]+" ");
    		   er--;
    	   }
    	   
    	   //print first column
    	   if(sc < ec) {
    	   for(int i= sr-1;i<er && i>0;i--) {
    		   System.out.print(a[i][sc]+" ");
    	   }
    	   sc++;
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
                      { 13, 14, 15, 16, 17, 18 },
                      { 19, 20, 21, 22, 23, 24 }};
 
        // Function Call
        spiralPrint(a.length, a[0].length, a);
    }
}
