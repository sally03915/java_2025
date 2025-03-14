package test2;

import java.util.ArrayList;
import java.util.Iterator;

public class UserRead implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........2. read");
		Iterator <UserInfo>  iter= users.iterator();   //1)줄을 서시오
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			System.out.println( u.getNo() + "\t" + u.getName()+"\t"+ u.getEmail() + "\t"+ u.getDate());
		}
	}

	@Override public void exec(ArrayList<UserInfo> users, UserView_crud crud) {}
}
