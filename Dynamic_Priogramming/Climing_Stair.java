class Climing_Stair{
    public static void main(String []args){

        int steps=5;

        int prev1=1;
        int prev2=1;


        for(int i=2;i<=steps;i++){

            int    curr=prev1+prev2;

            prev1=prev2;
            prev2=curr;

        }



        System.out.print(prev2);



        
    }
}