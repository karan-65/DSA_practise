package com.company.twodarray;
//here we have to rotate the matrix by 90 degree
//so we use basic method that is transposing the matrix and then
//reversing the rows of the matrix

public class rotatematrix {
    public static void rotate(int[][] arr) {

        //transposing the matrix
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
//reversing the matrix rows
        for(int i=0;i<arr.length;i++){
            int li=0;
            int ri=arr[i].length-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
        //printing the matrix
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);

    }
}
