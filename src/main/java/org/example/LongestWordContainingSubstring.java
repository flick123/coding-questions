package org.example;

public class LongestWordContainingSubstring {

    public static int findLongestLength(String[] dict, String s) {
        int maxLength = 0;


        for (String word : dict) {
            if (word.toUpperCase().contains(s.toUpperCase())) {
                maxLength = Math.max(maxLength, word.length());

            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String s = "ODG";

        int length = findLongestLength(dict, s);
        System.out.println(length);
    }
}
