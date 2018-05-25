package chap19;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hellow Java Program");
		
		
		
		frame.setLocation(500, 400);
		frame.setPreferredSize(new Dimension(300, 200));
		
		Container contantPane = frame.getContentPane();
		
		JLabel label = new JLabel("Hellow, Java",SwingConstants.CENTER);
		
		
		contantPane.add(label);
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); //화면 정중앙 배치
	}

}
