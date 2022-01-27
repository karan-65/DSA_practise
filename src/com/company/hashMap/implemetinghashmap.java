package com.company.hashMap;

import java.util.LinkedList;

public class implemetinghashmap {
    public class HashMap<K,V>{
        private class hNode{
            K key;
            V value;
            hNode(K key,V value){
                this.key=key;
                this.value=value;
            }
            private int size;
            private LinkedList<hNode>[]buckets;
            public HashMap(){
                initbuckets(4);
                size=0;
            }
            public void initbuckets(int N){
                buckets=new LinkedList[N];
                for(int bi=0;bi< buckets.length;bi++){
                    buckets[bi]=new LinkedList<>();
                }
            }

        }
    }
    public static void main(String[] args) {

    }
}
