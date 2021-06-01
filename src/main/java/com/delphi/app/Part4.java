package com.delphi.app;

import com.github.ricksbrown.cowsay.plugin.CowExecutor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
    private String ip = null;
    private String name = null;
    private String port = null;
    public String connData(final String conn) {
        if (conn == null || conn.isEmpty()) {
            return "Invalid connection type\n";
        }
        Pattern global = Pattern.compile("([\\w\\.\\-\\_]+)\\\\?(\\w*)\\,?(.*)?");
        Matcher matcher = global.matcher(conn);
        if (matcher.find()) {
                ip = matcher.group(1).isEmpty() ? "unknown" : matcher.group(1);
                name = matcher.group(2).isEmpty() ? "defaultServerName": matcher.group(2);
                port = matcher.group(3).isEmpty() ? "8080": matcher.group(3);
        }
                return "IP: " + ip + "\nName: " + name + "\nPort: " + port + "\n";
    }

    public static void main(String[] args) {
        Part4 p = new Part4();
        System.out.println(p.connData("localhost\\MyTest,8674"));
        System.out.println(new Part4().connData("192_164-131_131\\MyTest,8674"));
        System.out.println(new Part4().connData("localhost"));
        System.out.println(new Part4().connData(null));
        System.out.println(new Part4().connData("localhost\\MyTest"));
        System.out.println(new Part4().connData("localhost,4321"));
        System.out.println(p.getName());
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