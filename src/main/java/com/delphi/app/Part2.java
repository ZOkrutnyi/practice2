package com.delphi.app;

public class Part2 implements Comparable<String> {
    private String firstString;
    Part3 part3 = new Part3();

    public boolean compareStr(String firstString, String secondString) {
        if (firstString == null || secondString == null || firstString.length() != secondString.length())
            return false;
        this.firstString = part3.toUpperCase(firstString);
        secondString = part3.toUpperCase(secondString);
        return this.firstString.compareTo(secondString) == 0;
    }

    @Override
    public int compareTo(String o) {
        return firstString.compareTo(o);
    }
}
