package com.delphi.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
    public String connData(String conn) {
        String ip=null;
        String name=null;
        String port=null;
        if (conn == null)
            return "Invalid connection type";
        Pattern ipPattern = Pattern.compile("^([^\\\\]\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\w+([\\\\,]))|^\\w+$");
        Pattern namePattern = Pattern.compile("\\\\\\w+(,|$)");
        Pattern portPattern = Pattern.compile(",\\d{4}");
                                    ///////////////////* IP validation *///////////////////
        Matcher matcher = ipPattern.matcher(conn);
        if (matcher.find()) { ip = matcher.group().replace("\\","").replace(",",""); }
                                ///////////////////* Server Name validation *///////////////////
        matcher = namePattern.matcher(conn);
        if (matcher.find()) { name = matcher.group().replace("\\","").replace(",",""); }
                                ///////////////////* Port validation *///////////////////
        matcher = portPattern.matcher(conn);
        if(matcher.find()) { port = matcher.group().replace("\\","").replace(",",""); }

        if(ip==null)
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
        System.out.println(new Part4().connData("localhost,1414"));

    }
}
