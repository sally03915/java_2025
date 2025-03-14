package test2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
1. 클래스는 부품객체  ( 상태와 행위 )
2. OOP  (객체지향프로그램)  클래스 조립해서 프로그램 작성
        UserView_intro
    ◆        ◆        ◆
   JFrame   Button[]  JLabel( ImageIcon )
*/

public class UserView_intro {
	// 멤버변수
	JFrame frame;    
	JLabel label;  ImageIcon icon;  // 이미지
	JButton [] btns;    // 버튼들
	// 생성자
	public UserView_intro() { 
		frame = new JFrame("♥TOGETHER♥");
		//icon  = new ImageIcon("C:\\file\\together.png");  
		icon  = new ImageIcon("images\\logo.png");  
		label = new JLabel(icon);
		btns  = new JButton[]{ new JButton("자원봉사자등록") , new JButton("후원하기") };
	    
		// 배경, 폰트색상, 사이즈
		for(int i=0; i<btns.length; i++) {
			btns[i].setBackground(new Color(239,62,92));
			btns[i].setForeground(Color.white);
			btns[i].setFont(new Font( Font.DIALOG  ,  Font.BOLD  ,  17));
			//btns[i].setPreferredSize( new Dimension(100,60) );
		}
		
	}
	// 멤버함수
	public void show() {
		frame.setLayout(null);  //##1
		//frame.setLayout(new GridLayout(3,1));  // new FlowLayout()   , new GridLayout(3,1) 
		label.setBounds(95,0,128 , 128);       //x축, y축, 가로사이즈, 세로사이즈
		btns[0].setBounds(95,130 , 160,70  );
		btns[1].setBounds(95,210 , 160,70  );   //(350-160)/2
		
		frame.add(label);  frame.add(btns[0]); frame.add(btns[1]);
		
        frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setSize(350, 400);    frame.setVisible(true);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new UserView_intro().show();
	}
} // end class
