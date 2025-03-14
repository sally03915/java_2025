package test2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserCreate implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........1. create");
		Scanner scanner = new Scanner(System.in);
		System.out.print("name > ");   String name = scanner.next();
		System.out.print("email > ");  String email = scanner.next();
		//사용자이름 입력받기
		//이메일입력받기
		users.add(  new UserInfo( name , email) );
	}

	@Override public void exec(ArrayList<UserInfo> users, UserView_crud crud) {
		//1. 알림창으로 입력받기
		String name  = JOptionPane.showInputDialog("이름을 입력해 주세요> ");
		String email = JOptionPane.showInputDialog("이메일을 입력해 주세요> ");
		//2. model 데이터저장 - ArrayList에 데이터채우기
		users.add(  new UserInfo( name , email) );
		//3. view  화면갱신  - crud
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Object[] data = { UserInfo.cnt  ,  name, email ,  sdf.format(System.currentTimeMillis()) };  // 날짜
		crud.model.addRow(data);
		// 전체데이터불러오기  ## 도전!
	}
}
