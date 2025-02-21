package mini_projecet;

import java.util.Scanner;

public class Bank_v1_control {
	public static void main(String[] args) {
		// 변수
		int num;  char id=' ', pass=' '; int balance=0;
		Scanner scanner = new Scanner(System.in);
		// 입력 + 입력 + 처리 + 출력
		// Step1.  메뉴판 무한반복
		for(;;) {  //# 무한반복
			System.out.print("\n\n======BANK======\r\n" + "1.추가\r\n" + "2.조회\r\n" + "3.입금\r\n" 
					+ "4.출금\r\n" + "5.삭제\r\n" + "9.종료\r\n" + "입력>>>"); 
			num = scanner.nextInt();
			if(num==9) {System.out.println("종료기능입니다. ");  break;}
			// Step2. 기능
			switch(num) {
				case 1: System.out.println("추가기능입니다."); 
					//... Step3
					//	*ID :   _입력받기 first
					//	*PASS :   _입력받기 1111 
					//	*BALANCE : _입력받기 10000
					System.out.print("*ID : ");           id=scanner.next().charAt(0);
					System.out.print("*PASS : ");       pass=scanner.next().charAt(0);
					System.out.print("*BALANCE : "); balance=scanner.nextInt();
				break; // end case1
				
				case 2: System.out.println("조회기능입니다."); 
					//.... Step4
					//변수 - 임시변수 temp_id, 임시변수 temp_pass
					//입력 - 임시변수 temp_id, temp_pass 입력받기
					//처리 - if( temp_id 와 id가 같고  temp_pass 와 pass가 같다면 ){   사용자정보출력  }
					//      else { 아니라면  비밀번호 확인해주세요. }
					char temp_id=' ' ,temp_pass=' ';
					System.out.print("*ID : ");           temp_id=scanner.next().charAt(0);
					System.out.print("*PASS : ");       temp_pass=scanner.next().charAt(0);
					if( temp_id == id  &&  temp_pass == pass ){     
						System.out.println("ID: " + id + "\nPASS:" + pass + "\nBALANCE:" + balance);
					}else { System.out.println("정보를 확인해주세요!"); }			
				break; // end case2
				
				case 3: System.out.println("입금기능입니다."); 
				break; // end case3
				case 4: System.out.println("출금기능입니다."); 
				break; // end case4
				case 5: System.out.println("삭제기능입니다."); 
				break; // end case5
			}
			
		} // end for
	} // end main
}// end class

/*
Step1.  메뉴판 무한반복
for(){  //1-1무한반복
  //1-2 빠져나올조건 9일때
}

Step2.
//변수
char id='x' , pass= 'x';

//입력 + 처리 + 출력
for(){  
  // 해당번호 입력
  // 번호가 if  or  switch 
  1을 입력하면 추가기능입니다. 출력구문까지만
  2를 입력하면 조회기능입니다. 출력구문까지만
  3을 입력하면 추가기능입니다. 출력구문까지만
  4를 입력하면 조회기능입니다. 출력구문까지만
  5를 입력하면 삭제기능입니다. 출력구문까지만
}
....................................

Step3. 추가
{
*ID :   _입력받기 first
*PASS :   _입력받기 1111 
*BALANCE : _입력받기 10000

//변수
//입력
//처리
//출력
}

Step4. 조회
{
*ID : first
*PASS : 1234
조회가 실패했습니다. 

*ID : first
*PASS : 1111
======조회결과======
아이디 : first 
잔액 : 10000
암호 : 1111
조회가 성공했습니다. 

}
Step5. 입금

*/