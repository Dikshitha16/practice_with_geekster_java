package geekster;

import java.util.Scanner;

public class Day4_home_work_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rang : ");
        int num = sc.nextInt();
        for(int i =0; i<num; i++)
        {
            for (int j = i; j>=0; j--)
                System.out.print((char)(j+97) + " ");
            System.out.println();
        }
    }
}
