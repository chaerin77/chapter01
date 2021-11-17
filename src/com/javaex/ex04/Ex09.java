package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		
		int i=0; //비교할 정수 초기값 이 정수가 내가 원하는값이냐의 용도
		
		while(true) {
			
			i=i+1; //i++;
			
			
			if( i%6==0 && i%14==0) {  //6의 배수 이면서 14의 배수 입니까? yes--->숫자찍고 끝(반복문 탈출)
				System.out.println(i); //저 조건 만족하면 i를 출력해줘야함.
				break;   //이 탈출코드 없으면 무한 반복 돌아버림
			}
			
		}
		
		
		
	}

}
