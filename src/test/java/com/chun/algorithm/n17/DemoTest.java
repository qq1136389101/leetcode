package com.chun.algorithm.n17;

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
    String input;

    public DemoTest(List<String> result, String input) {
        this.result = result;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {Arrays.asList(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}), "23"},
                {Arrays.asList(new String[]{"adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"}), "234"},
                {Arrays.asList(new String[]{}), ""},
                {Arrays.asList(new String[]{"m", "n", "o"}), "6"},
        });
    }

    @Test
    public void letterCombinations() {
        List<String> a = Demo.letterCombinations(input);
        assertTrue(a.containsAll(result) && result.containsAll(a));
    }
}