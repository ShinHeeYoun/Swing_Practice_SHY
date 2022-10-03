package Swing_practice;

import javax.swing.JFrame; //JFrame 라이브러리 import
import javax.swing.JOptionPane;
import javax.swing.JButton; //JButton 라이브러리 import
import javax.swing.JPanel; //JPannel 라이브러리 import
import javax.swing.JOptionPane; //JOptionPane 라이브러리 import

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameSetting extends JFrame{
	FrameSetting() {
		//기본 - 창 띄우기
		setVisible(true);	// 기본 : 보이게 하기
		setSize(360, 700);	// 기본 : 사이즈 설정
		setResizable(true);	// 기본 : 사이즈 조정 가능/불가능
		setLocationRelativeTo(null);	// 기본 : 화면 가운데에 창 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 기본 : 꺼지면 프로그램 종료
		
		// 패널을 만들고 그 안에 버튼 추가하기
		JPanel Pan1 = new JPanel(); // 패널 객체 생성
		add(Pan1); // 페널 추가
		JButton Btn1 = new JButton("이 버튼을 눌러보세요!"); // 버튼 객체 생성
		Pan1.add(Btn1); // 패널1에 버튼1 추가
		
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼이 클릭되었습니다."); // 이러면 버튼 클릭시 알림창 생성됨 
			}
		});
	}
}
