package test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserUpdate implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........3. update");
		//1. 사용자 수정할 번호 입력받기
		//2. 사용자 수정할 이메일 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("no > ");     int no = scanner.nextInt();
		System.out.print("email > ");  String email = scanner.next();
		
		Iterator<UserInfo> iter=users.iterator();  //1)줄을 서시오
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			//if( no가 2이라면 ) { abc@gmail.com으로 변경  }
			if(u.getNo() == no) {  u.setEmail(  email  ); break; }
		} 
	}

	@Override public void exec(ArrayList<UserInfo> users, UserView_crud crud) {
		//1. 수정할 유저번호 입력받기
		int  no = Integer.parseInt(JOptionPane.showInputDialog("수정할 번호를 입력해주세요"));
		//2. 수정할 유저이메일 입력받기
		String email = JOptionPane.showInputDialog("수정할 이메일을 입력해주세요");
		//3. model( 저장소 ) - 해당번호의 데이터 찾아서 수정
		int find=-1;    int cnt=0;
		Iterator<UserInfo>  iter = users.iterator();  //1. 줄을 서시오
		while(iter.hasNext()) {//2. 해당데이터 있는지 확인
			if( iter.next().getNo() == no  ) { find=cnt;  break; } //3. 꺼내와서 비교
			cnt++;   // iterator는 index카운트 어려움!
		}
		if( find==-1 ) { JOptionPane.showMessageDialog(null,"번호를 확인해주세요"); return; }
		
		users.get(cnt).setEmail(email);
		
		//4. view - 수정된 데이터 처리
		crud.model.setValueAt(email, cnt, 2);  // 어떤값을, 몇번째줄, 몇번째칸
	}
	
}








