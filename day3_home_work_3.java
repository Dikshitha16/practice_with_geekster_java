package geekster;

import java.util.Scanner;

public class day3_home_work_3
{
    public static void main(String[] args)
    {
//        Write a program to print all multiples of 7 till n

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int in = sc.nextInt();

        System.out.println("Table of 7 till Your input :");
        for (int i = 1; i<=in;i++)
        {
            System.out.println("7 * " + i + " = " + (i*7));
        }

    }
}
