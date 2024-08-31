import java.util.Scanner;

public class TaskJS04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int time_h=0, time_m=0, time_s=0;
        boolean h=false, m=false, s=false;

        while (!h)
        {
            System.out.print("Введите часы -> ");
            time_h = input.nextInt();
            if (time_h >=0 && time_h <24) h=true;
            else System.out.printf("Часы должны быть в диапазоне от 0 до 23!%n");
        }

        while (!m)
        {
            System.out.print("Введите минуты -> ");
            time_m = input.nextInt();
            if (time_m >=0 && time_m <60) m=true;
            else System.out.printf("Минуты должны быть в диапазоне от 0 до 59!%n");
        }

        while (!s)
        {
            System.out.print("Введите секунды -> ");
            time_s = input.nextInt();
            if (time_s >=0 && time_s <59) s=true;
            else System.out.printf("Секунды должны быть в диапазоне от 0 до 59!%n");
        }

        System.out.printf("Текущее время %d:%d:%d", time_h, time_m, time_s);
    }
}