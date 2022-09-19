package com.company.array;

public class maximumsumsubarraykadane {
    //similar with longest subarray given sum k problem
    //this is not the best appraoch
    //use kadane algorithm for best appraoch


//    public static int sum(int []arr){
//        int max_sum=0;
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=i;j<arr.length;j++){
//                sum+=arr[j];
//                if(sum>max_sum){
//                    max_sum=sum;
//                }
//            }
//        }
//        return max_sum;
//    }

    //this one is kadane solution
    //it is easy reference from pepcodingand anuj
    public static int kadane(int []arr){
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(currsum>=0){
                currsum+=arr[i];
            }
            else {
                currsum=arr[i];
            }
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[]arr={-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(kadane(arr));
    }
}
