package com.tried.off;

public class ProductSellingCost30PercentageProductsInitialCostAbove50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] =  {100, 120, 30, 40, 80};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>50) {
				System.out.print((arr[i]-(arr[i]*30)/100)+" ");
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
