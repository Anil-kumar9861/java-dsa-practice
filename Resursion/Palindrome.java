class Palindrome{

    public static int pal(int num,int rev){

        if(num == 0) return rev;

        int rem=num%10;
        return pal(num/10,rev*10+rem);

    }

    public static void main(String []args){

            int num=25652;

            int result=pal(num,0);

            if(result == num){
                System.out.print("it is a Palindome No");
            }
            else{
                System.out.print("it is not palindrome No.");
            }
    }
}