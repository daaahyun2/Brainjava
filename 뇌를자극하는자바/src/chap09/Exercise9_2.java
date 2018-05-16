package chap09;

public class Exercise9_2 {

	public static void main(String[] args) {

		String str1="Java Programming";
		int index=str1.indexOf("a");
		
			if(index==-1)
			System.out.println("검색 결과가 없습니다.");
			else
			System.out.println(index+" 인덱스에 위치하고 있습니다.");
			
			StringBuffer sb=new StringBuffer("Java");
			System.out.println(sb);
			System.out.println(sb.append("집가고싶어"));
	}

}
