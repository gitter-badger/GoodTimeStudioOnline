package com.mcgoodtime.core;


import java.util.Arrays;
import java.util.List;

import com.mcgoodtime.server.Server;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by suhao on 2015.6.27.
 */
public class GoodTimeStudioOnline {

    public static Logger gtLogger = Logger.getLogger(GoodTimeStudioOnline.class);

    /* if true, will start server */
    private static boolean serverModule;
    private static String s;

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");

        List argList = Arrays.asList(args);
        for (int i = 0; i < argList.size(); i++) {
            String arg = argList.get(i).toString();
            if (arg.equals("--server")) {
                serverModule = true;

            } else if (!arg.isEmpty()) {
                gtLogger.log(Level.ERROR, "Unknown arguments: " + arg);
            }
        }

        /* init */
        if (serverModule) {
            gtLogger.log(Level.INFO, "==== STARTING GOODTIME STUDIO SERVER ====");
            Server.init();
        } else {
            gtLogger.log(Level.INFO, "==== STARTING GOODTIME STUDIO ONLINE ====");
        }

    }
}
