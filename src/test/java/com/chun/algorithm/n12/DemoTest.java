package com.chun.algorithm.n12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    String result;
    int number;

    public DemoTest(String result, int number) {
        this.result = result;
        this.number = number;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {"III", 3},
                {"IV", 4},
                {"IX", 9},
                {"LVIII", 58},
                {"MCMXCIV", 1994},
        });
    }

    @Test
    public void intToRoman() {
        assertEquals(result, Demo.intToRoman(number));
    }

}
