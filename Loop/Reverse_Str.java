class Reverse_Str{
    public static void main(String args[]){

        String str="java";
        int len=str.length();

        StringBuffer sb = new StringBuffer();

        for(int i=len-1;i>=0;i--){

            sb.append(str.charAt(i));

        }

        System.out.print(sb.toString());

    }
}