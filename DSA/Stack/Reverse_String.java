import java.util.Stack;

class Reverse_String {
    public static void main(String args[]){

        Stack<Character> s= new Stack<>();

            String name="Java";

            for(char c:name.toCharArray()){
                s.push(c);
            } 

            for(int i=0;i<name.length();i++){
                System.out.print(s.pop());
            }
    }
}