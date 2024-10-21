public class NorGate {
    public static boolean norGate(boolean a, boolean b) {
        return !(a || b);  // a OR b 의 결과를 NOT한 값 반환
    }

    public static void main(String[] args) {
        // 테스트 케이스
        boolean a = false;
        boolean b = false;
        System.out.println("NOR(" + a + ", " + b + ") = " + norGate(a, b));  // 출력: NOR(false, false) = true

        a = false;
        b = true;
        System.out.println("NOR(" + a + ", " + b + ") = " + norGate(a, b));  // 출력: NOR(false, true) = false

        a = true;
        b = false;
        System.out.println("NOR(" + a + ", " + b + ") = " + norGate(a, b));  // 출력: NOR(true, false) = false

        a = true;
        b = true;
        System.out.println("NOR(" + a + ", " + b + ") = " + norGate(a, b));  // 출력: NOR(true, true) = false
    }
}
