package com.javaex.ex04;

public class Ex06 {
	
	public static void main(String[] args) {
		
		/*dan이 2부터시작해서 9까지 반복하는애라고 생각,  오른쪽에 곱해주는수가 1~9까지반복되니 걔를i라 생각
		  그래서 첨부터 int dan=2;  int i =1; 썼었는데 for문에선 한꺼번에 쓸수있으니깐
		  for에다가 넣어줬다 */
		
		
		for(int dan=2; dan<=9 ; dan++) {
			
			for(int i =1; i<=9 ; i++) {
				System.out.println(dan+ " * " +i+" = "+dan*i);
			}//sysout 저거 처음에 dan*i "=" + dan*1이렇게 짰다가 내머릿속에서만 저게 당연한거라 컴퓨터가 알아먹게 문자는문자로 다시 제대로 표시해줬음
		}
		
	}

}

//단이 반복되고 *뒤에있는애도 반복됨   2~9까지 크게반복하는애랑  2가3이되기전에 1~9로변하는애가있어
