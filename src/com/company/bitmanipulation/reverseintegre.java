package com.company.bitmanipulation;

public class reverseintegre {
    public static int fun(int x){
        int ans=0;
        while(x!=0){
            int digit=x%10;
            if(ans>Integer.MAX_VALUE/10||ans<Integer.MIN_VALUE/10){
                return 0;
            }
            ans=(ans*10)+digit;
            x=x/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=2345;
        System.out.println(fun(x));
    }
}
