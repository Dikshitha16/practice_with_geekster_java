import java.util.Scanner;

public class geekSterDSA1
{
    Scanner sc = new Scanner(System.in);
    private void sum()
    {
        System.out.println("Enter Two Numbers and get there Sum : ");
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second Number : ");
        int b =sc.nextInt();
        System.out.println("Result is "+ (a+b));
    }

    private void rectangle()
    {
        System.out.println("Enter length and width to find area of rectangle : ");
        System.out.print("Enter length  : ");
        double length = sc.nextDouble();
        System.out.print("Enter width : ");
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle is " + (length*width));

    }


    public static void main(String[] args)
    {
        geekSterDSA1 geek = new geekSterDSA1();
        geek.sum();
        System.out.println("\n---------------------------------------------------\n");
        geek.rectangle();
    }
}
