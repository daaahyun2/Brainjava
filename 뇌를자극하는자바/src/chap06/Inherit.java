package chap06;

//슈퍼클래스, 부모클래스
class Person{
	int money;
	
	public Person() {
		//기본생성자
		System.out.println("부모클래스에 기본생성자 Person()호출");
	}
	
	public Person(int money) {
		this.money=money;
		System.out.println("부모클래스에 생성자 Person(int money)호출");
	}
	
	public int displayMoney() {
		return money;
	}
}

//서브클래스, 자식클래스
class Child extends Person{
	public Child() {
		System.out.println("자식클래스에 기본생성자  Child()호출");
	}
}

public class Inherit {

	public static void main(String[] args) {
		
		Child child = new Child();
		

	}

}
