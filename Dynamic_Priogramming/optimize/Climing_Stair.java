/*
            Given n stairs, and a person standing at the ground wants to climb stairs to reach the top. 
            The person can climb either 1 stair or 2 stairs at a time, count the number of ways the 
            person can reach at the top

 */

class Climing_Stair{
    public static int cal(int steps){
            if(steps <=1 ){
                return 1;                
            }

            return cal(steps-1)+ cal(steps-2);
    
}
    public static void main(String args[]){

        int steps=4;

        System.out.print(cal(steps));



    }
}