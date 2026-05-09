interface Square{
    public int sqt(int num);
}

class Square_no{
    public static void main(String []args){

        Square s= (num) -> 
            num*num;
        

        System.out.print(s.sqt(10));

    }
}