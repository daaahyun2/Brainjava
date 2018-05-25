package chap06;
//부모클래스 Account
class CreditLineAccount extends Account{
	int creditLine;
	CreditLineAccount(String accountNo,String ownerName,int balance,int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine=creditLine;
	}
	
	public int displayBalance() {
		return balance;
	}
	
	int withdraw(int amount)throws Exception{
		if((balance+creditLine)<amount)
			throw new Exception("인출이 불가능합니다.");
		balance-=amount;
		return amount;
	}
	
		
	public int displayCreditLine() {
		return creditLine;
}
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111","김선달",10000,20000000);
		try {
			int amount=obj.withdraw(50000);
			System.out.println("인출액: "+amount);
			int balance=obj.displayBalance();
			System.out.println("잔액: "+obj.balance);
			int creditLine=obj.displayCreditLine();
			System.out.println("마이너스한도: "+obj.creditLine);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}

