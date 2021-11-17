package com.javaex.ex04;

public class Ex04 {
  
	public static void main(String[] args) {
		
		//합을구하려면 일단 1~10까지를 모두 더해줘야함 num을 지정하고 걔가1~10까지증가할때 각 숫자일때마다 더해지게끔 만들면
		
		
		/*for(int num=1; num<=10; num++) {
			
			 //많이잘못됨 짜다가포기
			System.out.println("1부터 10까지의 정수의 합은 "+ num+(num+1) +" 입니다.");
		} */
		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			
			sum = sum + i;
		
		}
		//반복문 다 돌고 마지막 sum에서 출력해야함
		System.out.println("1부터 10까지의 정수의 합은 " + sum + " 입니다." );
	}
}

