
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    
}

class Reverse{
    public static void main(String []args){

        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        Node node =head;

        int size=0;

        while(node.next!= null){
            node=node.next;
            size++;
        }


            int arr[]= new int[size+1];


            Node node1=head;
            int i=0;

             for(int j=0;j<size;j++){
                arr[i]=node1.data;
                node1=node1.next;
                i++;
            
            }


            for(int a:arr){
                System.out.print(" "+a);
            }


          //the resvere the array ok




    }
}