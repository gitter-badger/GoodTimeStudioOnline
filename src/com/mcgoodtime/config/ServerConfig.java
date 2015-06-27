package com.mcgoodtime.config;

import java.io.*;
import java.util.Properties;

/**
 * Created by suhao on 2015.6.27.
 */
public class ServerConfig {

    private static String configPath = "server.properties";
    private static Properties properties = new Properties();

    public static String getConfig(String key) {
        String cfgkey = null;
        try {
            FileInputStream cfgin = new FileInputStream(configPath);
            InputStreamReader cfgr = new InputStreamReader(cfgin, "UTF-8");
            properties.load(cfgr);
            cfgkey = properties.getProperty(key);
            cfgin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cfgkey;
    }

    public static void setConfig(String key, String value) {
        properties.setProperty(key, value);
    }

    public static void saveConfig() {
        OutputStream cfgout;
        try {
            cfgout = new FileOutputStream(configPath);
            properties.store(cfgout, "GoodTime Studio Server Config File");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
