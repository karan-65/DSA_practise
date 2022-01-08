package com.company;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int f= sc.nextInt();
        int g=sc.nextInt();
        if(l>g){
            if(l>f){
                System.out.println(l +"is largest");
            }
        }
        else{
            if(f>g){
                System.out.println(f +"is gretaeast");
            }
            else {
                System.out.println(g +"is gratest");
            }
        }

    }
}
