package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//int var01 = 2+3.4;
		
		System.out.println(2+3.4);
		
		double var01 = 2+3.4; //2.0(자동형변환된부분) +3.4         정수를실수로바꿔주는 자동형변환
		//float 써줘도 상관은 없는디 float쓴다면 2+3.4f; 일케 f붙여줘야함
        System.out.println(var01);

        
        //자동형변환(long + float)
        long var02 = 12345L;
        float var03 = 1.1F;
        
        System.out.println(var02+var03); 
        //요 계산하는 순간에 long이 바뀐다는거지 보통 실수가 이겨
        
        float result = var02 + var03;
        System.out.println(result);
        
        ///////////////////////////////////////////////////////
        
        //강제 형변환 좀억지지만 예시
        //double i = 11112.3232322; //얘 이유는모르겠으나 int에 담아야한대
        //저 실수형숫자를 int로어케변화시키는가
         int i =(int)11112.3232322;
        System.out.println(i);
        
//        형변환 하는거는 감수하고써야한다는
        
        float f01 = 12.5f; //f01은 태어날때부터 float이었어
        
        int i01 = (int)f01; //내가 여기다가 12.5를 넣겠단얘기 소수점망가지는거알지만 
        //그냥 넣겠단 얘기
        System.out.println(i01);
        System.out.println(f01);
        
     
        //강제 형변환 -->확대 형변환
        byte v01 = 10; //8칸짜리 잡았어 10넣었어 글고 강제로 늘이려고해
        int v02 = (int)v01; //여기다가 v01을담을거야 임시로 얘를 int로 만들었어 8칸짜리를 32칸으로늘렷어 근데얘는별변화는없을거임
        System.out.println(v01);
        System.out.println(v02);
        
        
        //강제 형변환 -->축소 형변환(값이 안변했음)
        int v03 = 10; //4byte-> 32bit
        byte v04 = (byte)v03;  //v03을 강제로 byte 로 줄여버릴거야
        //다행히 앞을 충분히 표현할수있을정도라서 앞을 날려도 살았어 별 이상없어보임
        
        System.out.println(v03);
        System.out.println(v04);
        
        
        //강제 형변환 --> 축소 형변환(비정상) ->원하는 값을 잃을수있다
        int v05 = 34324324;
        byte v06 = (byte)v05; // int v05를 byte로줄여줄거야
        System.out.println(v05);
        System.out.println(v06);
        
        //실수 --> 정수 : 소수부분이 없어짐  --소수점 부분이 다 잘려
        double v07 = 54315.57231545653;
        int v08 = (int)v07; //v08에다가 07을 인트로바꿔서 넣어줄거야
        System.out.println(v08); 
        
        
        //정수-->실수 : .0을 붙인다.
        int v09 = 7;
        double v10 = (double)v09; //원래 int인데 double형으로 바꿀겨~~
        //7이 7.0이되겠지요
        System.out.println(v10);
	}

}
