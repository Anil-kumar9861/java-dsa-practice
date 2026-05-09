import java.util.LinkedList;
import java.util.List;


class Even{
    public static void main(String args[]){

        List<Integer> li=new LinkedList<>();

                    li.add(1);
                    li.add(2);
                    li.add(3);
                    li.add(4);

        System.out.println(li);


        li.stream()
                .
                filter(num -> (num % 2) == 0)
                .forEach(System.out::print);

    }
}