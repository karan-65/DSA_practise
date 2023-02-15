package com.company.linkedlist;

public class sortzerosonestwosinll {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node fun(Node head){
        Node temp=head;
        int count0=0;
        int count1=0;
        int count2=0;
        while(temp!=null){
            if(temp.data==0){
                count0++;

            }
            if(temp.data==1){
                count1++;

            }
            if(temp.data==2){
                count2++;

            }
            temp=temp.next;
        }
        temp=head;
        while(count0!=0){
            temp.data=0;
            temp=temp.next;
            count0--;
        }
        while(count1!=0){
            temp.data=1;
            temp=temp.next;
            count1--;
        }
        while(count2!=0){
            temp.data=2;
            temp=temp.next;
            count2--;
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
