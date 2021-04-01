package com.algorithm.analyze.stack;

/**
 * 类名称: StackCollection <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/13 下午3:16
 */
public class StackCollection {

    private int[] stack;

    private int size;

    private int head;

    public StackCollection(int size) {
        this.stack = new int[size];
        this.head = 0;
        this.size = size;
    }

    public void push(int num){
        if(head==size){
            throw new RuntimeException("stack full");
        }
        stack[head] = num;
        head ++;
    }

    public int pop(){
        if(head==0){
            throw new RuntimeException("stack empty");
        }
        head--;
        return stack[head];
    }
}
