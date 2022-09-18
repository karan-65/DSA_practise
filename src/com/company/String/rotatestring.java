package com.company.String;

public class rotatestring {
    //this is a leetcode problem check decription there
    //basically using the apporach of adding the same string and checking for the substring
    //try writting it you will understand
    public static boolean string(String s,String goal){
        return (s.length()==goal.length()&&(s+s).contains(goal));
    }
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(string(s,goal));

    }
}
