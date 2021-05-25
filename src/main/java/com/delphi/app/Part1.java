package com.delphi.app;


public class Part1 {
    public int getChar(String str, int pos)
    {
        if(str==null||pos<0||pos>str.length())
            return -1;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i==pos-1)
                return chars[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Part1().getChar("Hello", 6));
    }
}
