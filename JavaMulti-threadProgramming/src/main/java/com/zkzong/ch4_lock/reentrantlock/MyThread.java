package com.zkzong.ch4_lock.reentrantlock;

/**
 * Created by zong on 17-4-16.
 */
public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
