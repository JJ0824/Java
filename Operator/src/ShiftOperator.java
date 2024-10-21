public class ShiftOperator {
    public static void main(String[] args) {
        // 시프트연산자
        System.out.println(3 << 1); // 6
        /* 0000 ... 0000 0011
        *  <<1 == 비트 1칸 이동 방향대로
        * 0000 ... 0000 0110
        * 32번째 부호비트는 시프트하지 않는다
        * 대신 31번째 비트가 소멸함 */
        System.out.println(-3 << 1); // -6
        /*    0000 ... 0000 0011 == 3
        *  ~  1111 ... 1111 1100 == -2
        *  +1 1111 ... 1111 1101 == -3
        * <<1 1111 ... 1111 1010 */
        System.out.println(3<<2); // 12
        System.out.println(-3<<2); // -12
        System.out.println(3<<3); // 24
        System.out.println(-3<<3); // -24

        System.out.println(5>>1); // 2
        /*  0000 ... 0000 0101
        * >>1
        * 31번째 비트는 부호비트와 같다
        *   0000 ... 0000 0010 */
        System.out.println(-5>>1); // -3
        /*  1111 ... 1111 1011
        * >>1
        * 31번째 비트는 부호비트와 같다
        *   1111 ... 1111 1101 */
        System.out.println(5>>2); // 1
        System.out.println(-5>>2); // -2
        System.out.println(5>>3); // 0
        System.out.println(-5>>3); // -1
    }
}
