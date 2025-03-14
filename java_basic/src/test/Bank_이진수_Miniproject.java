package test;

import java.util.Scanner;

public class Bank_이진수_Miniproject {
	public static void main(String[]args) {
		//####변수
		int money = 0 , age = 0;
		char id=' ', pw=' ';
		Scanner scan = new Scanner(System.in);
		
		//####입력
		
		
		System.out.println("WELCOME! (주)마루킁킁은행");
//		switch (first) {
//		case 1: System.out.println( "*1. 추가." );
//		case 2: System.out.println( "*2. 조회." );
//		case 3: System.out.println( "*3. 입금." );
//		case 4: System.out.println( "*4. 출금." );
//		case 5: System.out.println( "*5. 삭제." );
//		case 6: System.out.println( "*9. 종료." );
//		}
		
		//step1 메뉴판 무한반복
		int first =0;
		for(;first!=9;) {
			System.out.println("===BANK===");
			System.out.println( "*1. 추가." );
			System.out.println( "*2. 조회." );
			System.out.println( "*3. 입금." );
			System.out.println( "*4. 출금." );
			System.out.println( "*5. 삭제." );
			System.out.println( "*9. 종료." );
			System.out.println("입력>>>");
			first = scan.nextInt();
			
			if(first==1) {
				System.out.println("추가입니다.");
				/* 스텝3
				 * 입력받기 id
				 * 입력받기 pw
				 * 입력받기 balance
				 * */
				System.out.println("ID:_ "); id = scan.next().charAt(0);
				System.out.println("PW:_"); pw = scan.next().charAt(0);
				System.out.println("나이:_"); age = scan.nextInt();
				System.out.println("잔액:_"); money = scan.nextInt();
			}
			
			
			//step2 기능
			switch(first) {
				case 2:   case 3:   case 4:   case 5:
					char temp_id = ' ', temp_pw = ' ';
					System.out.println("ID_"); temp_id = scan.next().charAt(0);
					System.out.println("PW_"); temp_pw = scan.next().charAt(0);
					
					if(  !(temp_id == id && temp_pw == pw )) { System.out.println("사용자정보를 확인해주세요");  break;}
					
					
					else if(first==2) {
				         System.out.println("조회입니다.");
						/* 스텝4
						 * 변수 입시변수 temp_id; 임시변수 temp_pw;
						 * 입력 입시변수 temp_id; 임시변수 temp_pw; 입력받기
						 * 처리 temp_id와 id가 같고 temp_pw; 와 pw가 같다면 사용자 정보 출력 else 비밀번호를 확인해주세요
						 * */
						
						
						System.out.println( "====계좌조회" +
								"\n id"+ ":"+ id + 
								"\n pw"+ ":"+ pw + 
								"\n 나이"+ ":" + age +
								"\n 잔액"+ ":"+ money);
					}else if(first==3) {
						System.out.println("입금입니다.");
						System.out.println("입금할 금액: ");
						int temp_money = scan.nextInt();
						System.out.println("====입금완료!");
						System.out.println("잔액: "+ (temp_money + money));
						money += temp_money;
					}else if(first==4) {
						System.out.println("출금입니다.");
						System.out.println("출금할 금액: ");
						int out_money = scan.nextInt();
						System.out.println("==출금 완료");
						System.out.println("잔액: " + (money - out_money) );
						money -= out_money;
					}else if(first==5) {
					
						System.out.println("계좌를 삭제하시겠습니까?\n" + "(Y/N)"); 
						char yon = scan.next().charAt(0);
						if(yon == 'Y' || yon == 'y') {id = ' '; pw = ' '; System.out.println("그동안 감사했습니다.");}
						else if( yon == 'N' || yon == 'n'){System.out.println("감사합니다.");}
						else {System.out.println("바르게 입력해주세요.");}
					}
				break; 
			} 
		}
			
			
		//step3 추가
		/*아이디: _입력받기 myname 
		 *패스워드: _입력받기 1111
		 *밸런스: _입력받기 10000
		 **/
		
		
		
		
		
		
		
		//step4 조회
		/*아이디: 
		 * */
		
		
			
			
				
			
			
			
			
		/* 처음화면에서 웰컴 하고 
		 * 메인에서 보이는것
		 * 
			
			
		 * ===BANK===
		 * * 1. 추가 > 스캐너, 아이디.비번 입력하고 넥스트인트로 id pw에 넣어둠
		 * * 2. 조회 > (아이디 비밀번호 입력)>맞는지판단>아이디 비밀번호 나이 잔액 출력
		 * * 3. 입금
		 * * 4. 출금
		 * * 5. 삭제
		 * * 9. 종료
		 * 입력>>>
		 * 
		 * */
		
		/*1. 추가 눌렀을때
		System.out.println("아이디 입력"); id = (char) scan.nextInt();
		System.out.println("비밀번호 입력"); pw = (char) scan.nextInt();
		System.out.println("나이 입력"); age = (char) scan.nextInt();
		System.out.println("잔액 입력"); money = (char) scan.nextInt();
		
		//2. 조회 눌렀을때 아이디 비밀번호 입력
		System.out.println("id"); inputid = (char) scan.nextInt();
		System.out.println("pw"); inputpw = (char) scan.nextInt();
		
		//3. 입금 눌렀을때 
		System.out.println("id"); inputid = (char) scan.nextInt();
		System.out.println("pw"); inputpw = (char) scan.nextInt();
		
		
		//####판단
		
		// 2.조회 누르고서 받은 아이디비번 맞는지 판단
				if (inputid == id && inputpw == pw ) {System.out.println( "==계좌조회 \n" + "ID" + id +"/n"+ "PASS" + pw +"/n"+ "나이: " + age +"/n"+ "잔액" + money +"/n");}//그리고 메인을 출력
				else {System.out.println("다시 확인해주세요.");}//그리고 메인을 출력
		*/
		
		//####출력
		/*2. 조회
		 * check = System.out.println( "==계좌조회 \n" + "ID" + id +"/n"+ "PASS" + pw +"/n"+ "나이: " + age +"/n"+ "잔액" + money +"/n");
		 * */
	}
}	
