package test4;

//map을 사용하려다가 map이 아직 익숙하지 않고 헷갈려서 list사용 if문으로 중복값 없애는 방향으로 수정할 예정
//db 넘어가기전 list를 map으로 넘어가야하는 이유 = 중복값 없애기, 데이터가 많아지면 list 속도 ↓

/*
interface Bank_Controller {
 void exec(ArrayList<Bank_v7> users)  throws   IOException;; // 기존 배열에서 ArrayList로 변경
}//end 인터페이스
*/

package bank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Bank_v7 클래스: 사용자 정보를 저장하는 모델 클래스
class Bank_v7 { // dto
 private String id;
 private String pass;
 private int balance;
 static String company = "(주)회사";
 
 
 //toString은 테스트용으로 삭제 보류
 @Override 
 public String toString() { return "Bank_v7 [id=" + id + ", pass=" + pass + ", balance=" + balance + "]"; }
 public String getId() { return id; }  
 public void setId(String id) { this.id = id; }
 public String getPass() { return pass; }  
 public void setPass(String pass) { this.pass = pass; }
 public int getBalance() { return balance; }  
 public void setBalance(int balance) { this.balance = balance; }
 public static String getCompany() { return company; }  
 public static void setCompany(String company) { Bank_v7.company = company; }
} //end class


//Bank_Controller 인터페이스: 모든 기능 클래스들이 이 인터페이스를 구현 (변경 없음)
interface Bank_Controller {
 void exec (ArrayList<Bank_v7> users) throws InputMismatchException ; //IOException이거 말고 이거씀 입력값이 불일치할 때 나타나는
}//end 인터페이스


//dto / 인터페이스
//-------------------------------------------------------------------------------------------
//기능

//Input 클래스: 사용자 정보 입력 (동적 배열 적용)
class Input implements Bank_Controller {
 @Override
 public void exec(ArrayList<Bank_v7> users)  {
     Scanner sc = new Scanner(System.in);

     
     System.out.println("아이디 입력 : ");
     String id = sc.next();
     for (Bank_v7 user : users) {               //향상된 포문 돌려서 만약 입력값이 기존 아디랑 같으면 더이상 입력안받고 나가게
        if(id.equals(user.getId())){
           System.out.println("중복된 아이디입니다.");
           return;
        }
     }
     System.out.println("비밀번호 입력 : ");
     String pass = sc.next();
     System.out.println("잔액 입력 : ");
     int balance = sc.nextInt();

     Bank_v7 newUser = new Bank_v7(); // 새로운 객체 생성
     newUser.setId(id);
     newUser.setPass(pass);
     newUser.setBalance(balance);

     users.add(newUser); // 동적 배열에 추가            add()
     System.out.println("회원가입이 완료되었습니다.");  
 }
}//end class


//UserCheck 클래스: 로그인 시도 (향상된 for문 적용)
class UserCheck { 
 public int check(ArrayList<Bank_v7> users) {
     Scanner sc = new Scanner(System.in);
     System.out.println("아이디 입력 : ");
     String id = sc.next();
     System.out.println("비밀번호 입력 : ");
     String pass = sc.next();

     for (Bank_v7 user : users) { // 향상된 for문 사용
         if (user.getId().equals(id) && user.getPass().equals(pass)) { 
             return users.indexOf(user); // 리스트에서 인덱스 찾기 , gpt의 파워를 잠시빌림 25.03.13 오후에 내가 이해할 수 있게 공부예정
         }
     }
     System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
     return -1; 
 }
}//end class


//Show 클래스: 사용자 정보 조회 (향상된 for문 적용)
class Show implements Bank_Controller {
 @Override
 public void exec(ArrayList<Bank_v7> users) {
     int find = new UserCheck().check(users);
     if (find != -1) { 
         Bank_v7 user = users.get(find); // 리스트에서 사용자 객체 가져오기
         System.out.println("아이디: " + user.getId());
         System.out.println("비밀번호: " + user.getPass());
         System.out.println("잔액: " + user.getBalance());
     }
 }
}//end class


//Deposit 클래스: 입금 처리 (ArrayList 적용)
class Deposit implements Bank_Controller {
 @Override
 public void exec(ArrayList<Bank_v7> users) {
     Scanner sc = new Scanner(System.in);
     int find = new UserCheck().check(users);

     if (find != -1) {
         System.out.println("입금할 금액 : ");
         int amount = sc.nextInt();
         users.get(find).setBalance(users.get(find).getBalance() + amount);      //세터값으로 값수정
         System.out.println("입금 완료! 현재 잔액: " + users.get(find).getBalance());
     }
 }
}//end class


//Withdraw 클래스: 출금 처리 (ArrayList 적용)
class Withdraw implements Bank_Controller {
 @Override
 public void exec(ArrayList<Bank_v7> users) {
     Scanner sc = new Scanner(System.in);
     int find = new UserCheck().check(users);

     if (find != -1) {
         System.out.println("출금할 금액 : ");
         int amount = sc.nextInt();
         if (users.get(find).getBalance() >= amount) {
             users.get(find).setBalance(users.get(find).getBalance() - amount); //세터값으로 값수정
             System.out.println("출금 완료! 현재 잔액: " + users.get(find).getBalance());
         } else {
             System.out.println("잔액이 부족합니다.");
         }
     }
 }
}//end class


//Delete 클래스: 계좌 삭제 (remove() 사용)
class Delete implements Bank_Controller {
 @Override
 public void exec(ArrayList<Bank_v7> users) {
     Scanner sc = new Scanner(System.in);
     int find = new UserCheck().check(users);

     if (find != -1) {
        while(true) { //else하나때매 추가
         System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
         String confirm = sc.next();
         if (confirm.equalsIgnoreCase("Y")) {
            Bank_v7 user = users.get(find);
            user.setId(null);
            user.setPass(null);
            user.setBalance(0);
            users.remove(find);
            System.out.println("계좌 삭제 완료.");

         } 
         else if(confirm.equalsIgnoreCase("N")){ //equalsIgnoreCase: 대소문자 구분없음
             System.out.println("계좌 삭제가 취소되었습니다.");
         }
         else {
            System.out.println("Y 혹은 N을 입력하세요");
         }
         }
     }
 }
}//end class

//Menu7 클래스: 메뉴 출력 및 기능 실행 (동적 배열 적용)
class Menu7 {
 private ArrayList<Bank_v7> users; // 기존 배열에서 ArrayList로 변경
 private Bank_Controller[] process;

 public Menu7() {
     users = new ArrayList<>(); // 동적 배열로 변경
     process = new Bank_Controller[] { new Input(), new Show(), new Deposit(), new Withdraw(), new Delete() };
 }

 public void exec() {
     Scanner sc = new Scanner(System.in);
     while (true) {
         try {
             System.out.println(users.toString()); // ArrayList 출력
             System.out.println("\n" + Bank_v7.company);
             System.out.println("======BANK======");
             System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

             if (!sc.hasNextInt()) { 
                 System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                 sc.next(); 
                 continue;
             }

             int choice = sc.nextInt();

             if (choice == 9) {
                 System.out.println("프로그램을 종료합니다.");
                 sc.close();
                 return;
             }

             if (choice >= 1 && choice <= 5) {
                 process[choice - 1].exec(users); // ArrayList를 인자로 전달
             } else {
                 System.out.println("잘못된 입력입니다. 다시 입력하세요.");
             }
         } catch (Exception e) { 
             System.out.println("오류가 발생했습니다. 다시 입력하세요.");
             continue;
             // 여기다가 에러 로그 사용하면 될 듯?
         }
     }
 }
}//end class


//Bank_Interface 클래스: 메인 실행
public class Test {
 public static void main(String[] args) {
     Menu7 menu = new Menu7();
     menu.exec();
 }
}//end class

