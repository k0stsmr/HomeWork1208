import java.util.Scanner;

public class TaskJS05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("Введите координату X -> ");
        x = input.nextInt();
        System.out.print("Введите координату Y -> ");
        y = input.nextInt();

        if (x==0 && y>0) System.out.printf("Точка в 1 и 2 четвертях%n");
        if (x==0 && y<0) System.out.printf("Точка в 3 и 4 четвертях%n");
        if (x>0 && y==0) System.out.printf("Точка в 1 и 4 четвертях%n");
        if (x<0 && y==0) System.out.printf("Точка во 2 и 3 четвертях%n");
        if (x>0 && y>0) System.out.printf("Точка в 1 четвери%n");
        if (x>0 && y<0) System.out.printf("Точка в 4 четверти%n");
        if (x<0 && y>0) System.out.printf("Точка во 2 четверти%n");
        if (x<0 && y<0) System.out.printf("Точка в 3 четверти%n");
        if (x==0 && y==0) System.out.printf("Точка во всех четвертях (в начале координат)%n");
    }
}