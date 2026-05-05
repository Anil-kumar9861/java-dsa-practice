class Binary_Search{
    public static void main(String args[]){
        int []arr={2,4,5,7,8,9};

        int item=7;

        int left=0;
        int right=arr.length;

        while(left<=right){

            int mid=(left+right)/2;

            if(arr[mid] == item){
                System.out.print("element found at index "+mid);
                break;
            }
            else if(arr[mid]<item){
                left=mid+1;

            }
            else{
                right=mid-1;
            }

        }


    }
}