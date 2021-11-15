package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();  //오른쪽거가 입력된값이란뜻. 정수일테니저렇게씀
		
		if(num>=60) { //입력한 값이" 60점 이상"이니? 답이 true,false 나오는 질문만 할 수 있다.
			//괄호안의 질문이 true 일때만 대괄호 안이 실행된다.
		    System.out.println("합격입니다."); //이제얘는 내려가고끝
			
		/* 다시실행. num이 만약 52야 그건 60보다 작으니까 false 나올거
		 { } 만 뛰어넘음 넘어와서 할게없음 얘도그냥나옴 이 상황은 그냥 나오는상황이라그렇지
		 밖에 뭔가 짜야할때도 있다. */
 		    
		} 
		
		
		sc.close();
	}

}
