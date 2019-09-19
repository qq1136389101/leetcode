package com.chun.algorithm.n14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    String result;
    String[] input;

    public DemoTest(String result, String[] input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {"fl", new String[]{"flower","flow","flight"}},
                {"", new String[]{"dog","racecar","car"}},
                {"aaaaaaaaaaaaaaaaaaaaa", new String[]{"aaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaa"}},
                {"", new String[]{}},
        });
    }

    @Test
    public void longestCommonPrefix() {
        assertEquals(result, Demo.longestCommonPrefix(input));
    }
}