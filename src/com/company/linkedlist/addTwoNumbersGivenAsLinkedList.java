package com.company.linkedlist;
//approach
//using pointer l1 and l2 storing their sum in sum

public class addTwoNumbersGivenAsLinkedList {
    public Node fun(Node l1,Node l2){
        //dummy node that will point to first node
        Node dummy=new Node();
        Node temp=dummy;
        //int carry for adding carry
        int carry=0;
        while(l1!=null||l2!=null||carry==1){
            int sum=0;
            if(l1!=null){
                sum +=l1.value;
                l1=l1.next;
            }
            if(l2!=null){
                sum +=l2.value;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            //adding the whole sum to new node sum%10 that will return the number
            Node node=new Node(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }

    private class Node{

        private int value;
        private Node next;

        public Node(){

        }
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static void main(String[] args) {

    }
}
