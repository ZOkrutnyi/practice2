package com.delphi.app;

public class Part2 {

    public boolean compareStr(String firstString, String secondString) {
        if (firstString == null || secondString == null || firstString.length() != secondString.length())
            return false;
        return firstString.compareToIgnoreCase(secondString)==0;
    }
}
