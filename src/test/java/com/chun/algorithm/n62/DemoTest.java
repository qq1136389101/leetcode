package com.chun.algorithm.n62;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    int result;
    int m;
    int n;

    public DemoTest(int result, int m, int n) {
        this.result = result;
        this.m = m;
        this.n = n;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {3, 3, 2},
                {28, 7, 3},
        });
    }

    @Test
    public void uniquePaths() {
        assertEquals(result, Demo.uniquePaths2(m, n));
    }
}