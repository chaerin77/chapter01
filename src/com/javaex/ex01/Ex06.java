package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[]args) {
		
		//중요~~~ 같은자료형끼리밖에 계산이안돼 근데 된다는건변화가일어났단거 뭔가 규칙이있는거
		//개발때 주로 부딛히는건 실수형이랑 정수형
		
//		int num1 =1;
//		double b=1.0; 아까했던거 이경우에 int num 얘가 1.0으로바뀐다대
		
		
		//5/4 --> 몫1 나머지1 컴터한테 나누기는 몫만의미함 뒤에나오는얘긴데
		//정수 나누기 정수라서 결과물은 정수까지만.
		double v01 = 5/4;  //사람이했을댄 1.25라 생각하지 근데  컴터한테5/4 ->1이거든
		//일단 나온값은1인데 double이야. 실수로 표현하래 그럼 1.0 이렇게되는거임 걍 아그렇구나 하면됨 얘네는왜이따구야 하면 자바안쓰면됨ㅋㅋ
		System.out.println(v01);
		
		double v02 = (double)5/4; 
		//5를 강제로 더블로 강제형변환 -> 5.0 /4 이상태서 계산안됨 얘네가알아서바꿔주면--->5.0/4.0 일케됨(자동형변환 이제계산가능) -->1.25
		//실수하고 정수하고 계산하면 누가이겨 아까 실수가이긴댔잖아(형변환규칙에서)
		//그래서 이 값도 1.25나오는겨
		System.out.println(v02);
		
		double v03 = 5/(double)4; // 5/4.0(4를더블로강제변환했어)--같은자료형이여야 계산 가능하기때문에 자동으로 오른쪽처럼바뀜->5.0/4.0 이제계산가능--> 1.25
		System.out.println(v03);
		
		double v04= (double)5 / (double)4; //   (d)5 / (d)4 ---> 5.0/4.0 -->1.25
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8; // 1.3+1.8 하고싶었으면 int엔담길수없으니까 doubled이었어야함
		// int는 정수형이니까 1  + 이것도 1 
	    System.out.println(v05);
				
	    int v06 = (int)(1.3+1.8); //괄호 먼저계산 -> 3.1 나옴 (int)3.1 -> 3
	    System.out.println(v06);
		
	    
	    
	    	}

}


