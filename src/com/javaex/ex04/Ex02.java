package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int dan = sc.nextInt();

		int i = 0;
		while(i<9) {
			
			System.out.println(dan+" * "+i+" = "+dan*i); // + ->println의 기능. 문자열이랑숫자랑 붙여쓰기가능하게
			i++; //아 이거넣는거깜빡함 ㅋㅋ
			
		/*	i=i+1; + 랑 =중에 +먼저 해주거든 
			       그래서 i=1일때 이거 실행되면 1+1->2가되고 그걸 i에 대입하게되는거임 그래서 i가 2가되는것 
	
	        위아래 차이점 i++은 하나씩밖에 못올리는데 
		    경우에 따라 i를 3씩올리세요 5씩 올리세요 이럴수있어서
		    그럴때 i=i+5; 이걸로는 그걸 표현이 가능함   */
		}
		
/*		Scanner sc = new Scanner(System.in);   내가짠거.다쓰고서도 num만들었는데 어디써야하지 이러고있었음
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int num = sc.nextInt();
		
		int i = 1;  //i =0;  i<9 해도 될듯
		
		while(i<=9) {
            System.out.println("8 * "+i+" = "+8*i); 
            i++;
		}  */
		sc.close();
	}
}
