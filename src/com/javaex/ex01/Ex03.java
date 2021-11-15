package com.javaex.ex01;

public class Ex03 {
	
	public static void main(String[] args) {
    
	   char ch01 = 'A';  //한글자 밖에 못넣는다 세글자넣으면 오류남 글자 하나만 처리하는애. 문자-->코드값 저장
	   //char ch02 = '1'; 얘는 문자1 얘는 계산에는 못쓰겠지
	   //int ch02 = 1; 얘는 진짜 숫자1
	   
	   char ch02 = 65; //정수형(코드값)
	   
//	   메모리에 글자를넣을때 진짜 A를 갖다넣는게 아니라 문자표가 따로있다
//	   그 표에서 A를찾아서 이표에서 65에 해당되는게 A거든
//	   그래서 만약 char ch01 = 65; 이렇게쓴다면 이거에 해당하는게 A라서
//	   A가뜨긴함 저건 숫자65 출력하려는게아님 근데뭐 저렇게쓰는것보다 'A'이렇게 쓰는게 정석적임
	   System.out.println(ch01);	   
		
	
	   boolean b01 = true;
	   boolean b02 = false; //근데일케쓰는경우거의없음 예시보여줄게
	   
	   int a = 3;
	   int b = 5;
	   boolean result = a>b; //이결과값을 컴터가해줄거야 머가크거나작거나 이걸어디에담아야돼 어디에담을거냐면 result라는공간에 담을거야
	   
	   
	   System.out.println(b01);
	   System.out.println(result);
	   
	   char st = '안'; //똑같이 한글자 들어가지만 메모리쓰는방식이 다르다네 얘는 한글자만 출력되는애.
	   String str = "안";
	   String str2 = "안녕하세요";  //문자 긴거 표현해주는건 쌍따옴표! 여기서 한글자만 넣을거여도 쌍따옴표~
	   
	   
	   System.out.println(st);
	   System.out.println(str);
	   System.out.println(str2); 
	   
    }
}