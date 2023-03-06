package com.company.bitmanipulation;

public class poweroftwo {
    public static boolean fun(int n){
        for(int i=0;i<=30;i++){
            int ans= (int) Math.pow(2,i);
            if(ans==n){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(fun(n));

    }

}
