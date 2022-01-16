package stack.java;

public class stackUsingLL {
    public static class Stack{
        Node head;
        public  boolean isEmpty(){
            return head == null;

        }
        public void push(int data){
            Node node = new Node(data);
            if(isEmpty()){
                head=node;
                return;
            }
            node.next=head;
            head=node;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            head=head.next;
            return top;

        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data=data;
            next=null;
        }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
