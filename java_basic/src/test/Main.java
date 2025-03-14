package test;
 
import java.util.Scanner;
// 추가해야할 것: 
//1. 항공권 예약 시 출발 도착 가는날 오는날 사용자가 입력해서 해당값 db에서 찾기
//2. 항공권 예약 시 예약된 좌석 색변경
//3. 회원가입 시 중복된 아이디 찾기
//4. 회원가입 시 비번 한번 더 입력 그리고 비번 맞게 쓴지 체크

// 수정해야할 것:
//1. 생년월일 숫자8자리(YYMMDD)형식으로 나오게
//2. email 이메일 형식으로 abc@gmail.com
//3. 여권번호 M+숫자8자리

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      KoreanAircases case1 = new KoreanAircases();
      
      String[] id = new String[3]; //id
      String[] pw = new String[3]; //pw
      String[] name = new String[3]; //이름
      String[] engname = new String[3]; //영문이름
      int[] brith = new int[3]; //생년월일
      int[] mafe = new int[3]; //성별
      String[] email = new String[3]; //email
      int[] number = new int[3]; //전번
      String[] passnum = new String[3]; //여권번호
      String[] con = new String[3]; //거주국가
   //---------------------------------------------
      String inputid;
      String inputpw;
      
      while (true) {
          System.out.println("\n=============================================================================");
             System.out.println("1. 로그인      2. 회원가입      3. 회원탈퇴      9.종료");
             System.out.println("=============================================================================");
         
             int input = sc.nextInt();
             
             switch(input) {
             case 1: //로그인 
                 System.out.println("id : "); // 아디 비번 입력받기 (로그인)  
                 String inputid2 = sc.next();  
                 System.out.println("pw : ");  
                 String inputpw2 = sc.next();
                 for (int i = 0; i < 3; i++) {
                     if (id[i] != null && id[i].equals(inputid2) && pw[i].equals(inputpw2)) {
                         while (true) { // 무한 루프 추가
                            System.out.println("=================================================================================");
                             System.out.println("1. 항공권 예약      2. 항공권 조회      3. 항공권 취소      4. 좌석 변경      5.로그아웃");
                             System.out.println("=================================================================================");
                             System.out.println("입력 > ");
                             
                             int input2 = sc.nextInt();
                             
                             switch(input2) {
                                 case 1: // 항공권 예약
                                     case1.printFlightInfo(); // 항공권 정보, 선택
                                     break;
                                     
                                 case 2: // 항공권 조회
                                    case1.printBookedFlights();
                                     break;
                                     
                                 case 3: // 항공권 취소
                                    case1.cen();
                                     break;
                                 case 4: // 좌석 변경
                                    case1.qusrud();
                                     break;
                                     
                                 case 5: // 로그아웃
                                     System.out.println("로그아웃 되었습니다.");
                                     break; // 로그아웃하면 반복문을 종료하고 로그인 화면
                                     
                                 default: // 잘못 입력한 경우
                                     System.out.println("제대로 된 값을 입력하세요");
                                     break;
                             }
                             if (input2 == 5) break; // 로그아웃을 선택했을 때 반복문 종료
                         }
                     }
                 }
                 break; // 로그인 반복문 종료
             case 2: //회원가입
                System.out.println("아이디 입력 : ");
                String newid = sc.next();
                System.out.println("비밀번호 입력 : ");
                String newpw = sc.next();
                System.out.println("이름 입력 : ");  // 이름
                 String newname = sc.next();
                 System.out.println("영문이름 입력 : ");  // 영문이름
                 String newengname = sc.next();
                 System.out.println("생년월일 : ");  // 생년월일
                 int newbrith = sc.nextInt();
                 System.out.println("성별) 1>남자    2>여자 : ");  // 성별
                 int newmafe = sc.nextInt();
                 if(newmafe != 1 && newmafe !=2) {
                    System.out.println("잘못된 성별 입력입니다.");
                    break;
                 }
                 System.out.println("email 입력 : ");
                 String newemail = sc.next();
                 System.out.println("전화번호 입력 : ");
                 int newnumber = sc.nextInt();
                 System.out.println("여권번호 입력 : ");
                 String newpassnum = sc.next();
                 System.out.println("거주국가 입력 : ");
                 String newcon = sc.next();
                 
                 for (int i = 0; i < 3; i++) {
                     if (id[i] == null) {
                         id[i] = newid; //아디
                         pw[i] = newpw; //비번
                         name[i] = newname; //이름
                         engname[i] = newengname; //영문이름
                         brith[i] = newbrith; //생일
                         mafe[i] = newmafe; //성별
                         email[i] = newemail; //email
                         number[i] = newnumber; //전번
                         passnum[i] = newpassnum; //여권번호
                         con[i] = newcon; //국가
                         break;
                     }
                 }
                
                 System.out.printf("%s 님 가입을 환영합니다",newname);
                 break;
                 
                 
                 
                 
             case 3: //회원탈퇴
                System.out.println("ID >");
                 String delid = sc.next();
                 System.out.println("비밀번호 >");
                 String delpw = sc.next();
                 
                 for (int j = 0; j < 3; j++) {
                    if (delid.equals(id[j]) && delpw.equals(pw[j])) {
                       System.out.println("삭제하시겠습니까? Y/N");
                       String YN = sc.next();
                       if (YN.equals("y") || YN.equals("Y")) {
                          id[j] = null;
                          pw[j] = null;
                          name[j] = null;
                          engname[j] = null;
                          brith[j] = 0;
                          mafe[j] = 0;
                          email[j] = null;
                          number[j] = 0;
                          passnum[j] = null;
                          con[j] = null;
                          System.out.println("삭제 되었습니다.");
                          System.out.println("* KOREAN AIR *");
                          break;
                       }
                       else if(YN.equals("n") || YN.equals("N")) {
                          break;
                       }
                       else {
                          System.out.println("제대로 된 입력값을 넣으세요");
                          break;
                       }
                       
                    }
                    else {
                       System.out.println("회원을 찾을 수 없습니다.");
                       break;
                    }
                 }break;
             case 9: // 종료
                 System.out.println("프로그램을 종료합니다.");
                 sc.close();
                 return; 

             default: //입력값 잘못
                 System.out.println("제대로 된 입력값을 넣으세요.");
                 
             } //end switch
      } //end while

   } // end psvm

} //end class

