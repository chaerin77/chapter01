package com.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		double var01;
		
		var01 = 3.14;
		
		//double var01 = 3.14;

		float var02 = 3.14F;
		//float은 무조건 소수숫자 뒤에 f를붙여줘야함 대소문자상관없음
		
		System.out.println(var01);
		System.out.println(var02);
		
		
//		double형으로 공간을 잡을거구 바로 3.14를넣어줄거야
//		그다음 시나리오는 float형으로 공간잡고 3.14넣어준거
//		차이점은 double이 훨씬 공간이 넓다는거+더 정확한숫자가들어간다
		
		double var03 = 0.1234567890123456789;
		float var04 = 0.1234567890123456789f;
		
		System.out.println(var03);
		System.out.println(var04);
		
		//04가 나오는값이 더 적네
		
		
		
		
    }

}	