package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		
		int i=0; //비교할 정수 초기값 이 정수가 내가 원하는값이냐의 용도
		
		while(true) {
			
			i=i+1; //i++;
			
			
			if( i%6==0 && i%14==0) {  //6의 배수 이면서 14의 배수 입니까? yes--->숫자찍고 끝(반복문 탈출)
				System.out.println(i); //저 조건 만족하면 i를 출력해줘야함.
				break;   //이 탈출코드 없으면 무한 반복 돌아버림
				         //질문하고 아니면 계속 도는거 질문해서 저거 맞아 충족했어 그럼 { } 안으로 들어가서 braek;을 실행하니까 나가게되는거
			}
			System.out.println("aaaa"); //질문해서 아니야 충족안됐어 그럼 if의 {} 실행안하고 이거-"aaaa"까지 실행하고 다시 반복됨
		}                               //if조건을 만족해서 {}가실행되어 break을 만나면 는 밑에 뭐있어도 걍 나가버리는거. aaaa안찍고 나감
		
		
		
	}

}

