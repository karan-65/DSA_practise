package com.company.stack;

import java.util.Stack;

public class minimumElementInStack {

    public static class stack {
        //this method isnt efficeint as it takes more space o(n)
        //here we used to stacks
        //s1 storing all elements whereas s2 storing minimum element
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        public  void push(int data) {
            s1.push(data);
            //we will push only if element present in s2 is bigger than the data to be pushed
            if (s2.size() == 0 || s2.peek() >= data) {
                s2.push(data);
            }
        }

        public  int pop() {
            if (s1.size() == 0) {
                return -1;
            }
            int ans = s1.peek();
            s1.pop();
            //if the element to be popped is equal to element in s2
            if (s2.peek() == ans) {
                s2.pop();
            }
            return ans;
        }

        public  int getMin() {
            if (s2.size() == 0) {
                return -1;
            }
            return s2.peek();
        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.getMin());


    }
}
