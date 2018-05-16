package chap09;

public class StringExample2 {

	public static void main(String[] args) {
		String str1="   Let it be.   ";
		String str2=str1.trim(); //앞뒤공백제거
		System.out.println(str2); 
		System.out.println(str2.concat("Speaking wordsod wisdom.")); //문자열뒤에 str을 연결
		System.out.println(str2.toUpperCase()); //소>>대문자 변환
		System.out.println(str2.toLowerCase()); //대>>소문자 변환
		System.out.println(str2.replace('e', 'a')); //e를a로바꿈
		System.out.println(str1); //
		System.out.println(str2); //
	}
}
