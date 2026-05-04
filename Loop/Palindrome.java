class Palindrome{
    public static void main(String arg[]){

        int num=4545;
        int rev=0;
        int org=num;


        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        if(org == rev){
            System.out.print("it is a Palindrome Number");
        }
        else{
            System.out.print("it is not a Palindrome Number");
        }

    }
}