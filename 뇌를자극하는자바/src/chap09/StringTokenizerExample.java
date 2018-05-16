package chap09;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		StringTokenizer token = new StringTokenizer("사과 배 복숭아");
		//String str1="",str2="",str3="",str4=null;		
		
		while(token.hasMoreTokens()) {
			String str = token.nextToken();
			System.out.println(str);
		}
	
	/*	System.out.println("str1:"+ str1);
		System.out.println("str2:"+ str2);
		System.out.println("str3:"+ str3);*/
		
	
	}

}
