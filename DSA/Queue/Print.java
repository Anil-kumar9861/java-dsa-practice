import java.util.*;


class Print{
    public static void main(String args[]){

        Queue<Character> q= new LinkedList<>();

        String name = "Java";

        for(char c: name.toCharArray()){

            q.add(c);
            
        }

        while(!q.isEmpty()){
            System.out.print(q.poll());
        }

    }
}