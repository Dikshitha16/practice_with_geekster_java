package geekster;

import java.util.Scanner;

public class day3_home_work_6
{
    public static void main(String[] args)
    {
        // WAP to find number of pairs with given sum

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number : ");
        int in = sc.nextInt();

        for(int i = 1; i<=in;i++)
        {
            for (int j = i+1; j<=in; j++)
            {
                if ((i+j) == in)
                {
                    System.out.println("i," + "j" + " = " + i + "," + j);
                    break;
                }
            }
        }

    }
}
