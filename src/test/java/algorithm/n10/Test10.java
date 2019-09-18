package algorithm.n10;

import com.chun.algorithm.n10.Demo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author chun
 * @Date 2019/9/17 10:02
 */
@RunWith(Parameterized.class)
public class Test10 {

    String s;
    String p;


    public Test10(String s, String p) {
        this.s = s;
        this.p = p;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
//                // 测试空模式
//                {"", ""},
//
//                // 测试 . 的使用
//                {"mississippi", "miss.ssippi"},
//                {"mississippi", ".ississipp."},
//                {"mississippi", "missi..ippi"},

                // 测试 * 的使用
//                {"mississippi", "mis*issippi*"},
//
//                // 测试 . 与 * 的组合使用
//                {"missiippi", "mi.*is*ippi"},
//                {"missiippi", ".is*is*ippi"},
                {"misiippi", "misis*ipp."}
        });
    }

    @Test
    public void test(){
        Assert.assertTrue(Demo.isMatch(s, p));
    }

}
