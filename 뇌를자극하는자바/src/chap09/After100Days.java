package chap09;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.GregorianCalendar;

public class After100Days {
	public static void main(String[] args) {
		//오늘 날짜부터 100일 후의 날짜 계산
				GregorianCalendar calendar =new GregorianCalendar();
				
				calendar.get(Calendar.DAY_OF_MONTH);
				calendar.add(calendar.DAY_OF_MONTH, 100);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE aa hh시 mm분 ss초 ");
				String str = dateFormat.format(calendar.getTime());
			
								
				System.out.println(str);
				
				

			}

		

	}

