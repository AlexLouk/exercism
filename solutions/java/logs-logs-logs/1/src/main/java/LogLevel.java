public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("", 0);

    final String lvl;
    final int encodedLvl;

    LogLevel(String lvl, int encodedLvl){
        this.lvl = lvl;
        this.encodedLvl =  encodedLvl;
    }

    public String getLogLevel(){
        return lvl;
    }

    public int getEncodedLogLevel(){
        return encodedLvl;
    }
}
