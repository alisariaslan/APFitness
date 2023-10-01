package com.pakachu.apaydinfitness;

import android.content.pm.ApplicationInfo;
import android.util.Log;

public class Credentials {
    private static String url_select = "http://bahadirduzcan.com.tr/pakachu/quick/select/";
    private static String url_other = "http://bahadirduzcan.com.tr/pakachu/quick/";
    private static String token = "Pakachu-Token";
    private static String user_agent = "CenutaUA22";

    //REAL
    private static String add_id = "ca-app-pub-8946455145480386/2153579296";

    //TEST
    //private static String add_id = "ca-app-pub-3940256099942544/1033173712";

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

    public static String getAdd_id() {
        return add_id;
    }


  /*
        dbLogin.addData("apaydin2017", "2017", 0, 0, 100, 0);
        dbLogin.addData("antrenor2017", "2017", 0, 0, 51, 0);
        dbLogin.addData("test", "1234", 0, 0, 0, 0);
    */

}
