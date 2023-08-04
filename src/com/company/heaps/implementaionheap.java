package com.company.heaps;

import java.util.ArrayList;

public class implementaionheap {
    public  class heap{
        ArrayList<Integer>arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int child=arr.size()-1;
            int parent=(child-1)/2;
            while(arr.get(child)<arr.get(parent)){
                int temp=arr.get(child);
                arr.set(child,arr.get(parent));
                arr.set(parent,temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int min=i;

            if(left<arr.size()&&arr.get(left)<arr.get(min)){
                min=left;
            }
            if(right<arr.size()&&arr.get(right)<arr.get(min)){
                min=right;
            }

            if(min!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }

        }

        public void remove(){
            int temp=arr.get(0);
            arr.set(0, arr.size()-1 );
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);
            
            heapify(0);
        }

        

    }

    public static void main(String[] args) {

    }
}
