package com.delphi.app;

public class Part3 {

    public String toUpperCase(String str) {
        if (str == null || str.length() < 1)
            return null;
        StringBuilder sb = new StringBuilder();
        boolean isCyrillic;
        boolean isLatin;
        for (char aChar : str.toCharArray()) {
            isCyrillic = aChar >= 'а' && aChar <= 'я';
            isLatin = aChar >= 'a' && aChar <= 'z';
            if (isCyrillic || isLatin) {
                sb.append((char) (aChar - 32));
            } else {
                sb.append(aChar);
            }
        }
        return sb.toString();
    }
}
