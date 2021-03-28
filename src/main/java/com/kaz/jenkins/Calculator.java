package com.kaz.jenkins;

import org.apache.log4j.Logger;

public final class Calculator {

    final static Logger LOGGER = Logger.getLogger(Calculator.class);

    public static int add(int a, int b) {
        LOGGER.info(String.format("Adding {%s}, {%s}", a, b));
        return a + b;
    }

    public static int extract(int a, int b) {
        LOGGER.info(String.format("Extracting {%s}, {%s}", a, b));
        return a - b;
    }

    public static int multiply(int a, int b) {
        LOGGER.info(String.format("Multiplying {%s}, {%s}", a, b));
        return a * b;
    }

    public static int divide(int a, int b) {
        LOGGER.info(String.format("Dividing {%s}, {%s}", a, b));
        return a / b;
    }
}
