import java.util.Scanner;

public class Task05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int time;

        System.out.print("Введите текущее время -> ");
        time = input.nextInt();

        if (time>0 && time<6) System.out.print("Good Night");
        if (time >=6 && time <13) System.out.print("Good Morning");
        if (time >=13 && time <17) System.out.print("Good Day");
        if (time >=17 && time <=23) System.out.print("Good Evening");
    }
}