import java.util.Scanner;

public class TaskJS06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, max, min, d, result;
        double middle;


        System.out.print("Введите первое число -> ");
        n1 = input.nextInt();
        System.out.print("Введите второе число -> ");
        n2 = input.nextInt();
        System.out.print("Введите третье число -> ");
        n3 = input.nextInt();

        System.out.printf("1. Вывести максимальное число%n");
        System.out.printf("2. Вывести минимальное число%n");
        System.out.printf("3. Вывести среднее арифметическое числе%n");
//        System.out.printf("0. Выйти из программы%n");
        System.out.print("Введите номер действия для выполнения -> ");

        d = input.nextInt();
        //while (d!=0)
        {


            switch (d) {
                case 1: {
                    max = n1;
                    if (max < n2) max = n2;
                    if (max < n3) max = n3;
                    System.out.printf("Наибольшее число %d", max);
                }

                break;

                case 2: {
                    min = n1;
                    if (min > n2) min = n2;
                    if (min > n3) min = n3;
                    System.out.printf("Наименьшее число %d", min);
                }
                break;

                case 3: {
                    middle = (n1 + n2 + n3) / 3;
                    System.out.printf("Сумма чисел равна %.3f", middle);

                }
                break;

                case 0:
                    break;
                default:
                    break;
            }
        }


    }
}