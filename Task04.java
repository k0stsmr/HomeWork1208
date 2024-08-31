import java.util.Scanner;

public class Task04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int d;
        double metr, mile, inch, yard;


        System.out.print("Введите количество метров -> ");
        metr = input.nextDouble();

        System.out.printf("1. Перевести в мили%n");
        System.out.printf("2. Перевести в дюймы%n");
        System.out.printf("3. Перевести в ярды%n");
//        System.out.printf("0. Выйти из программы%n");
        System.out.print("Введите номер действия для выполнения -> ");

        d = input.nextInt();
        //while (d!=0)
        {


            switch (d) {
                case 1:
                {
                    mile = metr/1600;
                    System.out.printf("В %f метрах %f миль", metr, mile);
                }

                break;

                case 2: {
                    inch = metr/0.0254;
                    System.out.printf("В %f метрах %f дюймов", metr, inch);
                }
                break;

                case 3: {
                    yard = metr/0.9144;
                    System.out.printf("В %f метрах %f ярдов", metr, yard);
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