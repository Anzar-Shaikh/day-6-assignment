package com.bl.corejava;

import java.util.Scanner;

class utilityDayOfWeek {
    Scanner sc = new Scanner(System.in);
    public utilityDayOfWeek() {
        System.out.println("For months Enter ");
        System.out.println("January-1  Feb-2 March-3 April-4 MAy-5 June-6 July-7 August-8 Sep-9 Oct-10 Nov-11 Dec-12");
        System.out.print("Enter month number as per instructions : ");
        int month = sc.nextInt();
//        System.out.println("Sunday-0 Monday-1 Tuesday-2 Wednesday-3 Thursday-4 Friday-5 Saturday-6");
        System.out.print("Enter date : ");
        int day = sc.nextInt();
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        int y0 = year - (14 - month) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = (month) + ((12 * ((14 - month) / 12)) - 2);
        int d0 = (day + x + (31 * m0 / 12)) % 7;

        System.out.print("the day of week is : " + d0 +" : " );
        switch (d0) {
            case 0 -> System.out.println("sunday");
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }

    }

}

public class DayOfWeek {
    public static void main(String[] args) {
        utilityDayOfWeek day = new utilityDayOfWeek();
    }
}
