package algorithm.n11;

import com.chun.algorithm.n11.Demo;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Author chun
 * @Date 2019/9/18 15:58
 */
@RunWith(Parameterized.class)
public class Test {

    int result;
    int[] height;

    public Test(int result, int[] height) {
        this.result = result;
        this.height = height;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        return Arrays.asList(new Object[][]{
                {49, new int[]{1,8,6,2,5,4,8,3,7}},
                {4, new int[]{4,8}},
                {0, new int[]{8}},
        });
    }

    @org.junit.Test
    public void test(){
        Assert.assertEquals(result, Demo.maxArea(height));
    }
}
