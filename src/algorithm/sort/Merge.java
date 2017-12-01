package algorithm.sort;

import common.Datas;

/**
 * 归并排序
 * 将待排序数据列表分为若干个子列表，每个子序列是有序的
 * 然后再把有序子序列合并，按照顺序排列整合为一个有序列表
 * 时间复杂度为O(nlogn)
 */
public class Merge {

    private static void sort(int[] arrays, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(arrays, low, mid);
            sort(arrays, mid + 1, high);
            merge(arrays, low, mid, high);
        }
    }

    public static void merge(int[] arrays, int low, int mid, int high) {
        System.out.println("merge " + low + " - " + high);
        int[] tempArray = new int[high - low + 1];
        int left = low;// 左指针
        int right = mid + 1;// 右指针
        int mLastIndex = 0;

        // 把较小的数先移到新数组中
        while (left <= mid && right <= high) {
            if (arrays[left] < arrays[right]) {
                tempArray[mLastIndex++] = arrays[left++];
            } else {
                tempArray[mLastIndex++] = arrays[right++];
            }
        }

        // 把左边剩余的数移入数组
        while (left <= mid) {
            tempArray[mLastIndex++] = arrays[left++];
        }

        // 把右边边剩余的数移入数组
        while (right <= high) {
            tempArray[mLastIndex++] = arrays[right++];
        }

        // 把新数组中的数覆盖nums数组
        for (int i = 0; i < tempArray.length; i++) {
            arrays[i + low] = tempArray[i];
        }

        Datas.print(arrays);
    }

    public static void main(String[] args) {
        int[] arrays = Datas.ARRAY;
        sort(arrays, 0, arrays.length - 1);
    }

}
