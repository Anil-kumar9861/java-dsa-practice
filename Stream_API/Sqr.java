import java.util.LinkedList;


class Sqr{
    public static void main(String []args){

        LinkedList<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);


        li.stream()
                    .filter(n -> n%2 == 0)
                    .map(n -> n*n)
                    .forEach(System.out::println);
    }
}