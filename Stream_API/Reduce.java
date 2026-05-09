import java.util.*;
import java.util.stream.*;
class Reduce{
    public static void main(String args[]){

        LinkedList<Integer> list =new LinkedList<>();

         list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        int sum=list.stream()
                    .reduce(0,(a,b) -> a+b);

        int mal=list
                    .stream()
                    .reduce(1,(a,b) -> a*b);


            System.out.println(sum);
            System.out.print(mal);

       

    }
}