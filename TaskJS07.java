import java.util.Scanner;

public class HomeTaskJS07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sign;
        double a, b, c;

        System.out.println("Введите первое число ->");
        a = input.nextInt();
        System.out.println("Введите второе число ->");
        b = input.nextInt();

        System.out.println("Введите одно из действий: +, -, *, /");
        sign = input.next();

        switch (sign)
        {
            case '43':
                c = a + b;
                System.out.println("Результат операции '+': " + c);
                break;
            case "-":
                c = a - b;
                System.out.println("Результат операции '-': " + c);
                break;
            case "*":
                c = a * b;
                System.out.println("Результат операции '*': " + c);
                break;
            case "/":
                c = a / b;
                System.out.println("Результат операции '/': " + c);
                break;
            default:
                System.out.println("Вы не ввели ни одного из действий");
                break;
        }
    }
}
