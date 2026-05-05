class Sum{

        public int recc(int n){
            if(n<1) return 0;

            int lag=n+recc(n-1);

            return lag;

        }

    public static void main(String[] args){

          int num =5;

          Sum sum = new Sum();
          int result=sum.recc(num);

          System.out.print("Sum : "+result);
    }
}