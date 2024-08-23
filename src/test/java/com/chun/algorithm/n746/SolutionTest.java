package com.chun.algorithm.n746;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    int result;
    int[] input1;

    public SolutionTest(int result, int[] input1) {
        this.result = result;
        this.input1 = input1;
    }

    @Parameterized.Parameters
    public static Collection<Object> t() {
        return Arrays.asList(new Object[][]{
//                {15, new int[]{10,15,20}},
                {6, new int[]{1,100,1,1,1,100,1,1,100,1}},
        });
    }

    @Test
    public void tribonacci() {
        assertEquals(result, Demo.minCostClimbingStairs(input1));
    }
}