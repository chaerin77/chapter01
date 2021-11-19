package ex06;

public class Main {

	public static void main(String[] args) {
	
		/*
		String[] argss=new String[3];
		argss[0] = "황일영";
		argss[1] = "황일영";
		argss[2] = "황일영";
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		if(args[0].equals("-version")){ //0번째값을읽어야겟지 -> -version
             System.out.println("ver0.78");
		}else {
			 System.out.println("옵션값을 확인해 주세요");
		}
	}

}
