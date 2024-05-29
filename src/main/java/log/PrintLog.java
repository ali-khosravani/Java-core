package main.java.log;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class PrintLog {
    static Logger log = Logger.getLogger(PrintLog.class.getName());

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Hello World");
        log.debug("Hello from java....");
    }
}
