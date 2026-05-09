import java.util.*;

class Add_Ele{
    public static void main(String []args){

        HashMap<Integer ,String> hm= new HashMap<>();

        hm.put(1,"Anil");
        hm.put(2,"ram");
        hm.put(3,"sunil");


        Set<Integer> s1=hm.keySet();

        System.out.print(s1);

        for (String value : hm.values()) {
             System.out.println(value);
        }


    int key=2;

        if(hm.containsKey(key)){
            System.out.print("it contains key");
        }

    }
}