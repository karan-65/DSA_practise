package com.company.String;

public class stringtouppercase {
    public static String fun(String str){
        StringBuilder s=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        s.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                s.append(str.charAt(i));

            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String s="hello i am karan";
        System.out.println(fun(s));
    }
}
