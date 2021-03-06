package com.zkzong.ch1.thread.share;

/**
 * Created by Zong on 2017/2/3.
 * 数据共享
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        // 此示例不要用for语句，因为使用同步后其他线程就得不到运行的机会了，一直由一个线程进行减法运算
        System.out.println("由" + this.currentThread().getName()
            + "计算，count=" + count);
    }
}
