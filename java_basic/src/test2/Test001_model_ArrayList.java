package test2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test001_model_ArrayList {
	public static void main(String[] args) {
		//0. UserInfo
		UserInfo  user = new UserInfo("first","first@gmail.com");
		System.out.println(user);
		
		//1. ArrayList Test   (저장소)
		// 기차 : index  O, 중복허용가능,  add/get/size/remove/contains 
		// 유저추가 : add   ( create )
		ArrayList<UserInfo> list = new ArrayList<>(); 
		list.add(  new UserInfo("aaa","aaa@gmail.com") );
		list.add(  new UserInfo("bbb","bbb@gmail.com") );
		list.add(  new UserInfo("ccc","ccc@gmail.com") );
		System.out.println( list );
		//UserInfo      cnt=0  수정
		
		//2. (read)   Iterator 이용해서 전체 데이터 출력하기  - 1)줄을 서시오   2)처리대상확인 3)꺼내오기
		Iterator <UserInfo>  iter=list.iterator();   //1)줄을 서시오
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			System.out.println( u.getNo() + "\t" + u.getName()+"\t"+ u.getEmail() + "\t"+ u.getDate());
		}
		
		//3. (update) no가 2이라면 abc@gmail.com으로 변경
		iter=list.iterator();  //1)줄을 서시오
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			//if( no가 2이라면 ) { abc@gmail.com으로 변경  }
			if(u.getNo() == 2) {  u.setEmail("abc@gmail.com"); break; }
		}
		System.out.println(list);
		
		//4. (delete) no가 2인 데이터 삭제
		iter=list.iterator();  //1)줄을 서시오
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			//if( no가 2이라면 ) { abc@gmail.com으로 변경  }
			if(u.getNo() == 2) { iter.remove(); break; }  // iter가 가리키는 친구를 지워주세요!
		}
		System.out.println(list);
		
	}// end main
}// end class
