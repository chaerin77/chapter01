package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num>0) {  //양수부터 골라내겠단 소리
			
			if(num%2 ==0) {  //num이 짝수니 하고 물어본거. 짝수는 2로나누면 나머지가2니까 짝수를 저렇게 표현한것
				System.out.print("짝수");	
			}else if(num%2 == 1) { //여기서도 굳이 홀수니 하고 물어볼필요없었음 짝아니면홀이니까 else만써도 되는..
				System.out.print("홀수");
			}
			    // num%2==0   --> "짝수"출력
		}else if(num<0) { //양수가 아닌애들중에 조건. num이 0보다 작니???
			System.out.print("음수");
		}else if(num==0) {   //그냥 else만 써도 됨
			System.out.print("0");
		}
		
        System.out.println("입니다.");
		sc.close();
	}

}
