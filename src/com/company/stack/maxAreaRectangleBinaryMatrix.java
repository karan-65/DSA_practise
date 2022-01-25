package com.company.stack;


import java.util.Stack;

public class maxAreaRectangleBinaryMatrix {
    public static int fn(int[]arr){
        //nearest smaller to left
        int[] a =new int[arr.length];
        Stack<Integer> s=new Stack<>();

        s.push(0);
        a[0] = -1;
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty()&&arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                a[i]=-1;
            }
            else{
                a[i]=s.peek();
            }
            s.push(i);
        }

        //nearest smaller to right

        int[] b =new int[arr.length];
        s=new Stack<>();
        s.push(arr.length - 1);
        b[arr.length - 1] = arr.length;

        for(int i=arr.length-2;i>=0;i--){
            while(!s.isEmpty()&&arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                b[i]=arr.length;
            }
            else{
                b[i]=s.peek();
            }
            s.push(i);
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = b[i] - a[i] - 1;
            int area = width * arr[i];
            if (area > max) {
                max = area;
            }
        }
        return max;


    }

    public static int fun2(int [][]arr3){
        //storing first row
        int[] curRow =arr3[0];
        //calculating its max area
        int max=fn(curRow);
        //calculating for next rows
        for(int i=1;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
                if(arr3[i][j]==0){
                    curRow[j]=0;
                }
                else{
                    curRow[j]+=1;
                }
            }
            int curAns=fn(curRow);
            max=Math.max(max,curAns);
        }
        return max;


    }

    public static void main(String[] args) {
        int[][] A = { {0, 1, 1,1,1, 0},
                {1, 1, 1 ,1,0,1},
                {1, 1,0,1, 1, 1},
                {1, 1,1,1,1, 0},
        };
        System.out.print("Area of maximum rectangle is " +
                fun2(A));
    }
}
