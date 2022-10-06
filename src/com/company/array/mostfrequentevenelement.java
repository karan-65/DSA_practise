package com.company.array;


import java.util.Arrays;

public class mostfrequentevenelement {
    public static int mostFrequentEven(int[] arr) {
        int count = 1;
        int maxcount = 0;
        Arrays.sort(arr);
        int temp = arr[0];
        int i = arr[0];

        while (arr[i] == arr[temp]&&arr[i]%2==0){
            count++;
            i++;
        if(count>maxcount){
        maxcount=count;
        }
        }


return maxcount;
}
    public static void main(String[] args) {
 int arr[]={4,4,4,4,9,1,1,1,2,2,4};
        System.out.println(mostFrequentEven(arr));
    }
}
