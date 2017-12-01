package algorithm.sort;

import common.Datas;

/**
 * 冒泡排序：
 * 升序：从左侧开始，相邻的两个数据比较，小的放在左边，大的在右边
 * 重复以上操作（结束标志以没有交换的数字为止）
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arrays = Datas.ARRAY;
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                    swap = true;
                }
            }

            Datas.print(arrays);
        } while (swap);
    }
}
