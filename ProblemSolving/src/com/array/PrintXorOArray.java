package com.array;

public class PrintXorOArray {

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
        int counter = 2;
 
       while(sr < er && sc < ec) {
    	   
    	   int value = counter%2==0?0:1;
    	   
    	   //print first row
    	   for(int i= 0;i<ec;i++) {
    		   a[sr][i] = value;
    	   }
    	   sr++;
    	   
    	   //print last column
    	   for(int i= sr;i<er;i++) {
    		   a[i][ec-1]= value;
    		   sr++;
    	   }
    	   ec--;
    	   
    	   //print last row
    	   if(sr < er)
    	   for(int i= (ec-1);i>=sc;i--) {
    		   a[er-1][i] = value;
    	   }
    	   sr--;
    	   
    	   //print first column
    	   if(sc < ec)
    	   for(int i= sr-1;i<er && i>0;i--) {
    		   a[i][sc] = value;
    	   }
    	   sc--;
    	   sr++;
    	   
    	   counter++;
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
        
        for(int i =0;i < a.length;i++)
        	for(int j=0;j < a[i].length;j++)
        		System.out.println(a[i][j]);
        
    }
}
