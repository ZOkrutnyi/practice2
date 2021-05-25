package com.delphi.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
    public String connData(String conn)
    {
        if(conn == null)
            return "Invalid connection type";
        Pattern pattern = Pattern.compile("[a-zA-Z]+[\\\\]+[a-zA-Z]+,+\\d+");
        Matcher matcher = pattern.matcher(conn);
        if (matcher.find())
        {
            return formValidData(matcher.group());
        }
        return "Invalid connection type";
    }
    private String formValidData(String str) {
        String port;
        String name;
        String ip;
        port = str.substring(0,str.indexOf("\\"));
        name = str.substring(str.indexOf("\\")+1, str.indexOf(","));
        ip = str.substring(str.indexOf(",")+1);
        return "Port: "+port+"\nInstance name: "+name+"\nIP: "+ip;
    }

    public static void main(String[] args) {
        System.out.println(new Part4().connData("localhost\\MyTest,8674"));
    }
}
