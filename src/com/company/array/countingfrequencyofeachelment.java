package com.company.array;
//here using the approach of already visited element using two for loops

public class countingfrequencyofeachelment {
    public static void count(int[]arr,int n){
//this array here is to check the true values that will be true if they are already visited
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            //skipping the element that is already visited
            if(visited[i]==true){
                continue;
            }
            //initalising the count for counting
            int count=1;
            //second loop comparing the value with all other values
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    //setting visited equals to true if if it found the same value
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+ " "+count);
        }

    }
    public static void main(String[] args) {
        int[]arr={2,3,3,5,6,6,6};
        count(arr,7);

    }
}
