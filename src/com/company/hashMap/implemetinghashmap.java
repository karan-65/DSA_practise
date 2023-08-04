package com.company.hashMap;

import java.util.LinkedList;

public class implemetinghashmap {
    static class HashMap<K,V>{
        private class hNode{
            K key;
            V value;
            hNode(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
            private int size;
            private LinkedList<hNode>[]buckets;
            @SuppressWarnings("unchecked")
            public HashMap() {
                this.size = 0;
                this.buckets = new LinkedList[4];
                for (int i = 0; i < 4; i++) {
                    this.buckets[i] = new LinkedList<>();
                }


            }

        }
    
    public static void main(String[] args) {

    }
}
