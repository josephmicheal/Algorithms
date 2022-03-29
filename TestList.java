package com.tried.off;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<List<Integer>> listofList =  Arrays.asList(
			    Arrays.asList(1, 2),
			    Arrays.asList(9)
			);
		
		System.out.println(listofList.stream().flatMap(ol -> ol.stream()).count());
	}

}
