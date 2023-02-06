package com.company.linkedlist;

public class isLLPalindrome {
//    public boolean fun(Node head) {
//        if (head == null || head.next == null) {
//            return true;
//        }
//        //first find middle of the linked list
//        Node fast = head;
//        Node slow = head;
//        while (fast != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        //reversing the other half of the linked list
//        //slow here refer to the middle
//        slow.next = reversell(slow.next);
//
//        //slow will refer to the first of the other reversed part
//        slow = slow.next;
//        //comparing the other half with the first half if equal it will return true
//        while (slow != null) {
//            if (head.value != slow.value) {
//                return false;
//            }
//            head = head.next;
//            slow = slow.next;
//
//        }
//        return true;
//    }
//
//        public Node reversell(Node head){
//            Node temp=null;
//            while(head!=null){
//                Node next=head.next;
//                head.next=temp;
//                temp=head;
//                head=next;
//            }
//            return temp;
//        }
//

    public static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }

    public static boolean reverse(Node head){
        Node mid=mid(head);

        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.value!=right.value){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    private class Node{

        private int value;
        private Node next;

        public Node(){

        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static void main(String[] args) {

    }
}
