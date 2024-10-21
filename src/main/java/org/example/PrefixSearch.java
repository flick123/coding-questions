package org.example;
import java.util.*;

public class PrefixSearch {

    public static List<String> wordsStartingWithPrefix(String[] words, String prefix) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.startsWith(prefix)) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        List<String> listOfWords = wordsStartingWithPrefix(arr, prefix);

        System.out.println(listOfWords);
    }
}
