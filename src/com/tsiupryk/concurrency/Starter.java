package com.tsiupryk.concurrency;

import com.tsiupryk.concurrency.threads.Runner;

public class Starter {

    public static void main(String[] args) throws InterruptedException {
        Runner r1 = new Runner(".");
        Runner r2 = new Runner("|");

        r1.start();
        r2.start();

        Thread.sleep(2000);

        r1.interrupt();

    }

}
