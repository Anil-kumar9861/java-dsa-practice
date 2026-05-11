

class Hello{
    public static void main(String args[]){

        String name="Madam ";
        int target=6;

        name=name.toLowerCase().trim();


        int left =0;
        int right=name.length()-1;

        while(left<right){

            while (left < right && !Character.isLetterOrDigit(name.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(name.charAt(right))) {
                right--;
            }

            if (name.charAt(left)!=name.charAt(right)) {

                System.out.println("it is not palindrome");
                return;

            }

            left++;
            right--;

        }

        System.out.print("it is a palindrome");



    }
}