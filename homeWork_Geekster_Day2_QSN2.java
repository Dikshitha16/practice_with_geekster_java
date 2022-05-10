import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class homeWork_Geekster_Day2_QSN2
{
    public static void main(String[] args)
    {
        // Full Report Card Program
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            Date date = new Date();
            System.out.print(" Enter Student Name : ");
            String name = br.readLine();
            System.out.print("Enter Student Year : ");
            int year = sc.nextInt();
            System.out.println("Enter Subject Marks : ");
            System.out.print("English : ");
            int english = sc.nextInt();
            System.out.print("Math : ");
            int math = sc.nextInt();
            System.out.print("Science : ");
            int science = sc.nextInt();
            System.out.print("programming : ");
            int programming = sc.nextInt();
            String grade = "";
            int avg = (english + math + science + programming) / 4;
            if (avg <= 100) {
                if (avg >= 80)
                    grade = "A+";
                else if (80 > avg && 60 <= avg)
                    grade = "A";
                else if (60 > avg && 50 <= avg)
                    grade = "B+";
                else if (50 > avg && 40 <= avg)
                    grade = "B";
                else
                    grade = "Fail";

                System.out.println("Student name : " + name + " Student Year : " + year + " Your Grade : " + grade);
            } else {
                System.out.println("Sorry Wrong Input Please Enter your marks below 100 ");
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry Wrong Input Please Try again :(");
        }

    }
}
