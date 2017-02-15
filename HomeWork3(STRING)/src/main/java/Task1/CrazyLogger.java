package Task1;

import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrazyLogger {

    private static StringBuilder logX;
    private static Logger log;

    private CrazyLogger(String className) {

        log = Logger.getLogger(className);
        logX = new StringBuilder();
    }

    public static void main(String[] args){
        CrazyLogger crazyLogger = new CrazyLogger(CrazyLogger.class.getSimpleName());
        crazyLogger.doLog(Level.ALL, "ddd");

    }

    private void doLog(Level level, String message) {
        log.log(level, message);
        Formatter formatter = new Formatter();
        LocalDateTime today = LocalDateTime.now();
        formatter.format("%td-%tm-%tY:%tH-%tM-",today,today,today,today,today);
        logX.append(formatter+message+"\n");
    }

}



