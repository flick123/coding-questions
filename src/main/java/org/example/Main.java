import java.util.*;
class Sample {
    public static String encode(String m){
        int length=m.length();
        String result="";
        LinkedHashMap<Character,Integer> lh=new LinkedHashMap<>();
        for(int i=0;i<length;i++){
            char c=m.charAt(i);
            if(lh.containsKey(c)){
                lh.put(c,lh.get(c)+1);
            }
            else{
                lh.put(c,1);
            }
        }
        for(Character ch: lh.keySet()){
            result+=ch;
            result+=lh.get(ch);
        }
        return result;
    }
    public static void main(String[] args) {
        String s="aabbbyyycc";
        String r=encode(s);
        System.out.println(r);
        String s1="aaaa";
        String r1=encode(s1);
        System.out.println(r1);
        String s2="a";
        String r2=encode(s2);
        System.out.println(r2);

    }
}