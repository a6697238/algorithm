package com.algorithm.analyze.str;

/**
 * 类名称: NumToVoice <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/15 下午11:03
 */
public class NumToVoice {

    private static String[] unit = new String[]{"十", "百", "千", "万", "十万", "百万", "千万", "亿"};
    private static String[] voice = new String[]{"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

    public static String getVoice(int num) {
        int voiceIndex = 0;
        int unitIndex = 0;
        int numLength = String.valueOf(num).length();
        boolean getZero = false;
        StringBuffer out = new StringBuffer();
        while (unitIndex < numLength) {
            voiceIndex = num % 10;
            if (voiceIndex > 0) {
                if (unitIndex > 0) {
                    out.insert(0, unit[unitIndex - 1]);
                }
                out.insert(0, voice[voiceIndex]);
                getZero = true;
            } else {
                if (getZero == true) {
                    out.insert(0, voice[0]);
                }
                getZero = false;
            }
            num = num / 10;
            unitIndex++;

        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(getVoice(10001244));
    }
}
