package com.company.array;

public class numberofdivisioringivenrange {
    public static void numOfDiv(int m, int n, int a, int b) {

        int count=0;
        for(int i=m+1;i<n-1;i++){
            if(i%a==0||i%b==0){
                count++;

            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        numOfDiv(5,11,4,6);
    }
}
