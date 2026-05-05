import java.util.*;

class Non_Reapt_ele{
    public static void main(String []args){

        int arr[]={4,5,4,7,5,9};

        Map<Integer,Integer> map=new HashMap<>();

        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int k:map.keySet()){
            if(map.get(k) == 1){
                System.out.println("Non-Reapting Character:"+k);
            }
        }

    }
}