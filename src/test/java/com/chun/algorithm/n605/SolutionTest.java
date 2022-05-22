package com.chun.algorithm.n605;

import com.chun.algorithm.n70.Demo;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    boolean result;
    int[] input1;
    int input2;

    public SolutionTest(boolean result, int[] input1, int input2) {
        this.result = result;
        this.input1 = input1;
        this.input2 = input2;
    }

    @Parameterized.Parameters
    public static Collection<Object> t() {
        return Arrays.asList(new Object[][]{
                {true, new int[]{1,0,0,0,1}, 1},
                {true, new int[]{1,0,0,0,1,0,0}, 2},
                {false, new int[]{1,0,0,0,1}, 2},
                {true, new int[]{1,0,0,0,0,0,1}, 2},
                {false, new int[]{0,1,0}, 1},
        });
    }

    @Test
    public void canPlaceFlowers() {
        assertEquals(result, Solution.canPlaceFlowers(input1, input2));
    }
}