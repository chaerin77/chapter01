package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //switch case는 if else문의 모든 조건이 일치할때 사용 그거써볼랬는데 좀..모르겠음
		System.out.println("월을 입력하세요:");
		
		int month = sc.nextInt();
		
	/*	if(month==1 && month==5 && month==10 && month==12) {
			System.out.println("31일 입니다.");	
		}else if(month==2) {
			System.out.println("28일 입니다.");
		}else if(month==4 && month==6 && month==9 && month==11) {
			System.out.println("30일 입니다.");
		}  */
		
		
	/*	switch (month) {  이렇게쓰는게 좀더 일반적임
		case 1:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 3:
			System.out.println("31일");
			break;
		case 4:
			System.out.println("30일");
			break;
		case 5:
			System.out.println("31일");
			break;
			
		}  */
		
		switch (month) { //if else문에서 다 이퀄인애가 태생
			case 4:                   //4월/6/9/   만약6입력햇어 그럼 6,9를거쳐 11에서 찍히겠지 
			                          //문법 설명하기위해 설명한건데 뭐 이렇게 되는구나 정도는알아야함
			case 6:
			
			case 9:
				
			case 11:
				System.out.println("30일");
				break;
			case 2:
				System.out.println("28일");
				break;	
			default :
				System.out.println("31일");
				break;
			
		      //pdf파일 자료  --> 4->T  4랑6같니->F  ||로 계산해주면 T 2번째까지는T인거. 4랑9같니->F 2번째와3번째 || -> T  마지막것도 이렇게하면 T나옴 이거 이용해서 쓸수도있다.	  		 
		}
		
		sc.close();
		
	}

}
