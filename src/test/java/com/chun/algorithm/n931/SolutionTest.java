package com.chun.algorithm.n931;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.chun.algorithm.n931.Demo.*;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    int result;
    int[][] input1;

    public SolutionTest(int result, int[][] input1) {
        this.result = result;
        this.input1 = input1;
    }

    @Parameterized.Parameters
    public static Collection<Object> t() {
        return Arrays.asList(new Object[][]{
                {13, new int[][]{{2,1,3}, {6,5,4}, {7,8,9}}},
                {-59, new int[][]{{-19,57}, {-40,-5}}},
        });
    }

    @Test
    public void tribonacci() {
//        assertEquals(result, Demo.minFallingPathSum(input1));
        assertEquals(result, Demo.minFallingPathSum2(input1));
    }
}