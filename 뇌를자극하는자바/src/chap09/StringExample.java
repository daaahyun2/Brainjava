package chap09;

public class StringExample {

	public static void main(String[] args) {

		String  str= "자바커피";
		int len = str.length();
		
		for(int cnt=0; cnt<len; cnt++) {
			char ch=str.charAt(cnt);
		System.out.println(ch);
		}
		
		String str1 =new String ("Hello,Java");
		String str2 =new String ("Hello,Java");
		String str3 =new String ("Hello,Java");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	
		if(str1.equals(str2)) //문자열 비교는 ==으로 비교하지말고, equals로 비교해라.
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		
		System.exit(0); //
	}

}
