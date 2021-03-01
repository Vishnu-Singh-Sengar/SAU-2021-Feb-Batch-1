package org.remad.logging.protocol;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Protocol {

    public Protocol() {}

    private static final Logger logger = LogManager.getLogger(Protocol.class);

    public void logSomeMessages() {
        logger.fatal("Fatal error.");
        logger.error("Error happened.");
        logger.warn("Warning message.");
        logger.info("This message informs.");
        logger.debug("Debug message.");
    }
}
