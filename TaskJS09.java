import java.util.Scanner;

public class HomeTaskJS09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        String answer;

        System.out.println("Введите число ->");
        a = input.nextInt();
        answer = (a % 5 == 0) ? "Оно кратно 5" : "Оно некратно 5";
        System.out.print(answer);
    }
}
