package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableApplication {

    static Logger log = LoggerFactory.getLogger(RunnableApplication.class);

    public static void main(String[] args) {
        /**
         * Source www.coderscampus.com
         * By default Logger is set at Level 2.
         * To changed the level, got to resource directory, opened logback.xml file
         * under configuration/root --> place the desire level.
         * Reference: https://logback.qos.ch/manual/configuration.html
         */

        log.trace("This is a trace logger");  //Level 1 (least important)
        log.debug("This is a debug logger");  //Level 2
        log.info("This is a info logger");    //Level 3
        log.warn("This is a warn logger");    //Level 4
        log.error("This is a error logger");  //Level 5 (most important)

        log.trace("Initializing app");
        int x = 1;
        log.trace("x has been initialized");
        log.debug("x = "+x);

        for (int i = 0; i < 10  ; i++) {
            x += x;
            log.trace("i = "+i);
            log.debug("x = "+x);
            if (x > 100 && x < 1000) {
                log.warn("x is getting too big");
            } else if (x > 1000) {
                log.error("x is too big");
            }
        }
        log.info("Final value x is: "+x);
    }
}
