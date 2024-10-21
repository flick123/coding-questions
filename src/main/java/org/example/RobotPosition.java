package org.example;
import java.util.*;

public class RobotPosition {

    public static int[] getCoordinates(String s, int[] xy) {
        char[] instructions=s.toLowerCase().toCharArray();
        int x=xy[0];
        int y=xy[1];
        for(char c: instructions){
            if(c=='u')
                y++;
            if(c=='d')
                y--;
            if(c=='l')
                x--;
            if(c=='r')
                x++;
        }
        return new int[]{x,y};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCoordinates("U, U, U, L", new int[]{0,0})));
    }
}
