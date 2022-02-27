package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeAlternatively {

	public static void main(String[] args) {

		int a[] = {-8, -9, -2, 6, 4};
		
		List<Integer> positiveList = Arrays.stream(a).mapToObj(Integer::valueOf)
				.filter(item -> item >= 0).collect(Collectors.toList());
		
		List<Integer> negativeList = Arrays.stream(a).mapToObj(Integer::valueOf)
				.filter(item -> item < 0).collect(Collectors.toList());
		
		int indexP=0,indexN = 0;
		
		
		for(int i = 0;i < a.length;i++) {			
			if(i%2 == 1 && indexP < positiveList.size()) {
				a[i]=positiveList.get(indexP++);
			}else {
				a[i]=negativeList.get(indexN++);
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
