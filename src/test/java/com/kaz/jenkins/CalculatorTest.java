package com.kaz.jenkins;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import util.ProjectLog;

@Feature("Calculator tests")
public class CalculatorTest extends BaseTest{

    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 0, description = "Add test for Calculator")
    public void addTest() {
        ProjectLog.info("==== Test [addTest] start ===");
        int a = 2;
        int b = 3;
        int expectedResult = 2 + 3;
        Assert.assertEquals(String.format("{%s} + {%s} is {%s} ", a, b, expectedResult), Calculator.add(a, b), expectedResult);
        ProjectLog.info("==== Test [addTest] end ===");
        Reporter.log("--> Reporter log in passed test <--");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 0, description = "Divide test for Calculator")
    public void divideTest() {
        ProjectLog.info("==== Test [divideTest] start ====");
        int a = 9;
        int b = 3;
        int expectedResult = 3;
        Assert.assertEquals(String.format("{%s} / {%s} is {%s} ", a, b, expectedResult), Calculator.divide(a, b), expectedResult);
        ProjectLog.info("==== Test [divideTest] end ===");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 0, description = "Failed test for Calculator")
    public void failedTest() {
        ProjectLog.info("==== Test [failedTest] start ====");
        Reporter.log(" --> Reporter logs of failed test <---");
        int a = 10;
        int b = 2;
        int expectedResult = a * b;
        Assert.assertEquals("Multiplying action assertion", expectedResult, Calculator.multiply(a, b));
        Reporter.log("One assertion has just passed");
        Assert.assertEquals("This should be [FALSE] but was [TRUE] ====", false, true);
        ProjectLog.info("==== Test [failedTest] end ===");
        Reporter.log("Assertion failed =( ");
    }
}
