package com.javaex.ex02;

import java.util.Scanner; //scanner는 import 해줘야함 단축키 --> ctrl shifh 알파벳o

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //System.in을 키보드라고 생각하기 메모리에 올려라 이 키보드이름을 sc라고 부를거야 임의로 별명을준거야 앞에서했던것처럼
		                                      //키보드에 입력한 값을 읽을 수 있는것
		System.out.println("숫자를 입력하세요"); //화면에 숫자입력하라는거 보일거임
		int num = sc.nextInt();            //여기에 사용자가 입력한 숫자 담을거야 키보드에 있어(sc) 정수형을받을거야. 실수형,문자형 쓰면 오류남
		                                   //사용자가 화면에 입력한 값 알아내 라는 뜻 nextInt
		System.out.println("입력하신 숫자는 " + num + "입니다.");
			
		sc.close(); //닫아주는거. 키보드랑 연결이 끊기는거. 끝에쯤에 이렇게 클로즈 해주는게 좋다.
		
	}

}
