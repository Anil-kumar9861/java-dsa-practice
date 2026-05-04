class Leap_year{
    public static void main(String []args){

        int year=2024;

        if((year%4 == 0 && year%100 != 0) || year%400 == 0){
            System.out.print("it is a leap year");
        }
        else{
            System.out.print("it is not a leap year");
        }
    }
}