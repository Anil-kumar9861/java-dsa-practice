//Sum of two number is equal to target or not.
import java.util.HashSet;

class Two_Sum{
    public static void main(String []args){

        int []arr={2,4,5,3,6};
        int target=10;


        HashSet<Integer> hs = new HashSet<>();

        for(int num:arr){

            int diff=target-num;

            if(hs.contains(diff)){
                System.out.print("two elements are "+num+" and "+diff);
                break;
            }
            hs.add(num);
        }
    }
}