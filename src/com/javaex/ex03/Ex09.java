package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("과목을 선택하세요");
	    System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
	    System.out.print("과목번호: ");
	    
	    int subnum = sc.nextInt();
	    
	    if (subnum==1) {   //이런식으로 if else로 해결되지만 얘네가 모두 ==이면 switch-case조건문 사용가능 -ex10
	    	System.out.println("R101호");
	    }else if (subnum==2) {
	    	System.out.println("R202호");
	    }else if (subnum==3) {
	    	System.out.println("R303호");
	    }else if (subnum==4) {
	    	System.out.println("R404호");
	    }else {
	    	System.out.println("상담원에게 문의하세요");
	    }
	    
		
		
	    sc.close();
	}

}
