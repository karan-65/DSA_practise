package com.company.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class implmentation {
    public static class vertex{
        int src;
        int dest;
        int weight;

        vertex(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }

    static void creategraph(ArrayList<vertex> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new vertex(0,1,1));
        graph[0].add(new vertex(0,2,1));
        graph[1].add(new vertex(1,0,1));
        graph[1].add(new vertex(1,3,1));
        graph[2].add(new vertex(2,0,1));
        graph[2].add(new vertex(2,4,1));
        graph[3].add(new vertex(3,1,1));
        graph[3].add(new vertex(3,4,1));
        graph[3].add(new vertex(3,5,1));
        graph[4].add(new vertex(4,2,1));
        graph[4].add(new vertex(4,3,1));
        graph[4].add(new vertex(4,5,1));
        graph[5].add(new vertex(5,3,1));
        graph[5].add(new vertex(5,4,1));
        graph[5].add(new vertex(5,6,1));
        graph[5].add(new vertex(5,5,1));

    }

    static void bfs(ArrayList<vertex>graph[]){
        Queue<Integer>queue=new LinkedList<>();
        boolean arr[]=new boolean[graph.length];
        queue.add(0);
        while(!queue.isEmpty()){
            int curr= queue.remove();
            if(!arr[curr]){
                System.out.print(curr);
                arr[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    vertex v=graph[curr].get(i);
                    queue.add(v.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<vertex>graph[],int curr,boolean []vis){
        System.out.println(curr);
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            vertex v=graph[curr].get(i);
            if(!vis[v.dest]){
                dfs(graph,v.dest,vis);
            }
        }

    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<vertex>arr[]=new ArrayList[v];
        creategraph(arr);
//        bfs(arr);
        dfs(arr,0,new boolean[v]);




    }
}
