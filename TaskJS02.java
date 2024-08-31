import java.util.Scanner;

public class TaskJS02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int old;

        System.out.print("Сколько вам лет? -> ");
        old = input.nextInt();

        if (old <= 0) System.out.print("Возраст не может быть отрицательным или 0!");
        if (old > 120) System.out.print("Слишком большой возраст");
        if (old >0 && old <= 120) System.out.printf("Вам %d лет!", old);
    }
}