package test1_준혁;
 
import java.util.Arrays;
import java.util.Scanner;

class Bank_w{
	// 인스턴스 변수
	private String id;
	private String pass;
	private double balance;
	// 클래스 변수
	static String Company="(주)회사";
	// 생성자
	public Bank_w(String id, String pass, double balance) {
		super(); this.id = id; this.pass = pass; this.balance = balance; }
	// getter/setter
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	@Override public String toString() { return "Bank_w [id=" + id + ", pass=" + pass + ", balance=" + balance + "]"; }
}


interface Bank_Controller_A{ void exec(Bank_w[] users); }

class Login_A {
	public static String login(Bank_w[] users) {	// 로그인 실패 시 null 값 반환
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nID입력 : ");
		String tempId = sc.nextLine();
		for(Bank_w a:users) {
			if(a==null) { continue; }
			if(a.getId().equals(tempId)) {
				System.out.println("\n입력된 ID : "+a.getId());
				System.out.print("비밀번호 입력 : "); 
				String tempPwd = sc.next();
				if(a.getPass().equals(tempPwd)) {
					return a.getId();
				} else { System.out.println("\n비밀번호가 틀렸습니다\n\n"); return null;}
			}	// if getid end
		} // for end
		System.out.println("등록되지 않은 ID 입니다\n");
		return null;
	} // static end
} // class end

class Menu_A{
	Bank_w[] users;
	Bank_Controller_A controller;
	Bank_Controller_A[] process;
	public Menu_A() {
		super(); users = new Bank_w[3];
		process = new Bank_Controller_A[] { new Input_A() , new Show_A() , new Deposit_A() , new Withdraw_A() ,new Delete_A() }; }
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(Arrays.toString(users));
			System.out.print(Bank_w.Company+" BANK SYSTEM\n1. 생성\t2. 조회\n3. 입금\t4. 출금\n5. 삭제\t6. 종료\n> ");
			int num = sc.nextInt();
			if(num==6) { System.out.println("\n서비스를 종료합니다\n이용해주셔서 감사합니다"); return; }
			if(num>6||num<1) { System.out.println("\n\n"); continue;}
			controller = process[num-1]; controller.exec(users);
		}
	}
}
class Input_A implements Bank_Controller_A{

//	새 계정 생성
	@Override
	public void exec(Bank_w[] users) {
		Scanner sc = new Scanner(System.in);
		//1. 빈칸검사
		
		//2. 입력받기
		System.out.println("사용할 아이디 입력");
		String newId = sc.nextLine();
		System.out.println("사용할 비밀번호 입력");
		String newPwd = sc.nextLine();
		double balanceReset = 0.0;			
        Bank_w user = new Bank_w(newId, newPwd, balanceReset);
        for (int i = 0; i < users.length; i++) {
        	if (users[i] == null) {
        		users[i] = user;
        		System.out.println("\nID : "+newId+" 회원가입이 정상적으로 완료되었습니다\n\n");
        		return;
        	}
        }
	}
}
class Show_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		String tempId = Login_A.login(users);
		if (tempId==null) {return;}
		
		for(Bank_w b:users) {
			if ((b==null)||(!(b.getId().equals(tempId)))) {continue;}	// null 값이거나 로그인 정보로 받아온 tempId 값과 불일치 시 continue
			System.out.println("\n"+b.getId()+"님\n"+"계좌 예금 : "+b.getBalance()+"\n\n"); 
		}
	}
}
class Deposit_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		String tempId = Login_A.login(users);
		if (tempId==null) {return;}
		
		System.out.print("입금할 금액 입력 : ");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		
		if(deposit<=0) { System.out.println("입금을 취소하고 메인 화면으로 돌아갑니다\n"); }
		else { System.out.println("\n금액 "+deposit+" 정상 입금되었습니다\n"); 
		for(Bank_w b:users) {
			if ((b==null)||(!(b.getId().equals(tempId)))) {continue;}	// null 값이거나 로그인 정보로 받아온 tempId 값과 불일치 시 continue
			b.setBalance(deposit+b.getBalance());
			System.out.println("\nID : "+b.getId()+"\n계좌 예금 : "+b.getBalance()+"\n\n");
			}
		}
	}
}
class Withdraw_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		String tempId = Login_A.login(users);
		if(tempId==null) {return;}
		
		System.out.print("출금할 금액 입력 : ");
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		if(withdraw<0) {System.out.println("출금을 취소하고 메인 화면으로 돌아갑니다\n\n"); return; }
		for(Bank_w b:users) {
			if ((b==null)||(!(b.getId().equals(tempId)))) {continue;}	// null 값이거나 로그인 정보로 받아온 tempId 값과 불일치 시 continue}
			if(b.getBalance()>=withdraw) { 
				b.setBalance(b.getBalance()-withdraw);
				System.out.println("\n금액 "+withdraw+" 정상 출금되었습니다");
				System.out.println("\nID : "+b.getId()+"\n계좌 예금 : "+b.getBalance()+"\n\n");
			} else { System.out.println("출금하려고 하는 금액이 계좌 예금보다 많습니다\n\n");}
		}
	}
}
class Delete_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		Scanner sc = new Scanner(System.in);
		String tempId = Login_A.login(users);
		if(tempId==null) {return;}
		
		for(Bank_w b:users) {
			if ((b==null)||(!(b.getId().equals(tempId)))) {continue;}	// null 값이거나 로그인 정보로 받아온 tempId 값과 불일치 시 continue
			if (b.getBalance()>0) { System.out.println(b.getId()+" 님의 계좌에 예금이 존재하여 계좌 삭제 절차를 진행하실 수 없습니다\n\n"); break; }
			System.out.println("[ID : "+b.getId()+"]"+" 계좌 삭제를 진행하시겠습니까? (Y/N)");	
			char confirm = sc.next().charAt(0);
			if(confirm=='Y'||confirm=='y') { 
				System.out.println("계좌가 삭제되었습니다\n이용해주셔서 감사합니다\n\n"); 
				
			}
			else { System.out.println("계좌 삭제 절차를 취소하셨습니다\n\n"); }
		}
	}
}
public class Bank_B {
	public static void main(String[] args) {
		Menu_A menu = new Menu_A();
		menu.exec();
	}
}