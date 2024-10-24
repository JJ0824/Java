public class Example1 {
    public static void main(String[] args) {
        // 랜덤한 정수 10개를 가진 배열에서 특정 값을 찾는 메서드
        // 그 위치 인덱스값을 리턴하는 메서드
        // 만약 못찾으면 -1 리턴
        int[] numbers = {37, 82, 14, 56, 91, 23, 48, 65, 8, 74};
        System.out.println(findnumber(numbers, 91)); // 4
        System.out.println(findnumber(numbers, 65)); // 7
        System.out.println(findnumber(numbers, 100)); // -1
    }

//    public static int findnumber(int[] numbers, int target){
//        for(int i=0; i<numbers.length; i++) {
//            if (numbers[i] == target) {
//                return i; // 찾았을 경우에는 인덱스를 리턴
//            }
//        }
//        return -1; // 못 찾았을 때는 반복문이 종료 된 다음 -1을 리턴
//    }
    public static int findnumber(int[] numbers, int target){
       // For-Each문 사용
        int index = 0;
        for (int data : numbers) {
            if (data == target) {
                return index;
            }
            index = index + 1;
        }
        return -1;
    }
}
