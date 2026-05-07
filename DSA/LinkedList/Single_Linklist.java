class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }

}


class Single_Linklist{
    public static void main(String args[]){

        Node node =new  Node(10);
        node.next=new Node(20);
        node.next=new Node(30);
        node.next=new Node(40);

        while(node.next!=null){
            System.out.print(node.data);
        }



    }
}