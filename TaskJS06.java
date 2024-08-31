import java.util.Scanner;

public class HomeTaskJS06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int month;

        System.out.println("Введите номер месяца ->");
        month = input.nextInt();

        switch (month)
        {
            case 1:
                System.out.println("Ваш месяц - Январь");
                break;
            case 2:
                System.out.println("Ваш месяц - Февраль");
                break;
            case 3:
                System.out.println("Ваш месяц - Март");
                break;
            case 4:
                System.out.println("Ваш месяц - Апрель");
                break;
            case 5:
                System.out.println("Ваш месяц - Май");
                break;
            case 6:
                System.out.println("Ваш месяц - Июнь");
                break;
            case 7:
                System.out.println("Ваш месяц - Июль");
                break;
            case 8:
                System.out.println("Ваш месяц - Август");
                break;
            case 9:
                System.out.println("Ваш месяц - Сентябрь");
                break;
            case 10:
                System.out.println("Ваш месяц - Октябрь");
                break;
            case 11:
                System.out.println("Ваш месяц - Ноябрь");
                break;
            case 12:
                System.out.println("Ваш месяц - Декабрь");
                break;
            default:
                break;

        }
    }
}
