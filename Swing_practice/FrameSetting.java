package Swing_practice;

import javax.swing.JFrame; //JFrame ���̺귯�� import
import javax.swing.JOptionPane;
import javax.swing.JButton; //JButton ���̺귯�� import
import javax.swing.JPanel; //JPannel ���̺귯�� import
import javax.swing.JOptionPane; //JOptionPane ���̺귯�� import

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameSetting extends JFrame{
	FrameSetting() {
		//�⺻ - â ����
		setVisible(true);	// �⺻ : ���̰� �ϱ�
		setSize(360, 700);	// �⺻ : ������ ����
		setResizable(true);	// �⺻ : ������ ���� ����/�Ұ���
		setLocationRelativeTo(null);	// �⺻ : ȭ�� ����� â ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// �⺻ : ������ ���α׷� ����
		
		// �г��� ����� �� �ȿ� ��ư �߰��ϱ�
		JPanel Pan1 = new JPanel(); // �г� ��ü ����
		add(Pan1); // ��� �߰�
		JButton Btn1 = new JButton("�� ��ư�� ����������!"); // ��ư ��ü ����
		Pan1.add(Btn1); // �г�1�� ��ư1 �߰�
		
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "��ư�� Ŭ���Ǿ����ϴ�."); // �̷��� ��ư Ŭ���� �˸�â ������ 
			}
		});
	}
}
