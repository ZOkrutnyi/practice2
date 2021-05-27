package com.delphi.app;

import com.github.ricksbrown.cowsay.plugin.CowExecutor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
    private String ip = null;
    private String name = null;
    private String port = null;
    public String connData(final String conn) {
        if (conn == null) {
            return "Invalid connection type";
        }

        Pattern global = Pattern.compile("^(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\w+)|([A-z]+)|(\\d{4})");
        Matcher matcher = global.matcher(conn);
        while (matcher.find()) {
            if (matcher.group(1) != null)
                this.ip = matcher.group(1);
            if (matcher.group(2) != null)
                this.name = matcher.group(2).replace("\\", "");
            if (matcher.group(3) != null)
                this.port = matcher.group(3);
        }
        if (this.ip == null)
            return "Invalid connection type";
        if (this.name == null)
            this.name = "defaultServerName";
        if (this.port == null)
            this.port = "8080";
        return "IP: " + this.ip + "\nName: " + this.name + "\nPort: " + this.port + "\n";

    }

    public static void main(String[] args) {
        Part4 p = new Part4();
        System.out.println(p.connData("localhost\\MyTest,8674"));
        System.out.println(p.getIP());
//        System.out.println(new Part4().connData("192.164.131.131\\MyTest,8674"));
//        System.out.println(new Part4().connData("localhost"));
//        System.out.println(new Part4().connData("localhost\\MyTest"));
//        System.out.println(new Part4().connData("localhost,4321"));
    }
    public String getIP()
    {
        CowExecutor cowExecutor = new CowExecutor();
        cowExecutor.setMessage("Oh what a nice ip: "+ip);
        return cowExecutor.execute();
    }
    public String getName()
    {
        CowExecutor cowExecutor = new CowExecutor();
        cowExecutor.setMessage("Oh what a nice name: "+name);
        return cowExecutor.execute();
    }
    public String getPort()
    {
        CowExecutor cowExecutor = new CowExecutor();
        cowExecutor.setMessage("Oh what a nice port: "+port);
        return cowExecutor.execute();
    }
}