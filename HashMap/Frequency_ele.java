import java.util.Map;
import java.util.HashMap;

class Frequence_ele{
    public static void main(String []args){

        int arr[]={2,4,5,7,8,2,4};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}