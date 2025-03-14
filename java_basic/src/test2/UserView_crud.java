package test2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
1. 클래스는 부품객체  ( 상태와 행위 )
2. OOP  (객체지향프로그램)  클래스 조립해서 프로그램 작성
        UserView_crud
    ◆        ◆        ◆   ( 생성자에서 new )
   JFrame   JTable    JPanel( JButton[] )
*/

public class UserView_crud {
	// 멤버변수
	JFrame frame; 
	JScrollPane scroll; JTable table;  String[] column;  Object[][] rowData;   DefaultTableModel model;  //동적데이터추가
	JPanel panel; JButton[] button;
	
	// 생성자
	public UserView_crud() { 
		frame = new JFrame("♡TOGETHER♡");
		
		panel = new JPanel();   
		button= new JButton[] { new JButton("등록") , new JButton("수정") , new JButton("삭제") , new JButton("닫기")  };
	
		column = new String[] {"NO" , "NAME" , "EMAIL" , "DATE"};
		rowData= new Object[][] {};
		model  = new DefaultTableModel(rowData, column);
		table  = new JTable(model);
		scroll = new JScrollPane(table);
		// 배경, 폰트색상, 사이즈
		for(int i=0; i<button.length; i++) {
			button[i].setBackground(new Color(239,62,92));
			button[i].setForeground(Color.white);
			button[i].setFont(new Font( Font.DIALOG  ,  Font.PLAIN  ,  16));
			//btns[i].setPreferredSize( new Dimension(100,60) );
		}
		/// 색상지정
		//table.getRootPane().setBackground(new Color(255,255,255)); 
		//table.setBackground( new Color( 255,200,200 ));   //  red(0~255) , green(0~255), blue(0~255)   # ver-....
		table.setRowHeight(25);
		table.setOpaque(false);
		
		table.getTableHeader().setReorderingAllowed(false);  // 컬럼이동방지
		
		DefaultTableCellRenderer  dtcr = new DefaultTableCellRenderer();  //정렬지정-가운데지정
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i=0; i<table.getColumnCount(); i++) {
			table.getColumn(column[i]).setCellRenderer(dtcr);
		}
				
				

	}
	// 멤버함수
	void show() {  
		
		frame.setResizable(false);
		frame.setLayout( new BorderLayout());   
		frame.add(scroll , BorderLayout.CENTER);   
		frame.add(panel , BorderLayout.SOUTH);          
		for(int i=0; i<button.length; i++) {    panel.add(button[i]); }
		frame.setSize(400,300);   frame.setVisible(true);  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {   new UserView_crud().show();  }
}

