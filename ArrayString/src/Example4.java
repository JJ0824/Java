public class Example4 {
    public static void main(String[] args) {
        String[] colors = {"black", "white", "red", "green", "blue"};
        System.out.println(findColor(colors, "white")); // 1
        System.out.println(findColor(colors, "green")); // 3
        System.out.println(findColor(colors, "yellow")); // -1
    }

//    public static int findColor(String[] colors, String data) {
//        int count = 0;
//        for(int i = 0 ; i < colors.length; i++) {
//            if (colors[i].equals(data)) {
//                break;
//            }
//            count = count + 1;
//        }
//        if (count == colors.length) {
//            return -1;
//        }else {
//            return count;
//        }
//    }
//}
    public static int findColor(String[] colors, String data) {
        for(int i = 0 ; i < colors.length; i++) {
            if (colors[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }
}