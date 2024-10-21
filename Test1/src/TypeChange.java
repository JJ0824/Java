public class TypeChange {
    public static void main(String[] args) {
        //int value1 = (int)5.3;
        // 타입 캐스팅
        int value1 = (int)5.99; // 결과 5
        System.out.println(value1);
        //long value2 = (long)10;
        long value2 = 10L;
        //float value3 = (float)5.8;
        float value3 = 5.8F;
        double value4 = (double)16; // 안 붙여도 무방
        System.out.println(value4);

        int a = 5;
        int b = a++;
        // a=a+1 == 6
        System.out.println(a); // 6
        System.out.println(b); // 5
        // a=a+1 == 7
        System.out.println(++a); // 7
        // b=b+1 == 6
        System.out.println(++b); // 6
        // b=b-1 == 5
        System.out.println(a+++--b); // 12
        // a=a+1 == 8
        System.out.println(a+b); // 13

    }
}
