package com.chun.algorithm.n15;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    List<List<Integer>> result;
    int[] input;

    public DemoTest(List<List<Integer>> result, int[] input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        List<List<Integer>> result1 = new ArrayList<>();
        result1.add(Arrays.asList(new Integer[]{-1, -1, 2}));
        result1.add(Arrays.asList(new Integer[]{-1, 0, 1}));

        List<List<Integer>> result2 = new ArrayList<>();
        result2.add(Arrays.asList(new Integer[]{-4, -2, 6}));
        result2.add(Arrays.asList(new Integer[]{-4, 0, 4}));
        result2.add(Arrays.asList(new Integer[]{-4, 1, 3}));
        result2.add(Arrays.asList(new Integer[]{-4, 2, 2}));
        result2.add(Arrays.asList(new Integer[]{-2, -2, 4}));
        result2.add(Arrays.asList(new Integer[]{-2, 0, 2}));

        return Arrays.asList(new Object[][]{
                {result1, new int[]{-1, 0, 1, 2, -1, -4}},
                {result2, new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}},
                {new ArrayList<>(), new int[]{}}
        });
    }

    @Test
    public void threeSum() {
        assertEquals(result, Demo.threeSum(input));
    }
}