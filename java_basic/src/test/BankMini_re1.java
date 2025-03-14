package test;


import java.util.HashMap;
import java.util.Scanner;

public class BankMini_re1 {
	//HashMap 선언 소문자로
	//continue 보다는 break · 필요없는 구간은 삭제할 수 있도록 확인
	//변수는 사용 시 선언(switch문)
	//입금·출금 시 마이너스 수치는 불가능
	public static void main(String[] args) {
		HashMap<String, String>pwmap = new HashMap<>();
		HashMap<String, String>namemap = new HashMap<>();
		HashMap<String, String>agemap = new HashMap<>();
		HashMap<String, Integer>balancemap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println(pwmap);
			System.out.println(balancemap); 
			//기본출력창
			System.out.println("WELLCOME! (주)DOG&CAT_BANK");
			System.out.println("=====BANK=====\n*1. 추가\n*2. 조회\n*3. 입금\n*4. 출금\n*5. 삭제\n*9. 종료");
			System.out.print("입력>>>");
			int service=sc.nextInt();
			
			//종료코드
			if(service==9) {System.out.println("종료 기능입니다."); break;}
			
			if(service==1) {
				System.out.print("이름: "); String temp_name = sc.next();
				System.out.print("아이디: "); String temp_id = sc.next();
				//사용중인 아이디일 경우 사용불가 경고창
				if(namemap.containsKey(temp_id)) {System.out.println("사용중인 아이디입니다"); continue;}
				String id=temp_id;
				System.out.print("비밀번호: "); String pw = sc.next();
				System.out.print("나이: "); String age = sc.next();
				System.out.print("잔액: "); int balance = sc.nextInt();
				//마이너스 금액 입력 불가능하게?
				if(balance<0) {System.out.println("입력값을 다시 확인해주세요."); continue;}
				
				pwmap.put(id, pw);
				namemap.put(id, temp_name);
				agemap.put(id, age);
				balancemap.put(id, balance);  
			}
			
			switch( service ) { 
				case 2 : case 3:  case 4: case 5: //조회
					System.out.print("ID: "); String id = sc.next();
					System.out.print("PW: "); String pw = sc.next();
					//1. 아이디 존재여부 확인 2. 일치/불일치 확인 3. 일치 시 출력 불일치 시 확인문구
					//1. 키값확인
					//2. 
					//System.out.println( pwmap.get(id));
					
					if( pwmap.get(id) == null ) {   System.out.println("존재하지 않는 회원입니다.");  break;}
					else if(pwmap.get(id).equals(pw)) {  System.out.println("Wellcome");}
					switch(service) {
						case 2 :
								System.out.println("===계좌조회");
								System.out.println("ID:"+id+"\nPW:"+pw+"\n나이:"+agemap.get(id)+"\n잔액:"+balancemap.get(id)); 
						break;
						case 3 : 
								System.out.print("입금액: "); int balance = sc.nextInt();
								if(balance<0) {System.out.println("잘못된 입력값입니다.");}
								else {
									balancemap.put(id, balancemap.get(id)+balance);
									System.out.println("===입금완료");
									System.out.println("잔액"+balancemap.get(id));
								}	 
						break;
						case 4 : 
							System.out.print("출금액: "); balance = sc.nextInt();
							if(balancemap.get(id)<balance) {System.out.println("잔액이 부족합니다.");}
							else {
								balancemap.put(id, balancemap.get(id)-balance);
								System.out.println("===출금완료");
								System.out.println("잔액: "+balancemap.get(id));
							}	
						break;
						case 5 : 
							System.out.print("계좌를 삭제하시겠습니까?(Y/N): "); char answer = sc.next().charAt(0);
							if(answer=='y' || answer=='Y') {
								pwmap.remove(id);
								namemap.remove(id);
								agemap.remove(id);
								balancemap.remove(id);
								
								System.out.println("계좌가 삭제되었습니다.");}
							else if (answer=='n'||answer=='N') {System.out.println("취소되었습니다.");}
							else {System.out.println("잘못된 입력값입니다.");}
							
						break;
					} // END INNER SWITCH
			}//end switch
		}//end for
		
		
	}//end main
}//end class
