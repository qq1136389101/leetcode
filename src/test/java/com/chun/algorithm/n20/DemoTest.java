package com.chun.algorithm.n20;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    boolean result;
    String input;

    public DemoTest(boolean result, String input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {true, "(([]){})"},
                {false, "){"},
                {true, ""},
                {true, "{}"},
                {true, "{}[]{}"},
                {false, "{]"},
                {false, "([)}"},
                {true, "{[]}"},
        });
    }

    @Test
    public void isValid() {
        assertEquals(result, Demo.isValid(input));
    }
}