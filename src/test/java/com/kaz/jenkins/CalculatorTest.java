package com.kaz.jenkins;

//import com.kaz.jenkins.listeners.TestListener;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import static com.kaz.jenkins.listeners.TestListener.saveTextLog;

//@Listeners(TestListener.class)
@Feature("Calculator tests")
public class CalculatorTest {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(CalculatorTest.class);

    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 0, description = "Add test for Calculator")
    public void addTest() {
        LOGGER.log(Level.ERROR, "==== Test [addTest] start ===");
//        saveTextLog("==== Test [addTest] start FROM ALLURE ===");
        int a = 2;
        int b = 3;
        int expectedResult = 2 + 3;
        Assert.assertEquals(String.format("{%s} + {%s} is {%s} ", a, b, expectedResult), Calculator.add(a, b), expectedResult);
        LOGGER.log(Level.ERROR, "==== Test [addTest] end ===");
        Reporter.log("--> Reporter log in passed test <--");
//        saveTextLog("==== Test [addTest] end FROM ALLURE ===");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 0, description = "Divide test for Calculator")
    public void divideTest() {
        LOGGER.log(Level.ERROR, "==== Test [divideTest] start ====");
//        saveTextLog("==== Test [divideTest] start FROM ALLURE ====");
        int a = 9;
        int b = 3;
        int expectedResult = 3;
        Assert.assertEquals(String.format("{%s} / {%s} is {%s} ", a, b, expectedResult), Calculator.divide(a, b), expectedResult);
        LOGGER.log(Level.INFO, "==== Test [divideTest] end ===");
//        saveTextLog("==== Test [divideTest] end FROM ALLURE ===");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 0, description = "Failed test for Calculator")
    public void failedTest() {
        LOGGER.log(Level.ERROR, "==== Test [failedTest] start ====");
        Reporter.log(" --> Reporter logs of failed test <---");
//        saveTextLog("==== Test [failedTest] start FROM ALLURE ====");
        int a = 10;
        int b = 2;
        int expectedResult = a * b;
        Assert.assertEquals("Multiplying action assertion", expectedResult, Calculator.multiply(a, b));
        Reporter.log("One assertion has just passed");
        Assert.assertEquals("This should be [FALSE] but was [TRUE] ====", false, true);
        LOGGER.log(Level.INFO, "==== Test [failedTest] end ===");
//        saveTextLog("==== Test [failedTest] FROM ALLURE end ===");
        Reporter.log("Assertion failed =( ");
    }
}
