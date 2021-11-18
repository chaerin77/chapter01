package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) { //1~20까지에서 조건맞는거 출력할거니까 이줄쓰고 밑에 sysout 써줬음
			
			if(i%2==0 || i%3==0) { //2의배수,3의배수일때 제외가 되려면 continue를만나야 밑에꺼 실행안하고 바로 i++시키니까
				                   //continue를썼는데 if ( 여기 ) 여기를 만족해야 {continue}실행을해서sysout 실행이 안되니까
				continue;          //여기 에다가 2의배수와 3의배수인 조건을 넣었는데 처음에 &&넣었다가 안나와서 보니까
				                   //이거는 2의배수이면서3의배수인게 아니고 2의배수도 out 3의배수도out이라
				                   //둘중 하나만 만족해도 찍으면 안되는거라서 ||쓰는거임 or임
			}
			
			System.out.println(i);
		}
	}

}
