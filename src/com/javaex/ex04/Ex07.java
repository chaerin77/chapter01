package com.javaex.ex04;

public class Ex07 {
	
	public static void main(String[] args) {
	/*	내가짠거
		for(int line = 1; line<=6; line++) {
			
			for(int star = 1; star<=5; star++) {
				System.out.print("*");
			}
			
			System.out.println("*");  //5개까지만찍고6개째에는 찍고 줄바꿈까지 끝나고 나면 두번째줄로 가게하는거라 여기에 println썼다
		}
		
		//*이 하나씩 반복되어 6번 출력후 줄을바꾸고 다시6번출력후 줄을바꾸고 줄이6줄이 될때까지만 반복한다. 
	        */
        
	  for(int y=1; y<=6; y++) {
		  
		  for(int x=1; x<=6; x++)  {//가로로 별출력 6개
			  System.out.print("*");
		  }
		  
		  System.out.println(""); //이게줄바꿈이래
	  }
		
	}
	
}
