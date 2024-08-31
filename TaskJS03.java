import java.util.Scanner;

public class TaskJS03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Введите число -> ");
        num = input.nextInt();

        if (num >= 0) System.out.printf("Модуль вашего числа |%d| = %d", num, num);
        else System.out.printf("Модуль вашего числа |%d| = %d", num, -num);
    }
}