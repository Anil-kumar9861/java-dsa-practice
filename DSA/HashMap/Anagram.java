import java.util.*;

class Anagram{
    public static void main(String []args){

        String s1="silent";
        String s2="listen";

        if(s1.length() != s2.length()){
            System.out.print("not anagram");
            return;
        }

        HashMap<Character,Integer> map = new HashMap<>();


        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
          

        for(char c:s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0  ){
                System.out.print("it is not a Anagram");
                return;
            }

            map.put(c,map.get(c)-1);
        }
         System.out.print("it is an Anagram");
    }
    
}