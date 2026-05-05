class Bubble{
    public static void main(String []args){
        
        int []arr={8,5,7,4,2,3,1};


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=swap;
                }
            }
        }


        for(int a: arr){
            System.out.print(" "+a);
        }
    }
}