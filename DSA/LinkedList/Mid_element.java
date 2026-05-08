
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}

class Mid_element{
    public static void main(String main[]){


            Node head = new Node(10);
            head.next=new Node(20);
            head.next.next= new Node(30);
            head.next.next.next= new Node(50);


            Node curr= head;
            Node prev=head;
            


            while(curr != null && curr.next != null){
                prev=prev.next;
                curr=curr.next.next;
            }
      
            System.out.print(prev.data);

    }
}