package test3_com;

import java.util.Arrays;
import java.util.Scanner;

class Menu {
	Bank[] users;
	Bank4_Controller controller;
	Bank4_Controller [] process;
	
	public Menu() {
		users = new Bank[3];
		process = new Bank4_Controller [] {
				new Input(), new Show(), new Deposit(), new Withdraw(), new Delete()  
		};
	}
	
	public void exec() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(Arrays.toString(users));
			System.out.println("======BANK======\r\n"
					+ "*1. 추가\r\n"
					+ "*2. 조회\r\n"
					+ "*3. 입금\r\n"
					+ "*4. 출금\r\n"
					+ "*5. 삭제\r\n"
					+ "*9. 종료\r\n"
					);
			System.out.println("입력 : "); 
			
			int choice = scanner.nextInt();
			if(choice == 9) {
				System.out.println("종료합니다."); 
				break;
			}
			if(!(choice>0 && choice<6)) {
				System.out.println("다시 입력해주세요."); 
				continue;
			}
			controller = process[choice-1]; controller.exec(users); 
		}
	} 
} // E class