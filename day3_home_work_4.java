package geekster;

import java.util.Scanner;

public class day3_home_work_4
{
    public static void main(String[] args)
    {
        // WAP to count multiples of 3, multiples of 5 and both 3,5 in range 1-n.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number : ");
        int in = sc.nextInt();

        System.out.println("Multiple 3 and Multiple 5 till n : ");
        for (int i=1; i<=in;i++)
        {
            System.out.println("3 * " + i + " = " + (i*3) + "\t:\t" + "5 * " + i + " = " + (i*5));
        }

    }
}
