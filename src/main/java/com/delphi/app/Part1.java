package com.delphi.app;


public class Part1 {
    public int getChar(String str, int pos) {
        if (str == null || pos < 0 || pos > str.length())
            return -1;
        return str.codePointAt(pos - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Part1().getChar("Hello", 0));
    }
}
