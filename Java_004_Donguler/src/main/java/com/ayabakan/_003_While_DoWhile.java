package com.ayabakan;

public class _003_While_DoWhile {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("--------FOR---------");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		
		System.out.println("--------WHILE---------");
		int i = 0;
		while (i < 10) {
				
			System.out.println(i);	
			i++;
			
		}
		
		System.out.println("--------DO WHILE---------en az 1 kere calisir------");
		int j = 0;
		do {				
			System.out.println(j);	
			j++;
			
		} while (j < 3);
				
		
		/*
		System.out.println("--------WHILE SONSUZ ---------");
		int j = 0;
		while (true) {
				
			System.out.println(j);	
			j++;			
		}
		
				
		for (; ; ) {
			System.out.println("SonsuzDongu" );
			
		}
		*/
					
	}
	
}
