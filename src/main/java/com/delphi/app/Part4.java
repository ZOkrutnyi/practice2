package com.delphi.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
    public String connData(final String conn) {
        String ip=null;
        String name=null;
        String port=null;
        if (conn == null) {
            return "Invalid connection type";
        }
        Pattern global = Pattern.compile("^([^\\\\]\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\w+)|([A-z]+)|(\\d{4})");
        Matcher matcher = global.matcher(conn);
        while (matcher.find()) {
            if(matcher.group(1)!=null)
                ip = matcher.group(1);
            if(matcher.group(2)!=null)
                name = matcher.group(2).replace("\\", "");
            if(matcher.group(3)!=null)
                port = matcher.group(3);
        }
        if (ip == null)
            return "Invalid connection type";
        if(name==null)
            name = "defaultServerName";
        if(port==null)
            port="8080";
        return "IP: "+ip+"\nName: "+name+"\nPort: "+port+"\n";
    }

    public static void main(String[] args) {
        System.out.println(new Part4().connData("localhost\\MyTest,8674"));
        System.out.println(new Part4().connData("192.164.131.131\\MyTest,8674"));
        System.out.println(new Part4().connData("localhost"));
        System.out.println(new Part4().connData("localhost\\MyTest"));
        System.out.println(new Part4().connData("localhost,4321"));

    }
}