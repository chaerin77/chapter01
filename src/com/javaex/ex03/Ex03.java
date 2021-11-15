package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자:");
		
		int point = sc.nextInt();
		
		if(point>0) { //point가 0보다 큰애는 다 이 대괄호안으로들어와라 //point12일때 이줄실행후4.로 감
			System.out.println("양수");
		}else if(point<0){ //여기는 위에서 양수가 걸러지고 남은것들이 들어있음  -5 0 이런거
			    //둘 걸러야하니까 질문 한번 더해야함 0보다 작니? true가 나오는 애들이 들어가는 곳->음수들어갈곳
			System.out.println("음수"); 
		}else { //여기는 또 질문할 필요없이 0밖에없음
		    System.out.println("0");
		}
		sc.close(); //4.
	}

}
