
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

        System.out.print("Original:");

        while(node!= null){
            System.out.print(" "+node.data);
            node=node.next;
            
        }


        Node next=null;
        Node curr= head;
        Node prev=null;


        while(curr != null){

            next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;


        }


        head=prev;


        System.out.print("Reverse:");

        while(head!= null){
            System.out.print(" "+head.data);
            head=head.next;
            
        }
       

    }
}