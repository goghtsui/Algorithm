package common;

public class Datas {

    public static final int[] ARRAY = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

    public static void print(int[] arrays) {
        for (int num : arrays) {
            System.out.print("_" + num);
        }
        System.out.println();
    }
}
