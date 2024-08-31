import java.util.Scanner;

public class TaskJS01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Введите число -> ");
        num = input.nextInt();

        if (num > 0) System.out.print("Ваше число положительное");
        if (num < 0) System.out.print("Ваше число отрицательное");
        if (num == 0) System.out.print("Вы ввели ноль!");
    }
}