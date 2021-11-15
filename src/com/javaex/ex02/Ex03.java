package com.javaex.ex02;

import java.util.Scanner; //ctrl shift o

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //우리눈에안보이지만 이 정보를 메모리로 올릴겨 그래서 별명sc지어줌
		
		System.out.println("이름을 입력해 주세요");//이거 출력하세요
		System.out.print("이름:"); //아까 아침에 했던거 이거쓰면 줄바꿈안함 커서가 :바로 옆에있음
		
		String name = sc.nextLine(); //이름: 이거 출력된후 사용자가 입력한 문자가 여기에 담겼어
		
		System.out.println("당신의 이름은 "+ name + " 입니다");
		
		
		sc.close();
		
		
		
		
		
		
	}

}
