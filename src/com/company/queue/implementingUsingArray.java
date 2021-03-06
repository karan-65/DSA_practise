package com.company.queue;

public class implementingUsingArray {
    public static class queue{
        int[] arr;
        int size;
        int rear=-1;
        queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public  boolean isEmpty(){

            return rear==-1;
        }

        public  void add(int data){
            if(rear==size-1){
                System.out.println("is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //takes o(n) while insertion
        public  int remove(){
            if(isEmpty()){
                System.out.println("is full");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("is empty");
                return -1;
            }
            return arr[0];
        }



    }
    public static void main(String[] args) {
        queue q= new queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }



    }
    }

