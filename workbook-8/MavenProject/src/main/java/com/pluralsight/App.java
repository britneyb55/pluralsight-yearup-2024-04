package com.pluralsight;
import org.apache.log4j.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args)
    {
        //BasicConfigurator.configure();
        configureLogger();
        logMeLikeYouDo("☕");

    }


    private static void logMeLikeYouDo(String input){




        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + input);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + input);
        }

        logger.warn("This is warn : " + input);
        logger.error("This is error : " + input);
        logger.fatal("This is fatal : " + input);

    }

    private static void configureLogger()
    {
        PatternLayout layout = new PatternLayout();
        layout.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");

        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setLayout(layout);
        consoleAppender.activateOptions();

        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.TRACE);

        rootLogger.addAppender(consoleAppender);
    }


}
