package com.company.stack;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
//doesnt uses earlier done concepts
public class rainWaterTrapping {
    //basicilly in this problem we used the approach of finding greatest to left and greatest to right
    //then finding min of both
    //then subtracting arr[i] from min
    //this approach uses o(n)space as well as time also not the best approach
    public static int fun(int []arr,int size){
        //here finding the max to left
        int[] maxl =new int[size];
        //already assinging the value to first element
        maxl[0]=arr[0];
        for(int i=1;i<size;i++){
            maxl[i]=max(maxl[i-1],arr[i]);
        }
        //here finding max to right
        int[] maxR =new int[size];
        maxR[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
            maxR[i]=max(maxR[i+1],arr[i]);
        }
        int[] water =new int[size];
        for(int i=0;i<size;i++){
            water[i]=min(maxl[i],maxR[i])-arr[i];
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum =sum+water[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr2 ={7,0,4,2,5,0,6,4,0,5};
        System.out.println(fun(arr2,10));

    }
}
