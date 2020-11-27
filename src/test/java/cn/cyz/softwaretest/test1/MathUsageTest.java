package cn.cyz.softwaretest.test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUsageTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPass() {
        //测试数据
        double[] values = new double[] {3.59, 4.01,3.69, 4.26, 2.95, 3.26, 3.56, 3.46, 3.58, 3.17, 3.59, 0.66 };
        MathUsage mathusage = new MathUsage();
        int result = mathusage.isPass(values);
        assertEquals(1, result);
    }
}