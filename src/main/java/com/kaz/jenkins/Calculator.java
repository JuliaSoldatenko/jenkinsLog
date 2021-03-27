package com.kaz.jenkins;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public final class Calculator {

    private static final Logger logger = (Logger) LogManager.getLogger(Calculator.class);

    public static int add(int a, int b) {
        logger.log(Level.ERROR, String.format("Adding {%s}, {%s}", a, b));
        return a + b;
    }

    public static int extract(int a, int b) {
        logger.log(Level.ERROR, String.format("Extracting {%s}, {%s}", a, b));
        return a - b;
    }

    public static int multiply(int a, int b) {
        logger.log(Level.ERROR, String.format("Multiplying {%s}, {%s}", a, b));
        return a * b;
    }

    public static int divide(int a, int b) {
        logger.log(Level.ERROR, String.format("Dividing {%s}, {%s}", a, b));
        return a + b;
    }
}
