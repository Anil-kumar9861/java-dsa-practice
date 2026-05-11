class Remove_dupli{
    public static void main(String []args){

        int arr[]= {11,11,22,33,44};

        int curr=0;

        int cop[]= new int[arr.length];
        int len=0;

        for(int next=1;next<arr.length;next++){

            if(arr[next]!= arr[curr]){

                curr++;

               cop[len]=arr[next];
               len++;
            }
        }


        for(int a:cop){
            System.out.print(a+" ");
        }
    }
}