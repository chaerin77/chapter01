package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		//6줄까지 있다. 첫째줄에 한번출력 둘째줄에 두번출력 셋째줄에 세번출력 음...줄의수가 출력의수랑 같게할수있나
	    
		for(int y=1; y<=6; y++) {
	    	
	    	for(int x=1; x<=y; x++) { 
	    		
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println("");
	    }
	     
	
		/*다른분 코드 이해가안감..
		String star ="*";  //어떤공간에별들어가있을거아녀 문자+문자는 뒤로붙음
			
		for(int y=1; y<=6; y++) {
			
			System.out.println(star);
			star = star + "*";
		} */
	}

}
