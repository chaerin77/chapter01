package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];  //int아파트 ,  메모리올리기 -힙영역에 생기게됨
	    
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		
		int[] arrB = arrA; //new 안했으니까 네모공간 안생겼음 arrA의 값3을 갖고오고싶은데 그 실마리는 주소에 있고 그래서 arrA의 주소 복사할것
		
		
		
		arrB[1] = 10000; //실험 arrB수 바꾸고 출력 둘이 주소 같으니까 같은값나올것
		
		
		
		for(int i=0; i<arrA.length; i++) {
			
			System.out.println(arrA[i]);
		}   
		
		
		for(int i=0; i<arrB.length; i++) {
			
			System.out.println(arrB[i]);
		}
		
	}

}
