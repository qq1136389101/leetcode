package com.chun.algorithm.n22;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    List<String> result;
    int input;

    public DemoTest(List<String> result, int input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){

        return Arrays.asList(new Object[][]{
                {Arrays.asList(new String[]{"((()))","(()())","(())()","()(())","()()()"}), 3},
//                {Arrays.asList(new String[]{"()"}), 1},
//                {Arrays.asList(new String[]{""}), 0},
        });
    }

    @Test
    public void generateParenthesis() {
        List<String> arr = Demo.generateParenthesis(input);
        assertTrue(result.containsAll(arr) && arr.containsAll(result));
    }
}