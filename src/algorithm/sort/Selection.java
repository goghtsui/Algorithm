package algorithm.sort;

import common.Datas;

/**
 * 选择排序
 * 目标数字从 0 开始，依次和后面的数字比较，最终将最小的数字交换到目标数字位置
 * 然后目标数字后移一位，重复上面的操作（固定循环 n - 1 次）
 */
public class Selection {
    public static void main(String[] args) {
        int[] arrays = Datas.ARRAY;
        int mIndex = 0;
        do {
            for (int i = (mIndex + 1); i < arrays.length; i++) {
                if (arrays[mIndex] > arrays[i]) {
                    int temp = arrays[mIndex];
                    arrays[mIndex] = arrays[i];
                    arrays[i] = temp;
                }
            }
            mIndex++;

            Datas.print(arrays);
        }
        while (mIndex < arrays.length);
    }
}
