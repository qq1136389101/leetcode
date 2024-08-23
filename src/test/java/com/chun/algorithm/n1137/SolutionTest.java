package com.chun.algorithm.n1137;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    int result;
    int input1;

    public SolutionTest(int result, int input1) {
        this.result = result;
        this.input1 = input1;
    }

    @Parameterized.Parameters
    public static Collection<Object> t() {
        return Arrays.asList(new Object[][]{
                {1389537, 25},
                {4, 4},
                {0, 0},
        });
    }

    @Test
    public void tribonacci() {
        assertEquals(result, Demo.tribonacci(input1));
    }
}