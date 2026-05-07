
class Quick_Sort{

public  static int partition(int []arr,int left,int right){

    int priviot=arr[right];
    int i=left-1;

    for(int j=left;j<right;j++){
        if(arr[j]<priviot){

            i++;

            int temp=arr[i];
             arr[i]=arr[j];
            arr[j]=temp;
        }
    }

   

    int tempt=arr[i+1];
    arr[i+1]=arr[right];
    arr[right]=tempt;
    

    return i+1;
}


public static void  sort(int arr[],int left,int right){

    if(left<right){
        int mid=partition(arr,left,right);

        sort(arr,left,mid-1);
        sort(arr,mid+1,right);
    }
}



    public static void main(String main[]){

        int []arr={4,2,7,8,3,9};
        

        sort(arr,0,arr.length-1);

        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}