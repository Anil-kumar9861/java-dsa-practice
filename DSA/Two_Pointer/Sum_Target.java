//Sum of two number is equal to given target (optimized in harshset)

class Sum_Target{
    public static void main(String args[]){

        int arr[]={1,2,3,4,5};
        int target=6;


        int left =0;
        int right=arr.length-1;
        int count=0;

        while(left<right){

            int sum = left+right;

            if (sum == target) {
                return true;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }

            left++;
            right--;

        }

        System.out.print("count:"+count);



    } 
}