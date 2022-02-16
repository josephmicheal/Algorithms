package com.problem.solving;

public class StringPasswordValidator {

	public static void main(String[] args) {

		String str = "1" ; // length 4  3
		str = "Ab1";//3;//  1 stt.lenght = 3 6 > 3
		//str = "#HackerRank";//1;
		System.out.println(minimumNumber(str.length(),str));

	}

	public static int minimumNumber(int n, String str) {
	    // Return the minimum number of characters to make the password strong
	    
	    String specialChars = "!@#$%^&*()-+";
	        
	        int upper = 0;
	        int lower = 0;
	        int spec = 0;
	        int dig = 0;


	        for (int i = 0; i < str.length(); i++) {
	            if (Character.isUpperCase(str.charAt(i))) {
	                upper++;
	            } else if (Character.isLowerCase(str.charAt(i))) {
	                lower++;
	            }  else if (Character.isDigit(str.charAt(i))) {
	                dig++;
	            } else if (specialChars.contains(str.charAt(i) + "")) {
	                spec++;
	            }
	        }
	        
	        
	        
	        int chars = ((upper==0?1:0) + (lower==0?1:0) + (spec==0?1:0) + (dig==0?1:0));
	        
	        if(str.length() >= 6) 
	        	return chars;	        		        
	        else       
	        	return Math.max(chars,  (6 - str.length()));
	        	
	       // 7500	leng re = 2 miss 3 > 3
	       // Ab1     len = 3 miss 1 > 3
	       // 1       len 5 miss 3
	        	
	    }
	
}
