package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Lu Hou
 * @date 2018/1/11
 * @time 下午4:32
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        helper(4,new ArrayList<String>(),new StringBuilder());
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(n*2,list,new StringBuilder());
        return list;
    }

    public static void helper(int n,List<String> result,StringBuilder sb){
        if(sb.length()==n&&isOk(sb.toString())){
            result.add(sb.toString());
            System.out.println(sb.toString());
        }else if(sb.length()<n){
            sb.append("(");
            helper(n,result,sb);
            sb.delete(sb.length()-1,sb.length());
            sb.append(")");
            helper(n,result,sb);
            sb.delete(sb.length()-1,sb.length());
        }
    }

    public static boolean isOk(String parentThese){
        Stack<Character> stack = new Stack();
        char[] strArray = parentThese.toCharArray();
        int num=0;
        for(int i=0;i<parentThese.length();i++){
            char temp = strArray[i];
            if('('==temp){
                stack.push(temp);
            }else {
                if(!stack.isEmpty()&&'('==stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

}
