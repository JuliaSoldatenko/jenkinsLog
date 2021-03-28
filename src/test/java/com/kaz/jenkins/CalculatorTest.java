package com.kaz.jenkins;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;


public class CalculatorTest {

    private static final Logger logger = (Logger) LogManager.getLogger(CalculatorTest.class);

    @Test
    public void addTest() {
        logger.log(Level.ERROR, "==== Test [addTest] start ===");
        int a = 2;
        int b = 3;
        int expectedResult = 2 + 3;
        Assert.assertEquals(String.format("{%s} + {%s} is {%s} ", a, b, expectedResult), Calculator.add(a, b), expectedResult);
        logger.log(Level.ERROR, "==== Test [addTest] end ===");
    }

    @Test
    public void divideTest() {
        logger.log(Level.ERROR, "==== Test [divideTest] start ====");
        int a = 9;
        int b = 3;
        int expectedResult = 3;
        Assert.assertEquals(String.format("{%s} / {%s} is {%s} ", a, b, expectedResult), Calculator.divide(a, b), expectedResult);
        logger.log(Level.INFO, "==== Test [divideTest] end ===");
    }

    @Test
    public void failedTest() {
        logger.log(Level.ERROR, "==== Test [failedTest] start ====");
        Assert.assertEquals("This should be [FALSE] but was [TRUE] ====", false, true);
        logger.log(Level.INFO, "==== Test [failedTest] end ===");
    }
}
