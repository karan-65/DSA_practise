package com.company.stack;

import java.util.Stack;

public class nextSmallerToLeft {
    public static int[] fun(int[] a){
        int n=a.length;
        int[]arr=new int[n];
        Stack<Integer> s=new Stack<>();
        //loop will run from front
        for(int i=0;i<=n-1;i++){
            while(!s.isEmpty() &&s.peek()>=a[i]){
                s.pop();
            }
            if (!s.isEmpty()){
                arr[i] = s.peek();
            }
            else {
                arr[i] = -1;
            }

            s.push(a[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={5,2,3,1,6};

        int[] arr2 =fun(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
