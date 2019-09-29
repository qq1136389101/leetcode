package com.chun.algorithm.n64;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    int result;
    int[][] input;

    public DemoTest(int result, int[][] input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t() {
        return Arrays.asList(new Object[][]{
                {7, new int[][]{
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1},
                }},
        });
    }

    @Test
    public void minPathSum() {
        assertEquals(result, Demo.minPathSum(input));
    }
}