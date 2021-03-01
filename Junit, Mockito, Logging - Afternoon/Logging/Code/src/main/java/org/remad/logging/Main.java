package org.remad.logging;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.remad.logging.protocol.Protocol;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String message = "Hello there!";
        LoggerEntryPoint loggerEntryPoint = new LoggerEntryPoint();
        Protocol protocol = new Protocol();
        logger.trace(message);
        logger.debug(message);
        logger.info(message);
        logger.warn(message);
        logger.error(message);
        logger.fatal(message);
        loggerEntryPoint.entries();
        protocol.logSomeMessages();
    }
}
