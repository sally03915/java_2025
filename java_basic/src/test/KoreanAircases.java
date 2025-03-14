package test;
 
import java.util.Scanner;

public class KoreanAircases {
    String[] to = {"인천(INC,대한민국)", "인천(INC,대한민국)"}; String newto; // 항공권 정보 배열 // 출발지 
    String[] from = {"오사카(KIX,일본)", "오사카(KIX,일본)"}; String newfrom; // 도착지 
    int   [] goday = {20210510, 20210510}; int newgoday;// 가는 날
    int   [] backday = {20210514, 20210514}; int newbackday; // 오는 날
    String[] gotime = {"09:40", "12:40"}; String newgotime; // 출발 시간
    String[] backtime = {"11:20", "14:20"}; String newbacktime; // 도착 시간
    String[] ingtime = {"1시간 40분", "1시간 40분"}; String newingtime; // 소요 시간

   
    String[] bookedTo = new String[2];  //예약한 출발지
    String[] bookedFrom = new String[2]; //예약한
    int   [] bookedGoday = new int[2]; //예약한
    int   [] bookedBackday = new int[2]; //예약한
    String[] bookedGotime = new String[2]; //예약한
    String[] bookedBacktime = new String[2]; //예약한
    String[] bookedSeat = new String[2]; //예약한

    Scanner scA = new Scanner(System.in);
 
    // 항공권 정보를 출력하는 메서드
    public void printFlightInfo() {
        System.out.println("============================================================= 항공권 정보 =============================================================");
        for (int i = 0; i < to.length; i++) {
           if(to[i]==null) { continue; }
             //break쓰면 아무것도 안나옴 ;;
           
            
            System.out.print((i+1)+". "+"출발지: " + to[i]+" ");
            System.out.print("도착지: " + from[i]+" ");
            System.out.print("가는 날: " + goday[i]+" ");
            System.out.print("오는 날: " + backday[i]+" ");
            System.out.print("출발 시간: " + gotime[i]+" ");
            System.out.print("도착 시간: " + backtime[i]+" ");
            System.out.print("소요 시간: " + ingtime[i]+" \n");    
           
        }
        System.out.println("=====================================================================================================================================");
        System.out.println("항공편 선택 > ");

        int input3 = scA.nextInt();

        if (input3 < 1 || input3 > to.length) {
            System.out.println("잘못된 항공편 선택입니다.");
            return;
        }

        for (int i = 0; i < bookedTo.length; i++) { // 배열에 값 넣기
            if (bookedTo[i] == null) { // 예약 가능한 자리 확인
                bookedTo[i] = to[input3 - 1];
                bookedFrom[i] = from[input3 - 1];
                bookedGoday[i] = goday[input3 - 1];
                bookedBackday[i] = backday[input3 - 1];
                bookedGotime[i] = gotime[input3 - 1];
                bookedBacktime[i] = backtime[input3 - 1];
                
                //예약해서 사라지게
                to[input3 - 1] = null;
                from[input3 - 1] = null;
                goday[input3 - 1] =0;
                backday[input3 - 1] =0;
                gotime[input3 - 1] =null;
                backtime[input3 - 1]=null;
                ingtime[input3 - 1]=null;
                
                
                break;
            }
        }

        printsel(input3);
    } //end printFlightInfo

    // 좌석 선택 메서드
    public void printsel(int input3) {
        for(int i = 0; i < to.length; i++) {
            if(input3 == (i+1)) { 
                System.out.println("=============================================================좌석선택=============================================================");
                System.out.println("   ABC DEFG HIJ\r\n"
                        + "1  □□□ □□□□ □□□\r\n"
                        + "2  □□□ □□□□ □□□\r\n"
                        + "3  □□□ □□□□ □□□\r\n"
                        + "4  □□□ □□□□ □□□\r\n"
                        + "5  □□□ □□□□ □□□\r\n"
                        + "6  □□□ □□□□ □□□\r\n"
                        + "7  □□□ □□□□ □□□\r\n"
                        + "8  □□□ □□□□ □□□\r\n"
                        + "9  □□□ □□□□ □□□\r\n"
                        + "10 □□□ □□□□ □□□");
                System.out.println("좌석을 선택하세요 > ");
                String input4 = scA.next();

                for (int j = 0; j < bookedSeat.length; j++) { 
                    if (bookedSeat[j] == null) { 
                        bookedSeat[j] = input4; 
                        break;
                    }
                }

                System.out.println("============================================================= 선택한 항공 =============================================================");
                System.out.print((i+1)+". "+"출발지: " + bookedTo[i]+" ");
                System.out.print("도착지: " + bookedFrom[i]+" ");
                System.out.print("가는 날: " + bookedGoday[i]+" ");
                System.out.print("오는 날: " + bookedBackday[i]+" ");
                System.out.print("출발 시간: " + bookedGotime[i]+" ");
                System.out.print("도착 시간: " + bookedBacktime[i]+" ");
                System.out.print("좌석 번호: " + input4 + " \n");
                System.out.println("=====================================================================================================================================");
                System.out.println("----------------------------------------------");
                System.out.println("예약하시겠습니까? [1] 확인  [2] 취소");
                int input5 = scA.nextInt();

                if(input5 == 1) {
                    System.out.println("예약이 완료되었습니다.");
                    return;
                } else {
                    System.out.println("예약이 취소되었습니다.");
                    return;
                }
            }
        }
        System.out.println(" 잘못된 항공편 선택");
    } //end printsel

    // 예약된 항공권 조회
    public void printBookedFlights() {
        System.out.println("============================================================= 예약된 항공권 조회 =============================================================");
        boolean found = false;
        for (int i = 0; i < bookedTo.length; i++) {
           
           if (bookedTo[i] != null) { // 예약된 항공권이 있을 경우 출력
                found = true;
                System.out.println((i + 1) + ". 출발지: " + bookedTo[i] +
                    " | 도착지: " + bookedFrom[i] +
                    " | 가는 날: " + bookedGoday[i] +
                    " | 오는 날: " + bookedBackday[i] +
                    " | 출발 시간: " + bookedGotime[i] +
                    " | 도착 시간: " + bookedBacktime[i] +
                    " | 좌석: " + bookedSeat[i]);
            }
            
        }
        if (!found) {
            System.out.println("예약된 항공권이 없습니다.");
        }
    } //end printBookedFlights
    //예약된 항공편 취소
    public void cen() {
        while (true) {  // 반복문을 사용하여 유효한 입력을 받을 때까지 계속 실행
            System.out.println("============================================================= 예약된 항공권 조회 =============================================================");
             boolean found = false;
             for (int i = 0; i < bookedTo.length; i++) {
                
                if (bookedTo[i] != null) { // 예약된 항공권이 있을 경우 출력
                     found = true;
                     System.out.println((i + 1) + ". 출발지: " + bookedTo[i] +
                         " | 도착지: " + bookedFrom[i] +
                         " | 가는 날: " + bookedGoday[i] +
                         " | 오는 날: " + bookedBackday[i] +
                         " | 출발 시간: " + bookedGotime[i] +
                         " | 도착 시간: " + bookedBacktime[i] +
                         " | 좌석: " + bookedSeat[i]);
                 }
                 
             }
             if (!found) {
                 System.out.println("예약된 항공권이 없습니다.");
             }
             System.out.println("=====================================================================================================================================\n");

            System.out.println("예약된 항공권을 선택해주세요 : ");
            int input6 = scA.nextInt();
            
            System.out.println("취소하시겠습니까아? (Y / N)");
            String input7 = scA.next();

            //취소
            if (input7.equals("Y") || input7.equals("y")) {
               // for(int i=0; i<bookedTo.length; i++) {
                   bookedTo[input6 -1] = null;
                   bookedFrom[input6 -1] = null;
                   bookedGoday[input6-1]= 0;
                   bookedBackday[input6-1]= 0;
                   bookedGotime[input6-1] =null;   
                   bookedBacktime[input6-1] =null;
                   bookedSeat[input6-1] =null;         
                   System.out.println("항공권이 취소되었습니다.");
                   break;
              //  }
              //  break;  // 취소가 완료되면 반복문을 종료
            }
            //취소의 취소
            else if (input7.equals("N") || input7.equals("n")) {
                System.out.println("취소가 취소되었습니다.");
                break;  // 취소하지 않으면 반복문을 종료
            }
            // 잘못입력
            else {
                System.out.println("제대로 된 값을 입력하세요.");
                continue;
            }
        }
    }//end cen
    public void qusrud() {
       while (true) {  // 반복문을 사용하여 유효한 입력을 받을 때까지 계속 실행
           System.out.println("============================================================= 예약된 항공권 조회 =============================================================");
            boolean found = false;
            for (int i = 0; i < bookedTo.length; i++) {
               
               if (bookedTo[i] != null) { // 예약된 항공권이 있을 경우 출력
                    found = true;
                    System.out.println((i + 1) + ". 출발지: " + bookedTo[i] +
                        " | 도착지: " + bookedFrom[i] +
                        " | 가는 날: " + bookedGoday[i] +
                        " | 오는 날: " + bookedBackday[i] +
                        " | 출발 시간: " + bookedGotime[i] +
                        " | 도착 시간: " + bookedBacktime[i] +
                        " | 좌석: " + bookedSeat[i]);
                }
                
            }
            if (!found) {
                System.out.println("예약된 항공권이 없습니다.");
            }
            System.out.println("변경할 항공권을 선택해주세요 : ");
            int input8 = scA.nextInt();
            
            System.out.println("=============================================================좌석선택=============================================================");
            System.out.println("   ABC DEFG HIJ\r\n"
                    + "1  □□□ □□□□ □□□\r\n"
                    + "2  □□□ □□□□ □□□\r\n"
                    + "3  □□□ □□□□ □□□\r\n"
                    + "4  □□□ □□□□ □□□\r\n"
                    + "5  □□□ □□□□ □□□\r\n"
                    + "6  □□□ □□□□ □□□\r\n"
                    + "7  □□□ □□□□ □□□\r\n"
                    + "8  □□□ □□□□ □□□\r\n"
                    + "9  □□□ □□□□ □□□\r\n"
                    + "10 □□□ □□□□ □□□");
            System.out.println("=====================================================================================================================================\n");

            System.out.println("좌석을 선택하세요 > ");
            String input9 = scA.next();
            
            
            for (int i = 0; i < bookedTo.length; i++) { // 배열에 값 넣기
                if (bookedTo[input8] == null) {
                    
                    bookedSeat[input8-1]=input9;
                    
                    break;
                }
            }break;
           
            
       }
    } //end qusrud

} //end class
