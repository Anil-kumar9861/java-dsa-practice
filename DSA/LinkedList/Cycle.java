class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}

class Cycle{
    public static void main(String args[]){

        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;



        boolean cycle=false;


        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next != null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){
                cycle =true;
                break;
            }
        }


        if(cycle){
            System.out.print("it is a Cycle");
        }else{
            System.out.print("it is not a cycle");
        }
    }

}