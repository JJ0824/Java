import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 문자열을 거꾸로 출력하는 메서드
        // 예) hello 를 입력하면 olleh 를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str) {
        int count = 0;
        char[] chArray = str.toCharArray();
        char[] reverse = new char[chArray.length];
        for (int i = chArray.length - 1; i >= 0; i--) {
            reverse[count]=chArray[i];
            count = count + 1;
        }
        String reverseStr = new String(reverse);
        return reverseStr;
    }
}
//    public static String reverseString(String str) {
//
//       char[] chArray = str.toCharArray();
//       char[] reverse = new char[chArray.length];
//       int find = chArray.length - 1;
//       for (int i = 0; i < chArray.length ; i++) {
//         reverse[find]=chArray[i];
//         find = find - 1;
//       }
//       String reverseStr = new String(reverse);
//       return reverseStr; // return String.valueOf(reverseStr);
//    }
//}



//    public static String reverseString(String str) {
//        char[] charArray = str.toCharArray();
//        int left = 0;
//        int right = charArray.length - 1;
//        while (left < right) {
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//            left++;
//            right--;
//        }
//        return new String(charArray);
//    }
//}