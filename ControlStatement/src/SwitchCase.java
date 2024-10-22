import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 2;
        switch(a) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }//BCD
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력해주세요: ");
        String day = scanner.nextLine();
        switch (day) {
            case "월":
            case "월요일":
                System.out.println("오늘은 월요일입니다.");
                break;
            case "mon":
            case "Mon":
            case "Monday":
                System.out.println("Today is Monday.");
                break;
            case "화":
            case "화요일":
                System.out.println("오늘은 화요일입니다.");
                break;
            case "tue":
            case "Tue":
            case "Tues":
            case "Tuesday":
                System.out.println("Today is Tuesday.");
                break;
            case "수":
            case "수요일":
                System.out.println("오늘은 수요일입니다.");
                break;
            case "wed":
            case "Wed":
            case "Wednes":
            case "Wednesday":
                System.out.println("Today is Wednesday.");
                break;
            case "목":
            case "목요일":
                System.out.println("오늘은 목요일입니다.");
                break;
            case "thu":
            case "Thu":
            case "Thur":
            case "Thursday":
                System.out.println("Today is Thursday.");
                break;
            case "금":
            case "금요일":
                System.out.println("오늘은 금요일입니다.");
                break;
            case "fri":
            case "Fri":
            case "Friday":
                System.out.println("Today is Friday.");
                break;
            case "토":
            case "토요일":
                System.out.println("오늘은 토요일입니다.");
                break;
            case "sat":
            case "Sat":
            case "Satur":
            case "Saturday":
                System.out.println("Today is Saturday.");
                break;
            case "일":
            case "일요일":
                System.out.println("오늘은 휴일입니다.");
                break;
            case "sun":
            case "Sun":
            case "Sunday":
                System.out.println("Today is holiday.");
                break;
            default:
                System.out.println("올바른 요일을 입력해주세요.");
        }
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킴
    }
}
