package com.company.stack;
import java.util.Stack;
//using approach of nsl and nsr and getting their index

public class maximumAreaHistogram {
    public static int fn(int[]arr){
        //nearest smaller to left
        int[] a =new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                a[i]=0;
            }
            else{
                a[i]=s.peek()+1;
            }
            s.push(i);
        }

        //nearest smaller to right
        int[] b =new int[arr.length];
         s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                b[i]=arr.length-1;
            }
            else{
                b[i]=s.peek()-1;
            }
            s.push(i);
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            int width=b[i]-a[i]+1;
            int area=arr[i]*width;
            if(area>max){
                max=area;
            }
        }
        return max;


    }
    public static void main(String[] args) {
        int[] hist = { 1,7,8,2 };
        System.out.println("Maximum area is " + fn(hist));



    }
    }

