package chap09;
import java.util.StringTokenizer;

public class StringTokenizerExample2 {

	public static void main(String[] args) {
		
		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|삼페인=1","=|",true);
		
		while(stok.hasMoreTokens()) {
			String token=stok.nextToken();
			if(token.equals("=")) 		//토큰이 "="이면 탭문자
				System.out.print("\t"); 
			else if (token.equals("|")) //"|"이면 줄바꿈문자
				System.out.print("\n"); 
			else						//그밖의 문자열이면 토큰 출력
				System.out.print(token);
		}

	}

}
