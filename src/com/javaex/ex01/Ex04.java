package com.javaex.ex01;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//double pi = 3.14; //doubble pi 에 3.14넣을겨
		
		final double pi = 3.14; //doubble pi 앞에 final 써줬음
		
		System.out.println(pi);
		
		//pi = 5; //pi를 5로 바꾸려는 시도 잘나오긴하는데 5로못바꾸게해야할것같아
		//그럼 pi를 상수로 만들어야겠지  --> double 앞에 final 써주기
		//그러고 나니 얘가 오류남 왜냐 위에서 상수선언한거니까
		
		
		//final double PI = 3.14; 상수의 이름은 보통 대문자로써준다
		//System.out.println(PI);
		
		System.out.println(pi);
	}

}
