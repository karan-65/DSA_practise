package com.company.stack;

import java.util.Stack;

public class validparenthesis {
    public static boolean fun(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='(' &&s.charAt(i)==')'||stack.peek()=='['&&s.charAt(i)==']'||stack.peek()=='{'||s.charAt(i)=='}'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(fun(s));
    }
}
