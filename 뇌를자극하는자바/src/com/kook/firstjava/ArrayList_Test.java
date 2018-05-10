package com.kook.firstjava;

import java.util.ArrayList;

public class ArrayList_Test {
	public static void main(String args[]) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("포도");
		fruits.add("딸기");
		fruits.add("복숭아");
		fruits.add("아보카도");
		
		/*String[] fruits = new String[3];
				fruits[0]="포도";
				fruits[1]="딸기";
				fruits[2]="복숭아";
				fruits[3]="아보카도";*/
		
		
		System.out.println("과일출력");
		
			for(int i=0; i<fruits.size(); i++)	{		
				System.out.println(fruits.get(i));
		}
		
		fruits.remove(2);
				
		for(int i=0; i<fruits.size(); i++)	{		
			System.out.println(fruits.get(i));
	}
		
	}
	
}
