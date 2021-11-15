package com.javaex.ex02;

import java.util.Scanner; //Scanner쓸때 꼭 넣어줄것 ctrl shift o 

public class Ex04 {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in); //사용자가 입력하는 기능을 만들어야한다 -> Scanner사용해야한다는뜻 	
                                            // new Scanner(System.in); 스캐너를 메모리에 올려야해 올리려면 공간을 정해줘야지. 별명정하는거. 그래서 임의로 sc라고 정해줌.
       System.out.println("이름을 입력해주세요");

       System.out.print("이름:");  //입력 내용이 옆에 붙도록 하기 위해서ln이 아니라 print 썼음
       //String name = String
	   String name = sc.nextLine(); //이름은 문자라서 문자를 담기 위해 String 자료형 사용, 담길 공간인 name을 임의로 설정 후 이름 받는 기능 이미 설정되어있는것인 sc.nextLine이거사용	 사용자가 입력한 값이 뭔지 알아오는 애
	   
	   System.out.println("나이를 입력해주세요");
	 
	   System.out.print("나이:"); ///엥 버그 있음 숫자를 먼저 받고 문자열을 받으면 두번째꺼 안기다리고 첫번째꺼 바로 출려되어버린대  같은코드인데 나이를 맨위에 올리고 엔터.실행했더니 버그나네 바로 님나이몇살일케뜨네
	                             
	   int age = sc.nextInt(); //나이. 정수니까 int , sc.nextInt사용 나이 입력후 엔터치면 age에 내가 입력한 나이값이 들어가고..
	   
	   
	   /*System.out.println("키를 입력해주세요");
	  
	   System.out.print("키:"); 
	   double d = sc.nextDouble();  */
	   
	   System.out.println("당신의 이름은 " +name+ " 나이는" + age + " 입니다."); 
	   
	   
	   sc.close(); //아 이거 넣는거깜빡 맨첨에 쓸때 써주고 가운데다가 짜야겠다
		
	}
}
