package com.algorithm.analyze.game1024;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * AUTO-GENERATED: houlu @ 2018/10/18 下午7:35
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class MoveBook {

    private static List<Integer> resultList = new ArrayList<Integer>();

    private static List<Integer> result(List<List<Float>> allList) {
        for (List<Float> bookFloat : allList) {
            if (bookFloat.size() > 1) {
                int count = 0;
                float flag = 0.0F;
                for (int i = 0; i < bookFloat.size(); i++) {
                    if (bookFloat.size() > 1) {
                        for (int j = i + 1; j < bookFloat.size(); j++) {
                            if (bookFloat.get(j) != flag) {
                                if (bookFloat.get(j) < bookFloat.get(i)) {
                                    System.out.println(bookFloat.get(i) + "  " + bookFloat.get(j));
                                    count++;
                                }
                                flag = bookFloat.get(j);
                            }
                        }
//                        flag = bookFloat.get(i);
                    }
                }
                resultList.add(count);
            } else {
                resultList.add(0);
            }
        }
//        bookFloat.add(1.4F);
//        bookFloat.add(2.3F);
//        bookFloat.add(3.5F);

//        bookFloat.add(5.4F);
//        bookFloat.add(3.1F);
//        bookFloat.add(1.2F);

//        bookFloat.add(2.4F);
//        bookFloat.add(1.2F);
//        bookFloat.add(1.2F);
//        bookFloat.add(5F);

        return resultList;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        List<List<Float>> allList = new ArrayList<List<Float>>();

        Integer num = Integer.valueOf(line);
        for (int i = 0; i < num; i++) {
            line = in.nextLine();
            String[] array = line.split(" ");
            List<Float> bookList = new ArrayList<Float>();
            for (int j = 1; j <= Integer.valueOf(array[0]); j++) {
                bookList.add(Float.valueOf(array[j]));
            }
            allList.add(bookList);
        }
        List<Integer> result = result(allList);
        for (Integer i : result) {
            System.out.println(i);
        }
    }


}
