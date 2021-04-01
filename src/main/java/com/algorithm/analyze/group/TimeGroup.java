package com.algorithm.analyze.group;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AUTO-GENERATED: houlu @ 2019/3/8 上午12:16
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class TimeGroup {

    public static String[] task = {"1,17:01,18:05", "2,16:05,17:06", "3,17:03,17:40",
            "4,16:09,17:08"};

    public static int count = 0;


    public static void main(String[] args) throws ParseException {

        //这段逻辑可以按照 time key 打散，然后分发到多台机器处理
        for (String str : task) {
            if (isValid(getTaskObj(str), 1700)) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean isValid(TaskObj taskObj, long time) {
        if (taskObj.getStartTime() < time && time<taskObj.getEndTime()) {
            return true;
        } else {
            return false;
        }
    }


    public static TaskObj getTaskObj(String str){
        String[] array = str.split(",");
        String taskId = array[0];
        String timeKey = array[1].split(":")[0];
        String start = array[1].split(":")[0]+array[1].split(":")[1];
        String end =  array[2].split(":")[0]+array[2].split(":")[1];

        TaskObj taskObj = new TaskObj();
        taskObj.setTaskId(taskId);
        taskObj.setTimeKey(timeKey);
        taskObj.setStartTime(Long.valueOf(start));
        taskObj.setEndTime(Long.valueOf(end));

        return taskObj;
    }

}

class TaskObj {

    //timeKey字段为了做分布式处理,打散
    private String timeKey;

    private long startTime;

    private long endTime;


    private String taskId;

    public String getTimeKey() {
        return timeKey;
    }

    public void setTimeKey(String timeKey) {
        this.timeKey = timeKey;
    }


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
