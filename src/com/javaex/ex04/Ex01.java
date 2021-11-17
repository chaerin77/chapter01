package com.javaex.ex04;

public class Ex01 {
    
	 public static void main(String[] args) {
		 
		 
		 //int tail = 0; java + 이자리에 tail 넣었었는데 지금경우는 i가 똑같은 역할하니까 tail 빼고 i넣었음
		 int i=0; //초기값  초기값 잘못맞추면 한번도 실행안될수도있음 증감식없으면 무한루프될수도있음
		 
		 while(i<5) {
		      //괄호안 i<5가 조건식	 
			 System.out.println("i like java" + i);
			 i++; //증감식
			 //tail++;
			 
		 //int tail = 3;  +tail   tail++; 이렇게 바꿔넣어서 tail이 3부터7까지 나오게 할수도있음	 
			 
		 } //줄 그때그때 맞추기
		 
		 
	 }
	 
}
