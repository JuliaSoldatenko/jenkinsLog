//package com.kaz.jenkins.listeners;
//
//import io.qameta.allure.Attachment;
//import org.apache.logging.log4j.Level;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//public class TestListener implements ITestListener {
//
//    private static final Logger LOGGER = (Logger) LogManager.getLogger(TestListener.class);
//
//    // Text attachments for Allure
//    @Attachment(value = "{0}", type = "text/plain")
//    public static String saveTextLog(final String message) {
//        return message;
//    }
//
//    @Override
//    public void onTestStart(ITestResult iTestResult) {
//        LOGGER.log(Level.ERROR, "===> On test start <===");
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult iTestResult) {
//        LOGGER.log(Level.ERROR, "===> On test SUCCESS <===");
//    }
//
//    @Override
//    public void onTestFailure(ITestResult iTestResult) {
//        LOGGER.log(Level.ERROR, "===> On test FAILURE <===");
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult iTestResult) {
//        //TODO
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
//        //TODO
//    }
//
//    @Override
//    public void onStart(ITestContext iTestContext) {
//        LOGGER.log(Level.ERROR, "===> On START <===");
//    }
//
//    @Override
//    public void onFinish(ITestContext iTestContext) {
//        LOGGER.log(Level.ERROR, "===> On FINISH <===");
//    }
//}
