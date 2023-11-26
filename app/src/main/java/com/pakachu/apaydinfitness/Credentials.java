package com.pakachu.apaydinfitness;

import android.content.pm.ApplicationInfo;
import android.util.Log;

public class Credentials {
    private static String url_select = "http://bahadirduzcan.com.tr/pakachu/quick/select/";
    private static String url_other = "http://bahadirduzcan.com.tr/pakachu/quick/";
    private static String token = "Pakachu-Token";
    private static String user_agent = "CenutaUA22";

    public static String getUrl_select() {
        return url_select;
    }

    public static String getUrl_other() {
        return url_other;
    }

    public static String getToken() {
        return token;
    }

    public static String getUser_agent() {
        return user_agent;
    }

}
