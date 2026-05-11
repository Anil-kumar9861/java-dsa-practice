// Count how many pairs have sum = target

class Target{
    public static void main(String args[]){

        int arr[]={1,1,2,8,4,5};
        int target=6;


        int left =0;
        int right=arr.length-1;
        int count=0;

        while(left<right){

            int sum = arr[left]+arr[right];

            if (sum == target) {
                count++ ;
                left++;
                right--;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
            
        }

        System.out.print("count:"+count);
        
    }
}