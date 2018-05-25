package chap06;

public class IntetfaceExample {

	public static void main(String[] args) {

		SeparateVolume separateVolum = new SeparateVolume("863?774개","개미","베르베르");
															//객체 생성시 멤버필드(변수)
		AppCDInfo appCDInfo = new AppCDInfo("2005-7001","Redhat Fedora");
		separateVolum.chekOut("김다현", "20180518");
		appCDInfo.chekOut("이종원", "20180518");
		separateVolum.checkIn();
		appCDInfo.checkIn();

	}

}
