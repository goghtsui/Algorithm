package algorithm.sort;

import common.Datas;

/**
 * 插入排序
 * 目标数字索引从 1 开始，依次和前面的数字比较，并根据大小决定是否交换位置
 * 如果发生交换，则目标数字索引同步替换为所交换位置的索引值
 * 然后通过新的索引值数字继续和前面的比较，直到没有交换发生
 */
public class Insertion {

    public static void main(String[] args) {
        int[] arrays = Datas.ARRAY;
        int mCount = 1;
        do {
            int minIndex = mCount;
            for (int i = (mCount - 1); i >= 0; i--) {
                if (arrays[minIndex] < arrays[i]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[minIndex];
                    arrays[minIndex] = temp;
                    minIndex = i;
                }
            }

            mCount++;

            Datas.print(arrays);
        }
        while (mCount < arrays.length);
    }
}
