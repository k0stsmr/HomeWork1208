import java.util.Scanner;

public class HomeTaskJS08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Введите первое число ->");
        a = input.nextInt();
        System.out.println("Введите второе число ->");
        b = input.nextInt();

        int c = (a > b) ? a : b;
        System.out.println("Из них больше " + c);
    }
}
