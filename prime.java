package com.bl.corejava;

import java.util.Scanner;

class prime{
    public static void main(String args[])
    {
        int i,m=0,pr=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check if it is prime : ");
        int n = sc.nextInt();
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+" is not prime number");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime number");
                    pr=1;
                    break;
                }
            }
            if(pr==0)
            {
                System.out.println(n+" is prime number");
            }
        }
    }
}