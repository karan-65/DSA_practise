package com.company.array;

public class setmatrixzero {
    public static void matrix(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j]==0){
                    int ind=i-1;
                    while(ind>=0){
                        if(arr[ind][j]!=0){
                            arr[ind][j]=-1;
                        }
                        ind--;
                    }
                     ind=i+1;
                    while(ind<arr.length){
                        if(arr[ind][j]!=0){
                            arr[ind][j]=-1;
                        }
                        ind++;
                    }
                     ind=j-1;
                    while(ind>=0){
                        if(arr[i][ind]!=0){
                            arr[i][ind]=-1;
                        }
                        ind--;
                    }
                     ind=j+1;
                    while(ind< arr[0].length){
                        if(arr[i][ind]!=0){
                            arr[i][ind]=-1;
                        }
                        ind++;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] <= 0) {
                    arr[i][j] = 0;
                }
            }
        }


    }
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        matrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
