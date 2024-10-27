package org.example;

public class MinimumDistanceBetweenWords {

    public static int shortestDistance(String s,
                                       String word1, String word2)
    {

        String[] words=s.split(" ");
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;



        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)){
                d1 = i;
            }

            if (words[i].equals(word2)){
                d2 = i;
            }

            if (d1 != -1 && d2 != -1){
                ans = Math.min(ans, Math.abs(d1 - d2));
            }
        }


        return ans-1;
    }


    public static void main (String[] args) {
        String s="the quick the brown quick brown the frog";

        String word1 = "quick", word2 = "frog";


        System.out.println(shortestDistance(s, word1, word2));
    }
}
