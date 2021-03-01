package org.remad.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerEntryPoint {

    private static final Logger logger = LogManager.getLogger(LoggerEntryPoint.class);

    public LoggerEntryPoint() {}

    public void entries() {
        logger.info("now in " + getClass().getCanonicalName());
    }
}
