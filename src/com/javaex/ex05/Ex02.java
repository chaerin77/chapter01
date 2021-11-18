package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray=new int[5]; // 얘 찍었으니까 주소가 나올거임 그 주소를 어딘가에 담아놔야지 
				            // intArray에 0x333이든뭐든 주소가 들어가있음
				            // 맨앞에 int[] --> 따라가보면 int인아파트가 있을거야~~라는뜻
		intArray[0] = 3;  
		intArray[1] = 6; //두번째방에 6
		intArray[2] = 9;
		intArray[3] = 2; //네번째 방인데 방번호는3번 여기있는 값을 읽고싶다면?
		intArray[4] = 55;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);   //만약 이거 200개면 이렇게 손수 출력하기 너무 버거움 이거 for문으로 가능
		
		System.out.println("===============================");
		
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]); //i<5 여기 범위설정 잘해줘야함 만약 i<=5로 하면 [5]번방까지 출력되어야하는데 
			                                 //아파트 5번방까지 안만들어져있어서 에러나옴 
			                                 //int[] intArray=new int[5] 이게 5라고 5번방까지있는거아님 0번부터시작이라4번방까지있는거임
		}

	}

}
