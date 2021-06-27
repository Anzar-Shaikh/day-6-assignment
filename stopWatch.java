package com.bl.corejava;

import java.util.Scanner;

public class stopWatch {
    Scanner sc = new Scanner(System.in);
    public long startTimer;
    public long stopTimer;
    public long elapsed;
    int userStart;
    int userEnd;

    public void start() {
        System.out.print("Enter 1 to start time : ");
        userStart=sc.nextInt();
        if (userStart == 1 ) {
            startTimer=System.currentTimeMillis();
        }
        else {
            System.out.println("Enter valid number as per instructions.");
        }
    }

    public void stop() {
        if (userStart == 1) {
            System.out.print("Enter 2 to stop time : ");
            userEnd = sc.nextInt();
            if (userEnd==2) {
                stopTimer = System.currentTimeMillis();
            }else  {
                System.out.println("Enter valid number as per instructions. ");
            }
        }

    }
    public void getElapsedTime() {
        if ( userEnd == 2 ) {
            elapsed = stopTimer - startTimer;
            System.out.println("The elapsed time is : " + elapsed/1000 +" seconds");
        }
    }
    public static void main(String[] args) {
        stopWatch stopwatch = new stopWatch();
        stopwatch.start();
        stopwatch.stop();
        stopwatch.getElapsedTime();

    }
}
