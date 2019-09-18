package algorithm;

import com.chun.algorithm.FloorMaxRunningCount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * n 层的楼梯，每次只能走1层，或者2层，总共有多少种走法
 * 提示：需要使用到动态规划
 *
 * @Author chun
 * @Date 2019/9/18 11:06
 */
@RunWith(Parameterized.class)
public class FloorMaxRunningCountTest {

    int result;
    int floor;

    public FloorMaxRunningCountTest(int result, int floor) {
        this.result = result;
        this.floor = floor;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                {0, -1},
                {1, 1},
                {2, 2},
                {3, 3},
                {5, 4},
                {89, 10},
        });
    }

    @Test
    public void test(){
        Assert.assertEquals(result, FloorMaxRunningCount.fromBottom2Top(floor));
    }

    @Test
    public void test2(){
        Assert.assertEquals(result, FloorMaxRunningCount.fromTop2Bottom(floor, new HashMap<>()));
    }
}
