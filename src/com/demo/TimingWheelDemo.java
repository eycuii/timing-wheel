package com.demo;

import java.util.concurrent.TimeUnit;

public class TimingWheelDemo {

    public static void main(String[] args) {
        TimingWheel<String> timingWheel = new TimingWheel<>(1, 60, TimeUnit.SECONDS);
        timingWheel.add("1分钟");
        timingWheel.addExpirationListener((s) -> System.out.println("expirationListener " + s));
        timingWheel.start();
    }
}
/*
运行结果：
waitForNextTick tick:1, sleepTime:1000
waitForNextTick tick:2, sleepTime:999
waitForNextTick tick:3, sleepTime:1000
waitForNextTick tick:4, sleepTime:996
waitForNextTick tick:5, sleepTime:999
waitForNextTick tick:6, sleepTime:994
waitForNextTick tick:7, sleepTime:1000
waitForNextTick tick:8, sleepTime:986
waitForNextTick tick:9, sleepTime:1000
waitForNextTick tick:10, sleepTime:988
waitForNextTick tick:11, sleepTime:999
waitForNextTick tick:12, sleepTime:997
waitForNextTick tick:13, sleepTime:1000
waitForNextTick tick:14, sleepTime:991
waitForNextTick tick:15, sleepTime:999
waitForNextTick tick:16, sleepTime:998
waitForNextTick tick:17, sleepTime:1000
waitForNextTick tick:18, sleepTime:991
waitForNextTick tick:19, sleepTime:1000
waitForNextTick tick:20, sleepTime:1000
waitForNextTick tick:21, sleepTime:999
waitForNextTick tick:22, sleepTime:1000
waitForNextTick tick:23, sleepTime:985
waitForNextTick tick:24, sleepTime:1000
waitForNextTick tick:25, sleepTime:989
waitForNextTick tick:26, sleepTime:999
waitForNextTick tick:27, sleepTime:1000
waitForNextTick tick:28, sleepTime:998
waitForNextTick tick:29, sleepTime:1000
waitForNextTick tick:30, sleepTime:1000
waitForNextTick tick:31, sleepTime:985
waitForNextTick tick:32, sleepTime:1000
waitForNextTick tick:33, sleepTime:988
waitForNextTick tick:34, sleepTime:1000
waitForNextTick tick:35, sleepTime:992
waitForNextTick tick:36, sleepTime:1000
waitForNextTick tick:37, sleepTime:988
waitForNextTick tick:38, sleepTime:1000
waitForNextTick tick:39, sleepTime:985
waitForNextTick tick:40, sleepTime:1000
waitForNextTick tick:41, sleepTime:991
waitForNextTick tick:42, sleepTime:997
waitForNextTick tick:43, sleepTime:1000
waitForNextTick tick:44, sleepTime:990
waitForNextTick tick:45, sleepTime:999
waitForNextTick tick:46, sleepTime:1000
waitForNextTick tick:47, sleepTime:989
waitForNextTick tick:48, sleepTime:1000
waitForNextTick tick:49, sleepTime:992
waitForNextTick tick:50, sleepTime:1000
waitForNextTick tick:51, sleepTime:988
waitForNextTick tick:52, sleepTime:1000
waitForNextTick tick:53, sleepTime:989
waitForNextTick tick:54, sleepTime:999
waitForNextTick tick:55, sleepTime:1000
waitForNextTick tick:56, sleepTime:1000
waitForNextTick tick:57, sleepTime:988
waitForNextTick tick:58, sleepTime:1000
waitForNextTick tick:59, sleepTime:994
waitForNextTick tick:60, sleepTime:1000
expirationListener 1分钟
waitForNextTick tick:61, sleepTime:988
waitForNextTick tick:62, sleepTime:999
.
.
.
 */