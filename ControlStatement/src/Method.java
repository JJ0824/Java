public class Method {
    public static void main(String[] args) {
        // 메서드 없이 홀짝을 구분하는 코드
        int num = 4;

        String str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 5;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 6;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 7;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 8;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 9;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 10;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        // 메서드의 사용, 호출(= call method)
        checkOddEven(4);
        checkOddEven(5);
        checkOddEven(6);
        checkOddEven(7);
        checkOddEven(8);
        checkOddEven(9);
        checkOddEven(10);
        // checkOddEven(int number=5) // 에러!! 매개변수는 값만 입력


        System.out.println("메서드의 return");
        checkOddEven(100);
        System.out.println(checkOddEven2(100));
        /* 메소드의 실제 실행 설명
        checkOddEven(4);
        int number = 4; // 내부적으로 동작!
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수

        checkOddEven(5);
        int number = 5; // 내부적으로 동작!
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str); // 홀수

        checkOddEven(6);
        int number = 6; // 내부적으로 동작!
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수

        checkOddEven(7);
        int number = 7; // 내부적으로 동작!
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str); // 홀수

        checkOddEven(8);
        int number = 8; // 내부적으로 동작!
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수

        checkOddEven(9);
        int number = 9; // 내부적으로 동작!
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str); // 홀수

        checkOddEven(10);
        int number = 10; // 내부적으로 동작!
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수 */
    }
    // 메서드의 선언, 정의
    // public static void checkOddEven(number) // 에러!! 정의는 자료형필수
    public static void checkOddEven(int number) {
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str);
    }
    public static String checkOddEven2(int number) {
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        return str;
    }

}
