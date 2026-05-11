

class Duplicate_ele{

    public static void main(String []args){

        int arr[]={2,4,5,7,8,};

        int curr=0;
        int next=0;

        for(int i=0;i<arr.length-1;i++){

             for(int j=i+1;j<arr.length;j++){

            if(arr[i] != arr[next]){
                System.out.print("Duplicate element :"+arr[curr]);
            }
             }

        
        }


    }

}