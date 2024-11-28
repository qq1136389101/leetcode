package com.chun.algorithm.n63;

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
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {2, new int[][]{
                        {0, 0, 0},
                        {0, 1, 0},
                        {0, 0, 0},
                }},
//                {1, new int[][]{
//                        {0, 1},
//                        {0, 0}
//                }}
        });
    }

    @Test
    public void uniquePathsWithObstacles() {
        assertEquals(result, Demo.uniquePathsWithObstacles2(input));
    }
}