import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter are of length and width : ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        String result = (l == w) ? "This is Square" : "This is rectangle";
        System.out.println(result);

        System.out.print("Enter you mark : ");
        int mark = sc.nextInt();
        System.out.println((int) 'a');


        char ch = sc.next().charAt(0);
        if (65 <= (int)ch && (int)ch <= 90)
            System.out.println("This is uppercase " + ch);
        else
            System.out.println("Other Charactor " + ch);

        String result = (100>=mark) ? (60 <= mark) ? "you are pass" : "You are fail" : "Sorry wrong input";

        if (33 < mark)
            System.out.println("You are pass :)");
        else
            System.out.println("Sorry you are fail :(");



        if (l == w)
        {
            System.out.println("This is Square");

        }
        else
        {
            System.out.println("This is rectangle");
        }


    }
}
