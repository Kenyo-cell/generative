package com.company;

import java.util.Date;

public class Logger {
    private static Logger instance = null;
    private int msgId = 0;

    private Logger() {
    }

    public static Logger newInstance() {
        if (instance == null)
            return new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println(String.format(
                "[%d: %s], %s",
                ++msgId,
                (new Date(System.currentTimeMillis())).toString(),
                msg));
    }
}
