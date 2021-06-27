package com.bl.corejava;

import java.util.Scanner;

class utilityMonthlyPayment{
    Scanner sc = new Scanner(System.in);

    public utilityMonthlyPayment() {
        System.out.println("thak-you for using me to calculate monthly payment of your loan.");
        System.out.print("Enter your principle loan amount : ");
        int pLoanAmount = sc.nextInt();
        System.out.print("Enter loan period : ");
        int loanPeriod = sc.nextInt();
        System.out.print("Enter interest on loan amount : ");
        double interestLoan = sc.nextInt();
        double r = interestLoan/(12*100);
        int n = 12*loanPeriod;
        double payment = pLoanAmount *r/(1-(Math.pow((1+r),-n)));
        System.out.println("Payment of load per month is : " + payment);

    }
}
public class MonthlyPayment {
    public static void main(String[] args) {
        utilityMonthlyPayment payment = new utilityMonthlyPayment();

    }
}
