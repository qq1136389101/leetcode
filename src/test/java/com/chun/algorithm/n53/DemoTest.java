package com.chun.algorithm.n53;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    int result;
    int[] input;

    public DemoTest(int result, int[] input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){

        return Arrays.asList(new Object[][]{
                {6, new int[]{-2,1,-3,4,-1,2,1,-5,4}},
        });
    }

    @Test
    public void maxSubArray() {
        assertEquals(result, Demo.maxSubArray(input));
    }
}