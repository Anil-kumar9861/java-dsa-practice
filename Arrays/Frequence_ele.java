//Find the frequency of elements in an Array(optimized in Hashmap)

import java.util.*;
class Frequence_ele{
    public static void main(String []args){

        int arr[]={2,3,4,5,1,2,3};


        HashSet<Integer> hs = new HashSet<>();


        for(int i : arr){
            if(hs.add(i)){
                int count =0;
                for(int k=0;k<arr.length;k++){
                    if(i == arr[k]){
                        count++;
                    }
                }

                System.out.println(i+":"+count);
            }
        }
    }
}
