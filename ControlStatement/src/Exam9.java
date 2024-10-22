public class Exam9 {
    // 여러 숫자를 제곱하는 메서드 (가변 인자 사용)
    public static int[] square(int... numbers) {
        int[] squaredNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            squaredNumbers[i] = numbers[i] * numbers[i];
        }
        return squaredNumbers;
    }


    public static void main(String[] args) {
        int[] result = square(2, 3, 4);
        for (int num : result) {
            System.out.println(num);  // 출력: 4, 9, 16
        }

    }
}