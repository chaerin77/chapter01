package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//관계 연산자
		
		/*n1 = 5, n2 = 3
        ex) n1 < n2  n1이 n2보다 작은가? --> false
      	n1 >= n2 n1이 n2보다 같거나 큰가? --> true	
        이 질문에 대한 답이 뭐25이렇게 안나오지 맞어/아니야 이렇게만 나올테니까 얘네는 boolean을 써줘야함
      
        n1==n2   n1이 n2랑 같냐? 라고 물어보는거 --- =하나랑 헷갈리면안됨 얘는 대입하는거
        n1 != n2  n1과 n2는 같지않니? 다르니? 라고 물어보는거 --> 위에거랑 대답이 반대가 될것임 */ 
		
		int n1 = 5;
		int n2 = 3;
		
		System.out.println(n1<n2); // 5<3 5는3보다 작니? --> false 
		                           //결과만확인하려고 바로 저기 넣은거고 이 결과값 담으려 할때 boolean 써야함!
		System.out.println(n1>n2); // 5>3 --> true
		System.out.println(n1<=n2); // 3<=3 --> false
		System.out.println(n1>=n2); // 5>=3 --> true
		System.out.println(n1==n2); // 5==3 --> false
		System.out.println(n1!=n2); // 5!=3 --> true
		
		
	}
}
