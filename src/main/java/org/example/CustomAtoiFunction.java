package org.example;

public class CustomAtoiFunction {

    public static int customAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) return -1;

        int sign = 1;
        int index = 0;
        if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(index) == '+') {
            index++;
        }

        int result = 0;
        while (index < str.length()) {
            char c = str.charAt(index);
            if (c < '0' || c > '9') {
                return -1;
            }

            result = result * 10 + (c - '0');
            index++;
        }

        return result * sign;
    }


    public static void main (String[] args) {
        System.out.println(customAtoi("123"));
        System.out.println(customAtoi("-123"));
        System.out.println(customAtoi("1a23"));
    }
}
