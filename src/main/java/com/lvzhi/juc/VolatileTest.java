package com.lvzhi.juc;

/**
 * Created by lvzhi on 2018/3/11
 *
 * 1,volatile 不具备互斥性
 * 2，volatile 不具备原子性
 * 3，automic 可见性采用volatile，原子性采用cas
 *
 */
public class VolatileTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();

        while (true){
            if (myThread.isFlag()){
                System.out.println("-------------");
                break;
            }
        }
    }
}

class MyThread implements Runnable{

    private volatile boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}


