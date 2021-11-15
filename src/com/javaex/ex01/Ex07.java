package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[]args) {
		
		//대입연산자
		int a = 7; //무조건 오른쪽에있는걸 왼쪽에넣는것. 7을 a에넣는거
		int b = 2; //a와 7이 같단말이아니고 a에게 7을 대입한다는말임
		
		//int 3 = 2; -->안됨 변수이름에 숫자같은거 쓰면안됨 3 있는곳이 변수자리
		
		
		//산술연산자
		//System.out.println( ); sysout 써놓고 ctrl + 스페이스바 하면 자동완성~~
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		//양쪽 자료형이 같아야하고 결과값도 자료형이같아야 딱히 신경써줄게없음
		
		//얘는좀 다른녀석 
        System.out.println(a / b); // 3.5   몫3   나머지1   -->몫을 표시 정수/정수 했을때는 3만나오겠지
        
        //몫인 3말고 나머지가 필요할때가 있어 
        System.out.println(a % b); // 3.5   몫3   나머지1   -->나머지 표시
		
		//산술연산자 / % 자세히
        System.out.println("산술연산자 자세히");
        System.out.println(7.0/2.0); //3.5 이경우 답은 실수형으로 나와야함 실수나누기 실수니까
        System.out.println(7.0%2.0); //1.0 나머지는 여전히1이기땜시 
        
        //부호연산자
        System.out.println("부호연산자 자세히");
        int var = -3; //var pVar 이거 그냥 강사님이 정한 이름임
        int pVar = +var; // + (-3) 일케붙여준거. 이거해봤자 -3나옴
        int mVar = -var; // - (-3) 이거는 +3임~~ 
        
        
        System.out.println(pVar);    //   +(-3)
        System.out.println(mVar);    //   -(-3)
        
        
        
        //증감연산자--21.11.12
        System.out.println("증감연산자");
        System.out.println(a);     // a는 지금 7임
        System.out.println(++a);  //이 문장에서 해야하는일 (1)a를 1올린다-->7->8, (2)a를 출력한다 ->8
        System.out.println(a);     //++가 앞에 붙어있으므로 a를 1올리는걸 맨 처음해줘야함
        
        /*메모리에 있는 값을 올려서 출력하는걸까 가상의 8이란 값을 출력하는걸까
          7에서 8로 변했어 (원본을 변하게 한다) 그리고 출력하면 8이출력되지만 가상을출력한건지 원본출력인지 알수없지
          그거 확인하고 싶으면 원본이 변했으면 8로찍히고 안변했으면7로찍히겠지
          원본인7이 안변했는데 8을 가상으로 만들어서 출력해서 8이나온건지 궁금하잖아
          그럼 실험해보면 됨 어케 실험할지도 알아야함 a를 출력해봐야겠지
          System.out.println(a); 7이나오면 원본이 안바뀐거고 a가 8이 나오면 원본이 바뀐거
          결과값이 8이 나왔네 상자안에서 7->8로 바뀐다음에 출력된다는뜻이야 */
          
        System.out.println(b);   //2
        System.out.println(--b); //해야할일 정리  (1)b를 1내린다 , (2)b를 출력한다  - --가 앞에있으니까 얘먼저
        System.out.println(b);  //1 나옴 -> 원본이 바뀌었단얘기 상자안에서 2가1로 바뀐뒤 출력된거임

        System.out.println(a);  //8  a는8부터시작
        System.out.println(a++); //해야할일  a를 1 올린다  ,  a를 출력한다 ---> ++가 뒤에 있으므로 올리는건 맨 뒤에 해야한다
                                 //(1)a를 출력한다 (2)a를 1 올린다 이순서로 해야함
                                 // (1) -> 8이 나올것.  (2) 8 -->9 
        //+1을 시킬거지만 8을 먼저 출력하고 8을9로 바꾸겠다는 말이다 우린 출력된것만 볼수있으니까 테스트해봐야지 
        //아 (a++)까지만하고 실행하니까 8 나오는데 8을9로 바꾸겠다했지만 우리눈에 안보이는곳에서 바뀐거라 바뀐거 확인하려고 a를 찍어줌
        System.out.println(a);
        
        System.out.println(b);   //
        System.out.println(b--); // 할 일 -> (1)b를 출력한다  (2)b를 1내린다(--가뒤에있으니 이거맨뒤에 해야해서)
        System.out.println(b);
        
        
        
        
	}
	

}
