package com.javaex.ex01; /*패키지 경로 */

public class Ex01/*얘랑 파일이름이랑 동일해야함 아예기본으로 이렇게만들어주는데 만약 바꾼다면
파일명도 똑같이 바꿔줘야함 */{
	
	/*프로그램시작하려면 들어가야하는 코드 */
	public static void main(String[] args) {

		int myAge;
		myAge = 25;
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		//-32,768 ~ 32,767
		//int bVar = 32768;
		
        // -2147483648 ~ 2147483647
		//long bVar = 2147483648L;
		//인티저보다 큰숫자는 뒤에다가 L을붙여놔야함 글고지금 위에랑 변수이름 같아서 문제임. 중복으로쓰면안됨
		
		
//		int var01; 메모리에 공간잡아라
//		int ver02; 공간을하나 더 잡을수도있지
//		int ver03;
		
//		int var01; 
//		int var02;
//		int var03;
//		
//		var01 = 10;
//		var03 = 30; 얘를먼저넣고 싶어 공간은이미 어딘가에정해져있겠지 그럼 얘먼저써주면됨 순서대로움직임
//		var02 = 20;
//		
//		System.out.println(var03);
//		System.out.println(var02);
//		System.out.println(var01);
		
		//순서랑상관없이 출력하려할때.이거 만들자마자10넣고싶어일때
		/*int var01 = 10; 이게한문장. 공간만들고 10 이렇게 바로 쓰는게필요할때가 있고 하나씩쓰는게필요할때가있다는
		int var02 = 20; 
		int var03 = 30;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);*/

		
//		int var01 =10, var02= 20, var03 = 30;
//		이런문법도 있지만 헷갈리면 안써도됨
    }
	
	
}