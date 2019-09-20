package com.chun.algorithm.n16;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    int result;
    int[] nums;
    int target;

    public DemoTest(int result, int[] nums, int target) {
        this.result = result;
        this.nums = nums;
        this.target = target;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {2, new int[]{-1, 2, 1, -4}, 1},
                {8, new int[]{6, 3, 5, 0}, 4},
                {-6, new int[]{9, -3, -4, 1}, -2},
                {0, new int[]{0, 2, 1, -3}, 1},
                {3, new int[]{1, 1, 1, 1}, 3},
                {13, new int[]{1,2,5,10,11}, 12},
                {80, new int[]{1,6,9,14,16,70}, 81},
        });
    }

    @Test
    public void threeSumClosest() {
        assertEquals(result, Demo.threeSumClosest(nums, target));
    }
}