package chap06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterfaceExample3 {

	public static void main(String[] args) {
		SeparateVolume separateVolum = new SeparateVolume("863?774개","개미","베르베르");
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sf.format(date);
		
		// System.out.println(strDate);  //날짜표기
		try {
		separateVolum.chekOut("김다현",strDate);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printState(separateVolum);
		
		try {
		separateVolum.checkIn();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		printState(separateVolum);
	}
		
	
	static void printState(SeparateVolume separateVolum) {
		if(separateVolum.state==Lendable.STATE_NORMAL) {
			System.out.println("--------------------------");
			System.out.println("대출상태: 대출가능");
			System.out.println("--------------------------");
		}
		
		if(separateVolum.state==Lendable.STATE_BORROWED) {
			System.out.println("--------------------------");
			System.out.println("대출상태: 대출중");
			System.out.println("대출인: "+separateVolum.borrower);
			System.out.println("대출일: "+separateVolum.checkOutDate);	
			System.out.println("--------------------------");
		}
	}

}
