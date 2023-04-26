package Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class URLConstants {

    private static Logger logger = LoggerFactory.getLogger(URLConstants.class);

    public static String setUrl() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        String launchUrl = "";
        if (System.getProperty("env").equals("qa")) {
            launchUrl = "https://demoqa.com/elements";
        } else {
            logger.debug("Incorrect environment");
        }
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
        return launchUrl;
    }
}
