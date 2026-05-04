
class Pyramid{
    public static void main(String []args){
        
        int row=5;

        for(int k=0;k<row;k++){

            for(int i=1;i<row-k;i++){
               System.out.print(" ");
            }

            for(int j=0;j<=k;j++){
                System.out.print("* ");
            }
            System.out.println("");

        }

    }
}