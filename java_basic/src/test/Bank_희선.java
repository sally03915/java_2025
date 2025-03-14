package test;

import java.util.Scanner;

public class Bank_희선 {
	public static void main(String[] args) {
		/*
		 * 변수 id, pw, age, mon 설정
		 */
		Scanner scanner = new Scanner(System.in);

		int num = 0, age = 0, mon = 0;
//      int sum = 0;
//      int min = 0;
		String pw = null;
		String id = null;

		for (;;) {
			System.out.println("\n==========BANK==========");
			System.out.println("1.추가");
			System.out.println("2.조회");
			System.out.println("3.입급");
			System.out.println("4.출금");
			System.out.println("5.삭제");
			System.out.println("9.종료");
			System.out.println("입력 : ");

			num = scanner.nextInt();

			switch (num) { // id, pw, age, mon 설정
			case 1: { // 추가
				System.out.println("아이디를 입력하세요."); // 입력
				String inputid = scanner.next();
				System.out.println("비밀번호를 입력하세요.");
				String inputpw = scanner.next();
				System.out.println("나이를 입력하세요.");

				int inputage = scanner.nextInt();
				System.out.println("잔액을 입력하세요.");
				int inputmon = scanner.nextInt();

				id = inputid;
				pw = inputpw;
				age = inputage;
				mon = inputmon;
			}
				break; // case1

			case 2: case 3: case 4: case 5: {// 조회
				// 변수
				// 입력
				System.out.println("아이디를 입력하세요."); // 입력
				String inputid = scanner.next();
				System.out.println("비밀번호를 입력하세요.");
				String inputpw = scanner.next();
				// 처리+출력

				if( !( inputid.equals(id) && inputpw.equals(pw) ) ) {
					System.out.println("잘못입력하셨습니다."); 
					break;
				}
					
				
				if(num==2) {
					System.out.println("==계좌조회");
					System.out.printf("ID : %s \nPASS : %s \n나이 : %d \n잔액 : %d", id, pw, age, mon);
					// System.out.println(pw);
				}else if(num==3) {
					System.out.println("입급금액을 입력하세요.");
					int inputcash = scanner.nextInt();
					System.out.println("==입급완료");

					mon += inputcash; 
					System.out.printf("ID : %s \nPASS :%s \n잔액 %d", id, pw, mon);
				}else if(num==4) {
					System.out.println("출금금액을 입력하세요.");
					int inputcash1 = scanner.nextInt();

					if (inputcash1 > mon) {
						System.out.println("잔액이 부족합니다.");
						break;
					} // 잔액부족
					mon -= inputcash1;
					System.out.println("==출금완료"); 
					System.out.printf("ID : %s \nPASS :%s \n잔액 %d", id, pw, mon);
				}else if(num==5) {
					System.out.println("계좌를 삭제하시겠습니까? (Y,N)");
					String cho = scanner.next();
					if (cho.equals("y")) {
						id = null;
						pw = null;
						age = 0;
						mon = 0;
						System.out.println("계좌삭제 완료");
					} else if (cho.equals("n")) {
						System.out.println("취소되었습니다.");
					} else {
						System.out.println("잘못입력하셨습니다.");
					}
				}

			} break; // end case5
			case 9: // 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			}

		} // end for

	}// end main
}