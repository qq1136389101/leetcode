package com.chun.algorithm.n198;

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
                {4, new int[]{1,2,3,1}},
                {12, new int[]{2,7,9,3,1}},
        });
    }

    @Test
    public void rob() {
        assertEquals(result, Demo.rob(input1));
    }
}