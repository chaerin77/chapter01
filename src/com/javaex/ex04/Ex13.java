package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 { //문법설명하려고 약간억지일수있지만 하는거

	public static void main(String[] args) { //어느영역이 반복인지 싸이클을 찾고 반복횟수가정해져있는지아닌지파악하고..
		
/*		Scanner sc = new Scanner(System.in);    
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		
		for(int i=1; i<=4; i++) { //i를 반복횟수라 생각했음
			int sum=0;
			
			int num = sc.nextInt();
			
			for(int sum=num;)
			sum=sum+num...
			
			System.out.println("합계:  "+num);
		
		}
				
		
		sc.close(); */
		
		Scanner sc = new Scanner(System.in);
		
		int num; //얘의 메모리에 잡은 공간은 맨밑에서 두번째의 } 가 끝나면 사라진다
	    int sum=0;	
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		
		
		do {//여기 안은 한번은 실행 되어야한다는 한번실행됐는데 0이야 그럼종료 한번실행됐는데 0이아니야 그럼 올라가야지
			
			num = sc.nextInt(); //숫자입력받고(메모리에 공간잡는거 아깐int num이었는데 맨위에 int num=0추가해줘서 얘는 이미있는거라 num으로씀) 
			sum = sum+num;     //이 { } 안에서 생긴 메모리가 }끝나면 없어진대 그래서 중간에서 쓰고 없어져도 괜찮은애들은 이렇게써도되는데 그게아니라면 여기 밖에다써놔야한다는
			System.out.println("합계: "+ num); //합계출력할거임  일단 이두줄이 싸이클임 반복될것
			
		}while(num !=0); //0이 아니면 계속 계산해라 여기서 계산은 do { 여기이부분   } 0이라면 밑으로가는거 ->종료
		
		
		
		System.out.println("종료");
		sc.close(); //처음에4를입력받았다쳐 담에5넣었어 근데 지금ㅁ5나옴 이 식이문제가있단거 그전에했던 4에 5를더해야하는데 그럼 그전에했던4를기억하고있는게있어야겠지
		
/*		do {  
			//얘는 들어오자마자 이거 다 함 뭐가되었든 무조건 하나는써주는
			//숫자를 입력받는다
			//합을 구한다
			//합계를 출력한다
		}while(); //입력받은숫자가 0이아니면...  ()안에 조건이 충족되면, true면 저 위에있는것들{}안에있는것들 다시 해준다네 진행방향이 좀 특이함
		*/
		
		
/*방법3		while(true) { 이런식으로 해결하는게 좀더 쉬운..?
				num = sc.nextInt();
				sum = sum+num;
				System.out.println("합계: "+ sum);
			
				if(num==0) { //num이 0이면 끝  --> while 문을 나가라 그만해라 -> break
					break;
				}
		
			}
			System.out.println("종료");
	   		sc.close();  */
	} 
	
	
	
}

//질문오고 똑같은 사이클 반복될건데 얼마나 반복될건지 모르니까 while문 온거라는

