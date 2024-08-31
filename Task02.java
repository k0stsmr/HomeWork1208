import java.util.Scanner;

public class Task02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, d, result;


        System.out.print("Введите первое число -> ");
        n1 = input.nextInt();
        System.out.print("Введите второе число -> ");
        n2 = input.nextInt();
        System.out.print("Введите третье число -> ");
        n3 = input.nextInt();

        System.out.printf("1. Вычислить сумму чисел%n");
        System.out.printf("2. Вычислить произведение чисел%n");
        System.out.print("Введите номер действия для выполнения -> ");

        d = input.nextInt();
        if (d==1)
        {
            result = n1 + n2 + n3;
            System.out.printf("Сумма чисел равна %d", result);

        }
        else
        {
            result = n1 * n2 * n3;
            System.out.printf("Произведение чисел равно %d", result);
        }
    }
}