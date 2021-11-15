package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt(); //설계도 맨위네모칸임
		
		if(num>=60) { //num이, 입력받은값이 60보다 크거나같니?
			//true일때만
			System.out.println("합격입니다.");
		}else {	
			//false일때만
			System.out.println("불합격입니다."); //여기까지만 썼더니(else{}없음) num>=60일때 불합격입니다도 출력되어버림
			//합격인 경우엔 합격만나와야하고 불합격인경우엔 불합격만 나와야함 ->문법 else
		}
		
		System.out.println("프로그램 종료"); //여기는 공통으로 처리될부분
		sc.close();
	}

}
