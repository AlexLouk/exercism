public class LogLine {
    String lvl;
    String msg;
    
    public LogLine(String logLine) {
        String [] logLineSplitted = logLine.split(":", 2);
        this.lvl = logLineSplitted[0].replaceAll("[\\[\\]]", "").trim();
        msg = logLineSplitted[1].trim();
    }

    public LogLevel getLogLevel() {
        switch(lvl){
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        int encodedLevel = level.getEncodedLogLevel();
        return String.format("%d:%s" , encodedLevel, msg);
    }
}
