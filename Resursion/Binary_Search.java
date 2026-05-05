class Binary_Search{

    public int Binary(int left,int right,int item,int []arr)
    {
        if(left>right) return -1;

        int mid=(left+right)/2;

        if(arr[mid] == item){
            return mid;
        }
        else if(arr[mid]<item){
            return Binary(mid+1,right,item,arr);
        }
        else{
            return Binary(left,mid-1,item,arr);
        }

    }


    public static void main(String []args){

        int arr[]={2,4,6,7,8,9,10};
        int item=7;

        int size =arr.length;

        Binary_Search bs = new Binary_Search();

        int index=bs.Binary(0,size,item-1,arr);

        System.out.print("Element present at index "+index);
    }

}
