package com.chun.zuochengyun.bucketsort;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class Code03_HeapSortTest {

    @Test
    public void heapsortTest1(){
        int[] arr = new int[]{0, 6, 5, 3, 4, 7, 9};
        Code03_HeapSort code03_heapSort = new Code03_HeapSort();
        code03_heapSort.heapsort(arr);
        Assert.assertArrayEquals(new int[]{0, 3, 4, 5, 6, 7, 9}, arr);
    }

    @Test
    public void heapsortTest2(){
        int[] arr = new int[]{};
        Code03_HeapSort code03_heapSort = new Code03_HeapSort();
        code03_heapSort.heapsort(arr);
        Assert.assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void heapsortTest3(){
        int[] arr = new int[]{3};
        Code03_HeapSort code03_heapSort = new Code03_HeapSort();
        code03_heapSort.heapsort(arr);
        Assert.assertArrayEquals(new int[]{3}, arr);
    }

    @Test
    public void heapsortTest4(){
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Code03_HeapSort code03_heapSort = new Code03_HeapSort();
        code03_heapSort.heapsort(arr);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }
}