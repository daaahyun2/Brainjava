package com.kook.firstjava;

import java.util.Scanner;

public class Calculator {
	// 속성필드(데이터)
	// int number1 = 0;
	// int number2 = 0;
	
	// 메소드(함수기능)
	public int plus(int x, int y, int z) {
		int total= x + y+z;
		return total;
	}
	
	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.println("세개의 숫자 입력");
		Scanner scan= new Scanner(System.in); //scanf("%d",&num1); C언어스타일
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		//객체생성
		Calculator cal=new Calculator();
		int result=cal.plus(num1, num2,num3);
		System.out.println("result:"+ result);
		
	}
	
}
