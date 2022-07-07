package com.company.binarysearch;

public class firstandlastocurrence {

    public static  int[] ans(int[]nums,int target){
        int[] ans={-1,-1};
        int start=binarysearch(nums,target,true);
        int end=binarysearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    public static int binarysearch(int []nums,int target,boolean findstartindex){
        int ans=-1;
        int start=nums[0];
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
