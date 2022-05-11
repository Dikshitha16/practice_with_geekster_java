package geekster;

import java.util.Scanner;

public class day3_home_work_2
{
    public static void main(String[] args)
    {
        //Write a program to print even numbers till n.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Input : ");
        int in = sc.nextInt();
        for (int i=1; i<=in;i++)
        {
            if (i%2==0)
                System.out.print(i + " ");
        }


    }
}
