package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
	
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 && -->깐깐하다    &&이는 깐깐해
		System.out.println("&&연산자");
		System.out.println(true&&true); //true    (3&&true) ("true"&&true) 이런건 잘못된거임 오른쪽꺼는 글자가되어버렷네 저렇게쓰면안됨
		System.out.println(true&&false); //false
		System.out.println(false&&true); //false
		System.out.println(false&&false); //false
		
		
		//&&연산자 응용
		System.out.println(a>b && a<b);  //식이온다. a>b가 t인지f인지 판단하고 a<b가 t인지f인지 판단하고 &&에서 t f 값 나올것임
		                                 // 5>7 -> f   5<7 -> t  ---> F&&T --> F
		                                 // 우리는 저 식까지 만들어아햠 
		System.out.println(a>b && a>b); // F&&F -> F
		
		
		
		
		//논리연산자 || --> 착하다 널널하다
		System.out.println("||연산자");
		System.out.println(true&&true); //true    
		System.out.println(true&&false); //true
		System.out.println(false&&true); //true
		System.out.println(false&&false); //false
		
		//||연산자 응용
		System.out.println("||연산자 응용");
		System.out.println( a>b || a<b ); // 5>7 F  5<7 T  F||T -->T 하나라도T면 T가 나오는~~
		
		
		//논리연산자 ! --> 반대
		System.out.println("!연산자");
		System.out.println(!true); //트루의 반대 라는뜻 --> false
		System.out.println(!false);
		
		System.out.println(a>b); //5>7 F
		System.out.println(!(a>b)); // F를 부정한다는뜻 -> T
		
		
		/*이거 결과값이 트루야 중간에 && 있고 옆에도 또 계산식있는데 결과가 트루야 이걸 &&로 계산하면 true나옴
		&&는 깐깐함 여기에 놓은게 다 맞아야 너는 맞는애 라고 취급해줌
		하나라도 false가 있다면 false가 나옴
		
		|| (or 논리 연산자인데 키보드서 뭘로 쳐야할지 모르겠네 -> 더블유돈표시 시프트누르고 치는거다~~)
		둘중 하나에 맞는애 true 가 있으면 true로 나오게해줘 */
		
		//한칸한칸 연산하는 비트연산 이거는 좀 특수한분야라 이런것들이 있다 라고 소개만한다는 포토샵..색..?
		
		
		
		//연산자 우선순위 예제 캡쳐 참고
        //4) 오른쪽에서 왼쪽으로 결합
		
		//콘솔출력: 어쩌고 println->  진짜프로그램은 클래스파일..요기있는클래스파일은 진짜 프로그램아님 이메모애매하다버릴까
        
	 
		
	}

}
