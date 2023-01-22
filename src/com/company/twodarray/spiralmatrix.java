package com.company.twodarray;

public class spiralmatrix {
    public static void spiral(int arr[][]){
        int sr=0;
        int sc=0;
        int er=arr.length-1;
        int ec=arr[0].length-1;
        while(sr<=er&&sc<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                System.out.println(arr[sr][j]);
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.println(arr[i][ec]);
            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.println(arr[er][j]);
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.println(arr[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
    }
}
