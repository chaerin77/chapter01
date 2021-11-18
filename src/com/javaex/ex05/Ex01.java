package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		int n01 = (int)(Math.random()*45)+1;		
		int n02 = (int)(Math.random()*45)+1;		
		int n03 = (int)(Math.random()*45)+1;		
		int n04 = (int)(Math.random()*45)+1;	
		int n05 = (int)(Math.random()*45)+1;		
		int n06 = (int)(Math.random()*45)+1;
/*
		
		System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);
		System.out.println(n06);  */
		
/*		for(int i=0; i<6; i++) {
			
			System.out.println(n0+(i+1)); //이름의 일부분 여기서string해서 머시기하면 걔는 공간의이름 n01이아니라 글자n01임
			                              //배열쓸것임 아파트이름짓기    */
		
		int[]ball= new int[6]; //int[]아파트~~ 이름은 ball  int ball ->단독주택 // new int[6];아파트,개수 
		                       //여기까지 짠건 공간만 넣은거
		
		for(int i=0; i<6; i++) {
			ball[i] = ((int)(Math.random()*45))+1;
		}
		
		ball[0] = (int)(Math.random()*45)+1; //아파트의 몇호실 무조건0부터시작 
		ball[1] = (int)(Math.random()*45)+1;
		ball[2] = (int)(Math.random()*45)+1;
		ball[3] = (int)(Math.random()*45)+1;
		ball[4] = (int)(Math.random()*45)+1;
		ball[5] = (int)(Math.random()*45)+1;
		
		for(int i=0; i<6; i++) {
			
			System.out.println(ball[i]); //6번돌면서 출력할건데 [0][1][2] 일케..근데 여러개6개출력하고싶잖아 그래서 i넣어줌 
		}
				
				
		//Scanner sc = new Scanner //메모리에 올려~~라는뜻으로 썼던것처럼 배열도 써줘야함	-> new int	
			
		}






	}


