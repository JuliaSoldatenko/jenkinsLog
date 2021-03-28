package com.kaz.jenkins;

import util.ProjectLog;

public final class Calculator {

    public static int add(int a, int b) {
        ProjectLog.info(String.format("Adding {%s}, {%s}", a, b));
        return a + b;
    }

    public static int extract(int a, int b) {
        ProjectLog.info(String.format("Extracting {%s}, {%s}", a, b));
        return a - b;
    }

    public static int multiply(int a, int b) {
        ProjectLog.info(String.format("Multiplying {%s}, {%s}", a, b));
        return a * b;
    }

    public static int divide(int a, int b) {
        ProjectLog.info(String.format("Dividing {%s}, {%s}", a, b));
        return a / b;
    }
}
