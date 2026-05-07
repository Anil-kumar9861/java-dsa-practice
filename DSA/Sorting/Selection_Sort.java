class Selection_Sort{
    public static void main(String []args){

        int []arr={8,7,5,1,2,4,6};


        for(int i=0;i<arr.length-1;i++){

            int min =i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                int swap=arr[i];
                arr[i]=arr[min];
                arr[min]=swap;

        }

        for(int a: arr){
            System.out.print(" "+a);
        }

    }
}