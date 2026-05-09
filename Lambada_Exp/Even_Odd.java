interface Even{
    public void main(int num);
}

class Even_Odd{
    public static void main(String []args){

        Even e = (num)->{
            if(num%2 == 0){
                System.out.print("even number");
            }else{
                System.out.print("odd number");
            }
        };


        e.main(20);

    }
}