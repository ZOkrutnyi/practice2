package com.delphi.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
    public String connData(final String conn) {
        if (conn == null) {
            return "Invalid connection type";
        }
        Pattern global = Pattern.compile("^([^\\\\]\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\w+)|([A-z]+)|(\\d{4})");
        Matcher matcher = global.matcher(conn);
        String[] connection = new String[3];
        int groupID = 1;
        while (matcher.find() || groupID < 2) {
            if (matcher.group(groupID) != null)
                connection[groupID - 1] = matcher.group(groupID);
            groupID++;
        }
        if (connection[0] == null)
            return "Invalid connection type";
        if (connection[1] == null)
            connection[1] = "defaultServerName";
        if (connection[2] == null)
            connection[2] = "8080";
        return "IP: " + connection[0] + "\nName: " + connection[1].replace("\\","") + "\nPort: " + connection[2] + "\n";
    }

    public static void main(String[] args) {
        System.out.println(new Part4().connData("localhost\\MyTest,8674"));
        System.out.println(new Part4().connData("192.164.131.131\\MyTest,8674"));
        System.out.println(new Part4().connData("localhost"));
        System.out.println(new Part4().connData("localhost\\MyTest"));
        System.out.println(new Part4().connData("localhost,1414"));

    }
}