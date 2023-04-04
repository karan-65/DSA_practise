package com.company.stack;

import javax.swing.*;
import java.util.Stack;

public class revrerseastack {

    //function for pushing at bottom of staack
    public static void pushatbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
             s.push(data);
             return;
        }
        int top=s.pop();
        pushatbottom(s,data);
        s.push(top);
    }

    //reversing a stack as it uses the approach of pushing at bottom
    public static void reverseastack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseastack(s);
        pushatbottom(s,top);
    }
    public  static void prnt(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(3);
        s.push(4);
        s.push(5);

        reverseastack(s);
        prnt(s);


    }
}
