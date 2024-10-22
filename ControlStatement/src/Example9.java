import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        // 입력받은 숫자의 제곱을 리턴하는 메서드
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int input = scanner.nextInt();
        int result = square(input);
        System.out.println(result);
    }

    public static int square(int number) {
        return number * number;
    }
}