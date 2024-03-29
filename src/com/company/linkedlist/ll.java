package com.company.linkedlist;

public class ll {
    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size=0;
    }
    //for inserting at first
    public void insertAtFirst(int val){
        Node node= new Node(val);
         if(tail==null){
            tail=node;

         }
        node.next=head;
        head=node;
        size++;
    }

    //for inserting a element at last
    public void insertLast(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }
//for inserting at any index
    public void insertany(int val,int idx){
        Node node=new Node(val);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;

    }

    //for displaying a ll
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

//for deleting the first element
    public void deleteFirst(){
        int val =head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
//for deleting a element at last
    public void deleteLast(){

        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
    }
//for deleting element at any index
    public void deleteIdx(int idx){
        if(idx==0){
             deleteFirst();
        }
        if(idx==size-1){
            deleteLast();
        }

        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        size--;
    }
//function for detecting a loop in linkedlist
    public static boolean fun(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    //function for removing a cycle i ll
    public static void funn(Node head){
        Node slow=head;
        Node fast=head;
        boolean loop=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                loop=true;
                break;
            }
        }
        if(loop==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow==fast){
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;

    }



    public static Node mid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1,Node head2){
        Node n=new Node();
       Node temp=n;
       while (head1!=null&&head2!=null){
           if(head1.value<=head2.value){
               temp.next=head1;
               head1=head1.next;
               temp=temp.next;
           }
           else {
               temp.next=head2;
               head2=head2.next;
               temp=temp.next;
           }
       }

       return n.next;

    }
    //program for making ll zigzag
    public static void zigzag(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        Node curr=slow.next;
        slow.next=null;
        Node prev=null;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node lh,rh;
        while(left!=null&&right!=null){
            lh=left.next;
            left.next=right;
            rh=right.next;
            right.next=lh;

            left=lh;
            right=rh;
        }


    }


    //program for merge sort on linked list
    public static Node mergesort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node mid=mid(head);
        Node right=mid.next;
        mid.next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(right);

        return merge(newleft,newright);

    }


    private static class Node{
        private int value;
        private Node next;
        public Node(){

        }

        public Node(int value){

            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static void main(String[] args) {
        ll linkedlist=new ll();
        linkedlist.insertAtFirst(3);
        linkedlist.insertAtFirst(4);
        linkedlist.insertAtFirst(5);
        linkedlist.insertLast(6);


        linkedlist.display();




    }
}
