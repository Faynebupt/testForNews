package thread;

/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 *
 * @Author: lvliangliang@baidu.com
 * @Description：线程安全
 * @DATE: 2018/6/3
 */
public class Ticket implements Runnable{
    int ticket=100;
    public void run() {
        while (true) {
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(Thread.currentThread().getName()+"正在售票："+ticket--);
            }
        }
    }
}
