package com.liming.testlog4j;


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.apache.log4j.Logger;

public class Main {
//    static Logger logger = LoggerFactory.getLogger("log4j");
    static Logger logger = Logger.getLogger("log4j");
    public static void main(String[] args) {
        logger.info("test log4j");
    }
}
