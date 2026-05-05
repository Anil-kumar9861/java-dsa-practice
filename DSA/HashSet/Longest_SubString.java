import java.util.*;

class Longest_SubString{
    public static void main(String []args){

        String s="dvdf";

        HashSet<Character> set = new HashSet<>();

        int left =0;
        int maxi=0;

        for(int right=0;right<s.length();right++){

            while(set.contains(s.charAt(right))){

                set.remove(s.charAt(left));
                left++;
            }

                set.add(s.charAt(right));
                 maxi=Math.max(maxi,right-left+1);
        }

        System.out.print(maxi);

    }
}