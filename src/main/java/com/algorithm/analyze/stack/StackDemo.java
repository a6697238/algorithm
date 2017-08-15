package com.algorithm.analyze.stack;

/**
 * 类名称: StackDemo <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/13 下午3:21
 */
public class StackDemo {

    public static void main(String[] args) {
        StackCollection stackCollection = new StackCollection(10);
        stackCollection.push(1);
        stackCollection.push(2);
        stackCollection.push(3);

        System.out.println(stackCollection.pop());
        System.out.println(stackCollection.pop());
        System.out.println(stackCollection.pop());

    }
}
