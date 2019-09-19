package com.chun.algorithm.n13;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    int result;
    String input;

    public DemoTest(int result, String input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {3, "III"},
                {4, "IV"},
                {9, "IX"},
                {58, "LVIII"},
                {1994, "MCMXCIV"},
                {1476, "MCDLXXVI"},
        });
    }

    @Test
    public void romanToInt() {
        assertEquals(result, Demo.romanToInt(input));
    }
}