import java.util.Locale;

public class LogLevels {

    public static String message(String logLine) {
        int antiguo = logLine.indexOf(":");
        String antiguo_new = logLine.substring(antiguo + 2);
        String nuevo = antiguo_new.trim();
        return nuevo;
    }

    public static String logLevel(String logLine) {
        int num = logLine.indexOf(":");
        String antiguo_dos = logLine.substring(1, num-1);
        String nuevo_log = antiguo_dos.toLowerCase();
        return nuevo_log;
    }

    public static String reformat(String logLine) {
        String refo = message(logLine) + " (" + logLevel(logLine) + ")";
        return refo;
    }
}
