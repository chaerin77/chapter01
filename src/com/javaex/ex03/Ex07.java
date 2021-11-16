package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		/*강사님 코드  //나는 &&써서 동시에 쓸 생각을 못했음 동시에 아예못쓰는줄..
		 if(point>=90) {
		     System.out.print("A등급");
		 }else if(90>point && point>=80){ //else if(90>point>=80) 자바는 이런 식으로 동시에 못씀 다르게써야함
		     //&&은 둘다 만족해야 true나옴   System.out.print("B등급");
		 }else if(80>point && point>=70){ //포인트가 80보다작고 70보다크거나같다 
		        System.out.println("C등급");
		 }else if(70>point && point>=60) {
		        System.out.println("D등급");
		 }else {
		        System.out.println("F등급");
		 }
		 */
		
		
		if(score>=90) {
			System.out.println("A등급");
		}else if(score>=80) {
			System.out.println("B등급");
		}else if(score>=70) {
			System.out.println("C등급");
		}else if(score>=60) {
			System.out.println("D등급");
		}else if(score<60) {
			System.out.println("F등급");
		}
		
		sc.close();
	}

}
