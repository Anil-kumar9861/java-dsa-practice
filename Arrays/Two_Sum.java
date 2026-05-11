//Sum of two number is equal to given target (optimized in harshset)
class Two_Sum{
    public static void main(String []args){
        
        int arr[]={2,4,5,6,3};
        int  target=10;
        boolean found=false;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                        System.out.print("two elements are "+arr[i]+" and "+arr[j]);
                        found=true;
                        break;
                }
            }

            if(found) break;
        }

    }
}