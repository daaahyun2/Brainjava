package chap09;
import java.util.*;
public class FiveNumbers {
//1부터 5까지의 수 중 하나를 임의로 선택해서 출력하는 프로그램
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Random random = new Random();
		int index = random.nextInt(5);
		System.out.println(arr[index]);
	}

}
