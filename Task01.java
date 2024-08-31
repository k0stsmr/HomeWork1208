import java.util.Scanner;

public class Task01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numb;

        System.out.print("Введите число -> ");
        numb = input.nextInt();

        if (numb % 2 == 0)
            System.out.printf("Число %d - чётное%n", numb);
        else
            System.out.printf("Число %d - нечётное%n", numb);
    }
}