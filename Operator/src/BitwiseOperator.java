public class BitwiseOperator {
    public static void main(String[] args) {
        // 비트 연산자
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101
        System.out.println(Integer.toOctalString(data)); // 15
        System.out.println(Integer.toHexString(data)); // d
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 13
        System.out.println(Integer.parseInt("15", 8)); // 13
        System.out.println(Integer.parseInt("0d", 16)); // 13
        System.out.println();

        System.out.println(13); // 13
        System.out.println(0b1101); // 13
        System.out.println(015); // 13
        System.out.println(0xd); // 13
        System.out.println();

        // & 비트연산자
        System.out.println(3&10); // 2
        System.out.println(12&9); // 8
        // | 비트연산자
        System.out.println(3|10); // 11
        // ^ 비트연산자
        System.out.println(3^10); // 9
        // ! 비트연산자
        System.out.println(~3); // -4
        /* 0000 ... 0000 0011 ~
        *  1111 ... 1111 1100*/
        /* 3+-2 컴퓨터 처리
        *    0000 ... 0000 0011
        *  -2 계산  1111 ... 1111 1101 =+1=> 1111 ... 1111 1110 == -2
        * +  1111 ... 1111 1110
        *    0000 ... 0000 0001 == 1 */
    }
}









