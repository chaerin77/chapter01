package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("코드를 입력하세요");
		
		int code = sc.nextInt();
		
		switch(code) {  //괄호안에 비교할값. 변수값을 넣어준다 ex사용자가 1입력하면 case ?의 값과 비교해주고 같으면 밑에꺼실행
			case 1:
		         System.out.println("101호입니다."); 
		         break;
			case 2:
				 System.out.println("201호입니다.");
				 break;
			case 3:
				 System.out.println("301호입니다.");
				 break;
			case 4:
				 System.out.println("401호입니다.");
				 break;
			default :
				 System.out.println("상담원"); //위에 해당안하는 나머지들
		         break;
		} 
		
		
		sc.close();
	}

}
