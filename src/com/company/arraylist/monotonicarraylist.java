package com.company.arraylist;

import java.util.ArrayList;

public class monotonicarraylist {
    public static boolean fun(ArrayList<Integer>arr){
        boolean increasing  =true;
        boolean decreasing=true;

        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)) {
                increasing=false;
            }
            else{
                decreasing=false;
            }

    }
        return increasing||decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(16);
        arr.add(18);
        arr.add(19);
        arr.add(20);
        System.out.println(fun(arr));
    }
}
