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

    boolean result;
    String s;
    String p;


    public Test10(boolean result, String s, String p) {
        this.result = result;
        this.s = s;
        this.p = p;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                /**
                 * 测试正确匹配的例子
                */
                // 测试空模式
//                {true, "", ""},
//
//                // 测试 . 的使用
//                {true, "mississippi", "miss.ssippi"},
//                {true, "mississippi", ".ississipp."},
//                {true, "mississippi", "missi..ippi"},

                // 测试 * 的使用
                {true, "aa", "a*"},
//                {true, "aab", "c*a*b"},
//                {true, "mississippi", "mis*issippi*"},
//                {true, "miissippi", "mis*issippi*"},
//
//                // 测试 . 与 * 的组合使用
//                {true, "missiippi", "mi.*is*ippi"},
//                {true, "missiippi", ".is*is*ippi"},
//                {true, "misiippi", "misis*ipp."},
//
//                /**
//                 * 测试错误匹配的例子
//                */
//                {false, "abb", "b*"},
        });
    }

    @Test
    public void test(){
        Assert.assertEquals(result, Demo.isMatch(s, p));
    }

}
