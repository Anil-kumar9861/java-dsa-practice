class Dupli_ele{
    public static void main(String []args){

            int []arr={2,5,2,4,3,5};

            int len=arr.length;

            for(int i=0;i<len-1;i++){
                for(int j=i+1;j<len;j++){
                    if(arr[i] == arr[j]){
                        System.out.println("Duplicate element is:"+arr[j]);
                    }
                }
            }

    }
}