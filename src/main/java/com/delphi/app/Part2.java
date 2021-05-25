package com.delphi.app;

public class Part2 implements Comparable<String> {
    private String firstString;
    public boolean compareStr(String firstString, String secondString)
    {
        Part3 part3 = new Part3();
        if(firstString == null|| secondString==null)
            return false;
        this.firstString = part3.toUpperCase(firstString);
       secondString = part3.toUpperCase(secondString);
        return this.firstString.compareTo(secondString) == 0;
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
