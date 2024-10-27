package org.example;

public class MaximumLengthPalindrome {

    public static String longestPalindrome(String s) {
        String max="";

        for(int i=0;i<s.length();i++) {

            for(int j=s.length()-1;j>=i;j--) {

                if(s.charAt(i)==s.charAt(j)) {

                    if(palin(s.substring(i,j+1))) {
                        if(max.length()<s.substring(i, j+1).length())
                            max=s.substring(i, j+1);
                        else
                            max=max;
                        break;
                    }

                }

            }

        }

        return max;

    }

    public static boolean palin(String str) {

        int i=0,j=str.length()-1,c=0;

        while(i<j) {

            if(str.charAt(i)==str.charAt(j)) {

                c++;i++;j--;

            }

            else

                return false;

        }

        if(c==str.length()/2)

            return true;

        return false;

    }

    public static void main(String[] args){
        String s1="babad";
        String palindrome1=longestPalindrome(s1);
        int length=palindrome1.length();
        System.out.println(palindrome1 + ","+ length);

        String s2="cbbd";
        String palindrome2=longestPalindrome(s2);
        int length2=palindrome2.length();
        System.out.println(palindrome2 + ","+ length2);

        String s3="forgeeksskeegfor";
        String palindrome3=longestPalindrome(s3);
        int length3=palindrome3.length();
        System.out.println(palindrome3 + ","+ length3);

    }
}
