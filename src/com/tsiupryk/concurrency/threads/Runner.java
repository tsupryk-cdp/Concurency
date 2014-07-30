package com.tsiupryk.concurrency.threads;

public class Runner extends Thread {

    private String stringToShow;

    public Runner(String stringToShow) {
        this.stringToShow = stringToShow;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {


            if (counter % 60 == 0) {
                System.out.println();
            } else {
                System.out.print(stringToShow);
            }

            counter++;


            try {
                sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
