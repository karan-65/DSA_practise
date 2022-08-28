package com.company.array;

public class takingzeorsatend {
    public static void zeros(int []arr){
        int insertpoisition=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[insertpoisition]=arr[i];
                    insertpoisition++;
                }
            }
        while (insertpoisition<arr.length){
            arr[insertpoisition++]=0;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
    public static void main(String[] args) {
        int arr[] ={1,2,0,1,0,4,0};
        zeros(arr);
    }
}
