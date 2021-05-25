package com.delphi.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
    public String connData(String conn) {
        if (conn == null)
            return "Invalid connection type";
        Pattern fullConn = Pattern.compile("\\w+[\\\\]+[a-zA-Z]+,+\\d+");
        // (.*)(\\)\w+[,](.*)
        // [0-9](.*)(\\)\w+[,](.*)
        // ^\w+[^\d]$
        // ^\w+\\\w+$
        // ^\w+,\d+$
        Matcher matcher = fullConn.matcher(conn);
        if (matcher.find()) {
            return formValidData(matcher.group());
        }
        return "Invalid connection type";
    }

    private String formValidData(String str) {
        String port;
        String name;
        String ip;
        port = str.substring(0, str.indexOf("\\"));
        name = str.substring(str.indexOf("\\") + 1, str.indexOf(","));
        ip = str.substring(str.indexOf(",") + 1);
        return "Port: " + port + "\nInstance name: " + name + "\nIP: " + ip;
    }

    public static void main(String[] args) {
        System.out.println(new Part4().connData("localhost\\MyTest,8674"));
        System.out.println(new Part4().connData("192.164.131.131\\MyTest,8674"));
        System.out.println(new Part4().connData("localhost"));
        System.out.println(new Part4().connData("localhost\\MyTest"));
        System.out.println(new Part4().connData("localhost,1414"));

    }
}
