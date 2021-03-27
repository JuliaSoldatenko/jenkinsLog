package com.kaz.jenkins;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private static final Logger logger = (Logger) LogManager.getLogger(CalculatorTest.class);

    @Test
    public void addTest() {
        logger.log(Level.ERROR, "==== Test start ===");
        int a = 2;
        int b = 3;
        int expectedResult = 2 + 3;
        assertEquals(String.format("{%s} + {%s} is {%s} ", a, b, expectedResult), expectedResult, Calculator.add(a, b));
        logger.log(Level.ERROR, "==== Test end ===");
    }

    @Test
    public void divideTest() {
        logger.log(Level.ERROR, "==== Test start ====");
        int a = 9;
        int b = 3;
        int expectedResult = 2;
        assertEquals(String.format("{%s} / {%s} is {%s} ", a, b, expectedResult), expectedResult, Calculator.divide(a, b));

        logger.log(Level.INFO, "==== Test end ===");
    }
}
