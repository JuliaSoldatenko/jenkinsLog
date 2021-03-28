package util;

import org.apache.log4j.Logger;

public final class ProjectLog {

    //Initialize Log4j logs
    private static Logger LOG = Logger.getLogger(ProjectLog.class.getName());//

    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
    public static void startTestCase(String sTestCaseName){
        LOG.info("****************************************************************************************");
        LOG.info("****************************************************************************************");
        LOG.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        LOG.info("****************************************************************************************");
        LOG.info("****************************************************************************************");
    }

    //This is to print log for the ending of the test case
    public static void endTestCase(String sTestCaseName){
        LOG.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
    }

    public static void info(String message) {
        LOG.info(message);
    }

    public static void warn(String message) {
        LOG.warn(message);
    }

    public static void error(String message) {
        LOG.error(message);
    }

    public static void fatal(String message) {
        LOG.fatal(message);
    }

    public static void debug(String message) {
        LOG.debug(message);
    }
}
