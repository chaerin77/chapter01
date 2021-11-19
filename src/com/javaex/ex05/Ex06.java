package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arrA = new int[] {10,20,30};
		int[] arrB = new int[] {10,20,30};
		
		if(arrA.length == arrB.length) {//배열의 크기가 같니?
			
			//각방의 값이 같은가 검사 a[0] b[0] a[1]b[1] a[2]b[2]비교, 반복이라for써줌
			for(int i=0; i<arrA.length;i++) {
				if(arrA[i]!=arrB[i]) {
					System.out.println(i + " 번째 값이 다릅니다.");
				}
			}
			
		}else { //배열의 크기가 다른경우 
			System.out.println("배열의 크기가 다릅니다.");
		}
		
	}

}
