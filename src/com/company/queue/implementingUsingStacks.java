package com.company.queue;

import java.util.Stack;

public class implementingUsingStacks {
    public static class queue{
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();


        public boolean isEmpty(){
            return s1.isEmpty();
        }
//adding elemenets
        public void push(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
//removing elements
        public int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return s1.pop();

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return s1.peek();
        }




    }
    public static void main(String[] args) {
        queue q=new queue();
        q.push(3);
        q.push(4);
        q.push(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
