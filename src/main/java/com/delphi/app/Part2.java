package com.delphi.app;

import java.util.Locale;

public class Part2 implements Comparable<String> {
    private String firstString;
    private String secondString;

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public boolean compareStr(String firstString, String secondString)
    {
        if(firstString == null|| secondString==null)
            return false;
        setFirstString(firstString.toLowerCase());
        setSecondString(secondString.toLowerCase());
        return getFirstString().compareTo(getSecondString()) == 0;
    }

    public static void main(String[] args) {
        try{
            Part2 part2 = new Part2();
            System.out.println(part2.compareStr(args[0], args[1]));
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound");
        }
    }

    @Override
    public int compareTo(String o) {
        return firstString.compareTo(o);
    }
}
