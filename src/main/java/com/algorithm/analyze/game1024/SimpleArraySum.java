package com.algorithm.analyze.game1024;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * AUTO-GENERATED: houlu @ 2018/10/18 下午7:20
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class SimpleArraySum {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        Integer num = Integer.valueOf(line);
        for (int i = 0; i < num; i++) {
            line = in.nextLine();

            String[] array = line.split(" ");

            BigInteger value1 = new BigInteger(array[0]);
            BigInteger value2 = new BigInteger(array[1]);

            System.out.println(value1.add(value2));
        }
    }

}
