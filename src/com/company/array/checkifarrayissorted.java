package com.company.array;
//first thing we does not need to sort array we had to check it if it is sorted
public class checkifarrayissorted {
    //this apprach uses on2 comparing first element with every other
    public static boolean check(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
                }
            }
        return true;
        }

    //this approach is much better just compare it with previous element
    public static boolean check2(int []arr){
        for(int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[]arr={9,4,5,6};
        System.out.println(check(arr));

    }
}
