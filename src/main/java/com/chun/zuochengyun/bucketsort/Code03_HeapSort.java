package com.chun.zuochengyun.bucketsort;

/**
 * 堆排序
 */
public class Code03_HeapSort {

    /**
     * 堆排序
     * @param arr
     * @return
     */
    public void heapsort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        // 变成堆结构
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }

        // 将获取到的根与大顶堆的最后一个节点交换后，堆大小减1，然后再重新转换成堆结构，重复以上操作最终得出排序后的结果
        int heapSize = arr.length;
        while (heapSize > 0){
            // swap(arr, 0, heapSize-1);
            // heapSize--;
            // 上面两行代码可以简写成 swap(arr, 0, --heapSize);
            swap(arr, 0, heapSize-1);
            heapSize--;
            heapify(arr, 0, heapSize);
        }
    }

    /**
     * 堆的末尾添加新元素
     *
     * @param arr 数组
     * @param index 添加的数字的索引
     */
    public void heapInsert(int[] arr, int index){
        while (arr[index] > arr[(index-1) / 2]){
            swap(arr, index, (index-1) / 2);
            index = (index-1) / 2;
        }
    }

    /**
     * 对于在堆的 index 位置插入的元素，将插入元素后的堆转换成堆结构
     *
     * @param arr 堆
     * @param index 要去掉的节点的索引
     */
    public void heapify(int[] arr, int index, int heapSize){
        int left = 2 * index + 1;
        while (left < heapSize){
            int maxIndex = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            maxIndex = arr[maxIndex] > arr[index] ? maxIndex : index;
            if(maxIndex == index){
                break;
            }
            swap(arr, maxIndex, index);
            index = maxIndex;
            left = 2 * index + 1;
        }
    }

    /**
     * 数组位置交换
     *
     * @param arr 数组
     * @param a 索引A
     * @param b 索引B
     */
    public void swap(int[] arr, int a, int b){
        int t;
        t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
