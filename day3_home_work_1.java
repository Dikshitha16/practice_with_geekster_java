package geekster;

public class day3_home_work_1
{
    public static void main(String[] args)
    {
//        Write a program to print 	    1 2 3 4
//                                      5 6 7 8
//                                      9 10 11 12
        int incre=1;
        for (int i = 1; i<=3;i++)
        {
            for(int j = 1; j<=4; j++)
                System.out.print(incre++ + " ");
            System.out.println();
        }
    }
}
