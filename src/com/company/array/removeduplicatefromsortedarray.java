package com.company.array;
//using the approach of two pointers
//watch strivers video if not understand
public class removeduplicatefromsortedarray {
    public static int remove(int[]nums) {
    //initialisng first pointer pointing to the first index
        int current = 0;
        for (int i = 1; i < nums.length; i++){
            //if the values of both are different
            if (nums[i] != nums[current])
                //we will move our current
                current++;
            //and assign current to j
            nums[current] = nums[i];
        }
//this will return arr because current was pointing to last and we want last +1 that is whole unique array
        return current+1;

    }
    public static void main(String[] args) {
        int[]arr={1,2,2,2,3,3};
        System.out.println(remove(arr));
    }
}
