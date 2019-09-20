package com.chun.algorithm.n18;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    List<List<Integer>> result;
    int[] nums;
    int target;

    public DemoTest(List<List<Integer>> result, int[] nums, int target) {
        this.result = result;
        this.nums = nums;
        this.target = target;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        List<List<Integer>> res1 = new ArrayList<>();
        res1.add(Arrays.asList(new Integer[]{-1, 0, 3, 3}));

        List<List<Integer>> res2 = new ArrayList<>();
        res2.add(Arrays.asList(new Integer[]{0, 0, 0, 0}));

        List<List<Integer>> res3 = new ArrayList<>();
        res3.add(Arrays.asList(new Integer[]{-2, -1, 1, 2}));
        res3.add(Arrays.asList(new Integer[]{-2, 0, 0, 2}));
        res3.add(Arrays.asList(new Integer[]{-1, 0, 0, 1}));

        return Arrays.asList(new Object[][]{
                {res1, new int[]{-2,0,0,3,3,-1}, 5},
                {res2, new int[]{0,0,0,0}, 0},
                {res3, new int[]{1, 0, -1, 0, -2, 2}, 0},
        });
    }

    @Test
    public void fourSum() {
        List<List<Integer>> res = Demo.fourSum(nums, target);
        assertTrue(res.containsAll(result) && result.containsAll(res));
    }
}