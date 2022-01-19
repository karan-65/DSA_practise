package com.company.queue;

public class circularQueueUsingArray {
    public static class Circulrqueue{
        int[] arr;
        int size;
        int rear=-1;
        int front=-1;
        Circulrqueue(int n){
            arr=new int[n];
            this.size=n;
        }
        public  boolean isEmpty(){

            return rear==-1&&front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }

        public  void add(int data){
            if(isFull()){
                System.out.println("is full");
                return;
            }
            //adding first elememt
            if(front==-1){
            front=0;
            }
            rear=(rear+1)%10;
            arr[rear]=data;
        }

        //takes o(n) while insertion
        public  int remove(){
            if(isEmpty()){
                System.out.println("is full");
                return -1;
            }
            int res=arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }

            return res;

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("is empty");
                return -1;
            }
            return arr[front];
        }



    }
    public static void main(String[] args) {
        Circulrqueue q= new Circulrqueue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
