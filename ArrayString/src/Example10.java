import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        // 아래 2차원 배열의 모든 값의 합과 평균을 출력하는 메서드

        int[][] arr1 = {
                {5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int[][] arr2 = {
                {5, 5, 5, 5},
                {10,10,10},
                {20,20,20,20,20,20},
                {30,30,30,30,30,30,30,30,30,30}
        };

        calculate2DArray(arr1); // 325, 16.25
        calculate2DArray(arr2); // 470, 20.43
    }

    public static void calculate2DArray(int[][] arr) {
        int total = 0;
        double average = 0;
        int count = 0;

        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
                count = count + 1;
            }
        }

        average = (double) total / count;

        System.out.print("total="+total); // 325
        System.out.println(", average="+average); // 16.25
    }
}

//    public static void calculate2DArray(int[][] arr) {
//        int total = 0;
//        double average = 0;
//        int count = 0;
//
//        for (int i = 0 ; i < arr.length ; i++) {
//            int sum = 0;
//
//            for (int j = 0 ; j < arr[i].length ; j++) {
//                sum = sum+arr[i][j];
//            }
//
//            total = total + sum;
//            count = count + arr[i].length;
//        }
//
//        average = (double) total / count;
//
//        System.out.print("total="+total); // 325
//        System.out.println(", average="+average); // 16.25
//    }
//}