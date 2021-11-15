package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time<=8) {
			int money = time*10000;
			System.out.println("임금은 "+ money + " 입니다.");
		}else if(time>8) {
			int moneyover = 80000+(time-8)*12000;
			System.out.println("임금은 "+ moneyover + " 입니다.");
		}
		
		
		sc.close();
		
	}

}
