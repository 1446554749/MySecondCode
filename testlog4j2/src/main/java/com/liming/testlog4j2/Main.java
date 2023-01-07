package com.liming.testlog4j2;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
//    static Logger logger = LogManager.getLogger(Main.class);
    static Logger logger = LoggerFactory.getLogger("log4j2");
    public static void main(String[] args) {
        logger.info("test log4j2");
    }
}
