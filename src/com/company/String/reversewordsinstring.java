package com.company.String;

import java.util.Stack;

public class reversewordsinstring {
    public static String reverse(String s){
//        int i=s.length()-1;
//        String ans="";
//        while(i>=0){
//            while(i>=0 && s.charAt(i)==' '){
//                i--;
//            }
//            int j=i;
//            if(i<0) break;
//            while(i>=0 && s.charAt(i)!=' ')i--;{
//                if(ans.isEmpty()){
//                ans=ans.concat(s.substring(i+1,j+1));}
//                else {
//                    ans = ans.concat(" " + s.substring(i + 1, j + 1));
//                }
//            }
//        }
//
//      return ans;

//    }
        Stack<String> st= new Stack<>();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character c= s.charAt(i);
            if (c.equals(".")){
                st.add(sb.toString());
                sb.delete(0,sb.length());
            }else{
                sb.append(s.charAt(i));
            }
        }
        sb.delete(0,sb.length());
        while(st.size()!=0){
            sb.append(st.peek());
            sb.append(".");
            st.pop();
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="y.name.is.karan";
        System.out.println(reverse(s));

    }
}
