package com.nwpu.demo0922;

import org.junit.Assert;
import org.junit.Test;

public class FindValTest {

    int[] array = {2, 3, 5, 1, 7, 4, 9, 10, 6};

    @Test
    //  测试：查找边界值2
    public void testsearch1() {
        Assert.assertEquals(true, new FindVal().search(array, 2));
    }

    @Test
    // 测试：查找边界值6
    public void testsearch2() {
        Assert.assertEquals(true, new FindVal().search(array, 6));
    }

    @Test
    // 测试：查找中间随机的一个值7
    public void testsearch3() {
        Assert.assertEquals(true, new FindVal().search(array, 7));
    }

    @Test
    // 测试：查找数组外的一个值8
    public void testsearch4() {
        Assert.assertEquals(false, new FindVal().search(array, 8));
    }
}
