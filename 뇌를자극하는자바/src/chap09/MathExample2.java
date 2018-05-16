package chap09;

public class MathExample2 {

	public static void main(String[] args) {
		/*System.out.println("sin(pi)="+Math.sin(Math.PI));
		System.out.println("cos(pi)="+Math.cos(Math.PI));
		System.out.println("tan(pi)="+Math.tan(Math.PI));*/
		
		for(int i=1; i<=7; i++) { 
			double randomValue = Math.random();
			int value = (int)(randomValue * 45)+1;
			System.out.println(i+"번째 난수 :"+ value);
		}

		
		/*System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());*/
	}

}
