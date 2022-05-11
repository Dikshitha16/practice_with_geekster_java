package geekster;

import java.util.Scanner;

public class day3_home_work_7
{
    public static void main(String[] args)
    {
        // WAP to input n, loop for n times and input 2 numbers in each iteration, if iteration is even(0th,2nd,4th..) print sum else print multplication

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number : ");
        int in = sc.nextInt();

        for (int i =0; i<=in; i++)
        {
            System.out.println("Enter Two Numbers : ");
            System.out.print("Enter 1st Number : ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number : ");
            int b = sc.nextInt();

            if (i%2==0)
                System.out.println("Sum = " + (a+b));
            else
                System.out.println("Multiple = " + (a*b));
        }


    }
}
