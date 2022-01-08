package com.company;
import java.util.ArrayList;
import java .util.Scanner;

public class Main {
    public static ArrayList<String> gss(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch=up.charAt(0);

        ArrayList<String> left= gss(p + ch,up.substring(1));
        ArrayList<String> right=gss(p,up.substring(1));

        left.addAll(right);
        return left;


    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        String str=sc.next();

        System.out.println(gss("",str));


    }
}
