package chap06;

abstract class MessageSender{
	
	String title;
	String senderName;
		
	public MessageSender(String title, String senderName) {
	//	super();
		this.title = title;
		this.senderName = senderName;
	}
	
	abstract void sendMessage(String recipient);
	
}

class EmailSender extends MessageSender{
	
	String sendAddr;
	String emailBody;
	
	public EmailSender(String title, String senderName, String sendAddr, String emailBody) {
		super(title, senderName);
		this.sendAddr = sendAddr;
		this.emailBody = emailBody;
	}
	
	@Override
	void sendMessage(String recipient) {
		
		System.out.println("---------------------------------");
		System.out.println("제목: "+title);
		System.out.println("보내는 사람: "+senderName+" "+sendAddr);
		System.out.println("받는사람: "+recipient);
		System.out.println("내용: "+emailBody);
		
	}
	
	
}

class SMSSender extends MessageSender{
	String returnPhoneNo;
	String message;
	public SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	void sendMessage(String recipient) {
		System.out.println("---------------------------------");
		System.out.println("제목: "+title);
		System.out.println("보내는 사람: "+senderName);
		System.out.println("전화번호: "+recipient);
		System.out.println("회신전화번호: "+returnPhoneNo);
		System.out.println("메시지내용: "+message);
	}
	
}

public class InheritanceExample6{

	public static void main(String[] args) {

		EmailSender emailSender = new EmailSender("안녕", "다현", "ekgus947@naver.com", "이번주 토요일날 알바끝나고 한강가고, 일요일날은 데드풀 보자 아니면 반대로 하던가 아님 데드풀보고, 한강가던가 ㅋ");
		SMSSender smsSender=new SMSSender("안녕","다현","010-4630-2769","이번주 토요일날 알바 끝나고 한강가거나, 영화보자");
		emailSender.sendMessage("ekgus947@naver.com");
		emailSender.sendMessage("daaahyun2@naver.com");
		smsSender.sendMessage("010-4630-2769");
		System.out.println();
	}

}
