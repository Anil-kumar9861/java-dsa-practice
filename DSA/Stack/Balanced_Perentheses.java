import java.util.Stack;


class Balanced_Perentheses{
    public static void main(String args[]){

        Stack<Character> st = new Stack<>();
        String par="({[]})";

        boolean balanced=true;

        for(char c : par.toCharArray()){

            if(c == '(' || c == '{' || c ==  '['){

                st.push(c);

            }
            else{
                if(st.isEmpty()){
                    balanced = false;
                }
                char h=st.pop();
                if(
                        (c == ')' && h != '(' )|| (c == '}' && h != '{') || (c == ']' && h != '[')
                ){
                    balanced=false;
                    break;
                }
            }
        }

        if(balanced){
            System.out.println("it is balanced");
        }else{
            System.out.println("it is not balanced");
        }

    }
}