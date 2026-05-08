class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}


class Insert{
    public static void main(String args[]){

        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);


        head=insert_first(head,5);
        insert_last(head,40);


        

        
    }

    public static void insert_last(Node head,int data){


        Node node=head;
        Node prev=null;

        while(node !=null){
            prev=node;
            node = node.next;
           
        }

        prev.next=new Node(data);

         while(head!=null){

            System.out.print(" "+head.data);
            head=head.next;



        }

    }

    public static Node insert_first(Node head,int data){

         Node node = new Node(data);

        node.next=head;
        Node org =node;

        while(node!=null){

            System.out.print(" "+node.data);
            node=node.next;

        }

        return org;

    }
}