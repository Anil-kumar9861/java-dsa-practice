import java.util.Arrays;

class Move_Zeroes{
    public static void main(String []args){

        int arr[]={1,0,2,0,0,3,4};

        int curr=0;

        for(int move=0;move<arr.length;move++){
            if(arr[move] !=0){
                int swap=arr[move];
                arr[move]=0;
                arr[curr]=swap;

                curr++;
            }
        }
        

           System.out.println(Arrays.toString(arr));

    }
}