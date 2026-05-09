import java.util.*;
import java.util.stream.*;
class Collect{
    public static void main(String args[]){

        LinkedList<Integer> list =new LinkedList<>();

         list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       


        List<Integer> rs =list.stream()
                                    .map(n -> n*n)
                                    .filter(n -> n%2 != 0)
                                    .sorted()
                                    .collect(Collectors.toList());

                    System.out.print(rs);
                        
    }
}