package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			
			System.out.println("숫자를 입력하세요");
			int num=sc.nextInt();
			
			if(num==0) {  //0인지 아닌지판단먼저. 조건이 맞으면 탈출할거임
			     System.out.println("종료");
			     break;
			}else if(num%3==0) {
				System.out.println("3의 배수 입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
			
		}
		
		
		/* 내가짠거
  		int num = sc.nextInt();
 
		
		while(true) {
			
			if(num%3==0) {
				
				System.out.println("3의 배수입니다.");
			}else if(num%3 !=0){
				System.out.println("3의 배수가 아닙니다.");
			}else if(num%3==0 && num==0) {
				System.out.println("종료");
			}
			break;
		}   */
		
		
		
		
		sc.close();
	}
	
}
