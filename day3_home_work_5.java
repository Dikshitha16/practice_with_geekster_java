package geekster;

import java.util.Scanner;

public class day3_home_work_5
{
    public static void main(String[] args)
    {
        // WAP to count number of pairs in 1-n with sum even.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number :");
        int in = sc.nextInt();
        int even = 0;
        System.out.println("Sum of Even pairs : ");
        for (int i = 1; i<=in; i++)
        {
            if (i%2==0)
                even += i;
        }
        System.out.println("Total of Even pairs : " + even);

    }
}
