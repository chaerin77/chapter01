package com.javaex.ex05;

public class Ex05 {
	
	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		
		int[] arrB = new int[3];
		
		for(int i=0; i<arrA.length;i++) { //b랑a랑 방3개 숫자같아서 그냥 a써줬음
		    arrB[i] = arrA[i];
		    
		 /* arrB[0] = arrA[0]; //A를 B에 대입
			arrB[1] = arrA[1];
			arrB[2] = arrA[2];  */
		}
		
		//arrB[1] 값 변경 원래6이었는데 100으로 A=369 B=3 100 9
		 arrB[1]=100;
		 
		 for(int i =0; i<arrA.length; i++) {
				
				System.out.println(arrA[i]);
			}
			
		 for(int i =0; i<arrB.length; i++) {
				
				System.out.println(arrB[i]);
			}	
		
		
		
		
	    
		System.out.println("----------------------");
		
		
		for(int i =0; i<arrA.length; i++) {
			
			System.out.println(arrA[i]);
		}
		
		for(int i =0; i<arrB.length; i++) {
			
			System.out.println(arrB[i]);
		}	
	}

}
