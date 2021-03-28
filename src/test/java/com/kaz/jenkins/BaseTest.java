package com.kaz.jenkins;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void init() {
        //This is to start the Log4j logging in the test case
    }
}
