package com.delphi.app;

import java.util.logging.Logger;

public class Part1 {
    static private final Logger log = Logger.getLogger(Part1.class.getName());
    private final char resChar;

    public char getResChar() {
        return resChar;
    }

    public Part1(String initString, int charPosition)
    {
        this.resChar = initString.charAt(charPosition);
    }

    public static void main(String[] args) {
        Part1 part1;
        try {
            part1 = new Part1(args[0], Integer.parseInt(args[1]));
            System.out.println( (int) part1.getResChar());
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println("Invalid arguments");
            log.severe("Index out of bound at " + e.getStackTrace()[e.getStackTrace().length - 1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            log.severe("Other exception at " + e.getStackTrace()[e.getStackTrace().length - 1]);
        }
    }

}
