import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class homeWorkGeeksterDay2qsn1
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your Name : ");
        String name = br.readLine();
        Date date = new Date();
        int hour = date.getHours();
        int min = date.getMinutes();
        int sec = date.getSeconds();

        if (0<hour && hour<3 )
            System.out.println("Mid Night " + name);
        else if (3<=hour && hour<5)
            System.out.println("Early Morning " + name);
        else if (5<=hour && hour<12)
            System.out.println("Good Morning " + name);
        else if (12<=hour && hour<=16)
            System.out.println("Good AfterNoon " + name);
        else if (16<hour && hour<=20)
            System.out.println("Good Evening " + name);
        else if (20<hour && hour<24)
            System.out.println("Good Night " + name);

    }
}
