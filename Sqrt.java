package com.bl.corejava;

import java.util.Scanner;

class utilitySqrt {
    public utilitySqrt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter non negative value : ");
        int c = sc.nextInt();
        int t = c;
        // vale of epsilon is 2^-52
        while (Math.abs(t-(c/t)) > Math.pow(2,-52)){
            t = ((c/t)+ t)/2;
        }
        System.out.println("the square root of given value is : " + t);
    }
}
public class Sqrt {
    public static void main(String[] args) {
      utilitySqrt sqrt = new utilitySqrt();
    }
}


