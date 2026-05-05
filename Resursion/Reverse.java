class Reverse{

    public static int rev(int num,int rev){

        if(num == 0) return rev;

        int rem=num%10;
        return rev(num/10,rev*10+rem);

        
    }
    public static void main(String args[]){

        int num=256;

        int rem=rev(num,0);

        System.out.print(rem);

    }
}