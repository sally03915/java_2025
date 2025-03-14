package test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//1. 클래스는 부품객체
//2. 멤버변수 / 멤버함수
//3. 조립(합성) -  생성자 new
/*     			UserMain
        ◆          ◆           			◆    
        |          |					|  
    <<Model>> 	<<View>>			<<Controller>>         
 List<UserInfo>  UserView_intro      controller
 				 UserView_crud       [] process
 */
public class UserMain {
	/////// 상태 - 속성 - 멤버변수
    //model
	ArrayList<UserInfo>  users;
	
	//view
	UserView_intro   intro;
	UserView_crud     crud;
	
	//controller
	UserProcess      controller;
	UserProcess  []     process;
	
	/////// 생성자
	public UserMain() { 
		users   = new ArrayList<>();
		intro   = new UserView_intro();  intro.show();
		crud    = new UserView_crud();
		process = new UserProcess[]{ new UserCreate() , new UserRead(), new UserUpdate() , new UserDelete()};
	}
	/////// 행위 - 기능 - 멤버함수
	public void intro()  {
		intro.btns[0].addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				intro.frame.dispose();//1. 현재창끄고
				crud.show();  //2. crud창 열기
				member();
			}
		});
	}// end intro
	
	public void member() {
		crud.button[0].addActionListener(new ActionListener() {  //등록
			@Override public void actionPerformed(ActionEvent e) {
				controller = process[0];   controller.exec(users , crud);  // 처리하고 / 해당view
		}});
		crud.button[1].addActionListener(new ActionListener() { //수정
			@Override public void actionPerformed(ActionEvent e) {
				controller = process[2];   controller.exec(users , crud);  // 처리하고 / 해당view
		}});
		crud.button[2].addActionListener(new ActionListener() { //삭제
			@Override public void actionPerformed(ActionEvent e) {
				controller = process[3];   controller.exec(users , crud);  // 처리하고 / 해당view
		}});
		crud.button[3].addActionListener(new ActionListener() { //종료
			@Override public void actionPerformed(ActionEvent e) {
				crud.frame.dispose();  // crud창 끄기
		}});
	}// end memmber
	
	public static void main(String[] args) {   new UserMain().intro();	}

}




