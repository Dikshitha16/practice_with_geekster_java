package geekster;

import java.util.Scanner;

public class Day4_home_work_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rang : ");
        int num = sc.nextInt();
        for(int i =1; i<=num; i++)
        {
            for (int j = 0; j<i; j++) {
                if (i%2 == 0) {
                    System.out.print((char)(j+65) + " ");
                }
                else {
                    System.out.print((char)(j+97) + " ");
                }
            }
            System.out.println();
        }

    }
}
