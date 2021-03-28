package com.kaz.jenkins;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{

    final static Logger LOGGER = Logger.getLogger(CalculatorTest.class);

    @Test(description = "Add test for Calculator")
    public void addTest() {
        LOGGER.info("==== Test [addTest] start ===");
        int a = 2;
        int b = 3;
        int expectedResult = 2 + 3;
        Assert.assertEquals(String.format("{%s} + {%s} is {%s} ", a, b, expectedResult), Calculator.add(a, b), expectedResult);
        LOGGER.info("==== Test [addTest] end ===");
        Reporter.log("--> Reporter log in passed test <--");
    }

    @Test(description = "Divide test for Calculator")
    public void divideTest() {
        LOGGER.info("==== Test [divideTest] start ====");
        int a = 9;
        int b = 3;
        int expectedResult = 3;
        Assert.assertEquals(String.format("{%s} / {%s} is {%s} ", a, b, expectedResult), Calculator.divide(a, b), expectedResult);
        LOGGER.info("==== Test [divideTest] end ===");
    }

    @Test(description = "Failed test for Calculator")
    public void failedTest() {
        LOGGER.info("==== Test [failedTest] start ====");
        Reporter.log(" --> Reporter logs of failed test <---");
        int a = 10;
        int b = 2;
        int expectedResult = a * b;
        Assert.assertEquals("Multiplying action assertion", expectedResult, Calculator.multiply(a, b));
        Reporter.log("One assertion has just passed");
        Assert.assertEquals("This should be [FALSE] but was [TRUE] ====", false, true);
        LOGGER.info("==== Test [failedTest] end ===");
        Reporter.log("Assertion failed =( ");
    }
}
