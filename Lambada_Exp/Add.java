interface Add_Ele{
    public int add(int a,int b);
}


class Add{

    public static void main(String []args){


        Add_Ele e=(num1,num2)->{
            return num1+num2;
        };

        System.out.print("sum= "+e.add(5,6));
    }


}