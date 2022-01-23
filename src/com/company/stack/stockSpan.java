package com.company.stack;

import java.util.Arrays;
import java.util.Stack;
//it uses the same approach as nearest greater to left
public class stockSpan {
    public static int [] stock(int[]arr){

        int []a=new int[arr.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            //here we need the index values that why we wrote arr[s.peek()]
            while(!s.isEmpty()&&arr[s.peek()]<arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                a[i]=i+1;
            }
            else{
                a[i]=i-s.peek();
            }
            s.push(i);

        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr1 ={100,80,60,70,60,75,85};
        int[] arr2 =stock(arr1);

            Arrays.stream(arr2).forEach(System.out::println);

    }
}
