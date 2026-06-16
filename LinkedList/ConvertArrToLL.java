package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

class ConvertArrToLL{
    public static void main(String [] args){
        int [] arr={1,2,3,4};
        Node head=new Node(arr[0]);
        Node temp=head;
        int i=1;
        while(i<arr.length){
            Node newnode=new Node(arr[i]);
            temp.next=newnode;
            temp=newnode;
            i++;
        }
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
         
    }
}