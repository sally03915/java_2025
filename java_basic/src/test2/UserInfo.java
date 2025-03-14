package test2;

import java.util.Calendar;

public class UserInfo {
	public static  int    cnt=0;   //###
	private int    no;
	private String name;  //getters+setters
	private String email;
	private String date;	
	// alt + shift + s   ( 생성자, toString, getters/setters )
	public UserInfo() { super(); }
	
	public UserInfo( int no, String name, String email, String date) {  //###
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.date = date;
	}  
	
	public UserInfo(String name, String email) {  //###
		this.no=++cnt;
		this.name = name;
		this.email = email;
		Calendar today = Calendar.getInstance();
		this.date = today.get(1) + "-" + today.get(2) + "-"+ today.get(5);
		//				년					월						일
	}

	@Override
	public String toString() {
		return "UserInfo [cnt=" + cnt + ", no=" + no + ", name=" + name + ", email=" + email + ", date=" + date + "]";
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
/*
1. 주제 :  자원봉사   ( Together )
2. 주요기능 : ( CRUD )
--------------------------------------
자원봉사자등록
자원봉사자확인
자원봉사자수정
자원봉사자삭제
--------------------------------------
후원하기... 기회가되면
--------------------------------------

3.  Model ( MVC )
--------------------------------------------
1   aaa    aaa@gmail.com    2022-02-03
2   bbb   bbb@gmail.com     2022-04-05
3   ccc    ccc@gmail.com    2022-04-08
---------------------------------------------
ArrayList<UserInfo>  list = new ArrayList<>();


4. Controller    ( MVC )
5. View (MVC)
*/