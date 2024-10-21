package org.example;
import java.util.*;

public class FirstNonRepeatingCharacter {

    public static Character findFirstNonRepeatingCharacter(String s){

        String temp=s.toLowerCase();
        LinkedHashMap<Character,Integer> lh=new LinkedHashMap<>();
        for(int i=0;i<temp.length();i++){
            char c=temp.charAt(i);
            if(lh.containsKey(c))
                lh.put(c,lh.get(c)+1);
            else
                lh.put(c,1);
        }

        for(Character c: lh.keySet()){
            if(lh.get(c)==1)
                return c;
        }
        return null;
    }

    public static void main(String[] args)
    {
        String s="Analogy";
        System.out.println(findFirstNonRepeatingCharacter(s));
    }

}
