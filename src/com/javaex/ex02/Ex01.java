package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//print() println() 차이점
		System.out.print("안녕"); //줄바꿈없음 안녕 프린트한 뒤에 커서가 안녕바로뒤에 있는거임
		System.out.println("하세요"); //줄바꿈있음 하세요출력후 한줄 내려가있으라함 그래서 얘는 커서가 한줄밑에있음
		System.out.println("안녕하세요");
		System.out.println("=========================");
		
		//println() 사용법
		int i = 2345;
		double d = 3.14;   //d(변수)라는 곳에3.14 넣어줄겨
		String str = "굿모닝";  //String 쓸때 쌍따옴표~~ 얘는 나머지 기본자료형이랑 구조가 다르다~
		char c = '한';
		String s = "한";
		String name = " 손채린 ";
		
		System.out.println("안녕하세요"); 
		System.out.println(str);  //괄호안에변수를 쓰면 변수의 값이 출력된다 꼭 괄호안에 변수로 쓸필요 없다 못쓰는 경우도 많다
		System.out.println(i);    //2345
		System.out.println(d);    //3.14
		
		System.out.println(str+str); //굿모닝굿모닝  이렇게 붙어서 나옴 수학에서 없는개념 문자열끼리 더할수있다 println에서는 된다
		System.out.println(str+i);  //굿모닝2345  얘도 붙네 뒤에있는애 문자로 취급하는.
		System.out.println(str+d);  //굿모닝3.14  다붙는구나 
		System.out.println(str+c);  //굿모닝한  문자열이 있으면 뒤에다 그냥 붙여버리네
		
		System.out.println(d+str); //3.14굿모닝  문자열이 하나라도 있으면 다 문자취급해주는거!
		
		//굿모닝 이랑 2345
		String r = " 이랑 ";
		System.out.println(str+r+i); //아 이렇게안해도 할수있는법이있었음 밑에꺼
		System.out.println(str+" 이랑 "+i);
		
		System.out.println(i+i); //4690 얘는 계산이되네(2345+2345)
		System.out.println(i+d); //2318.14 자동형변환 된거임 i 정수가 실수로 변형되고 둘의 자료형이 실수로 동일하니까 더하기가되어 나온값이 실수인거
		System.out.println(i-i); //우리가 알고있는 수학관련 기호들은 다 쓸수있다
		System.out.println(i*i);
		
		System.out.println(c+c); //109240  -->char는 코드값을 갖고있잖아 우리가 한을 쓰려고 저기에 c쓴거였는데 c에코드값이 있어서 몇인진모르지만 저렇게 숫자로나온거
		System.out.println(c+s); //한한  --> 여기서는 문자열+숫자 이런느낌임 그..문자열 하나라도 있으면 다 문자로붙여서써준거  
		//char는 많이 안쓰지만 이정도는 알고 넘어가면될듯~
		
		System.out.println("제이름은"+name+"입니다.");
		System.out.println("안녕'하'세요"); // 안녕'하'세요
		System.out.println("안녕\"하\"세요"); //안녕"하"세요  \" 이게 한글자임
		System.out.println("안녕\\하\\세요"); // 안녕\하\세요
		System.out.println("안녕\t하세요"); // 안녕  하세요  일정간격 벌리는거
		System.out.println("안녕\n하세요");  //안녕 줄바꿈 하세요 이렇게쓰고싶은거
		
	}
}
