import java.util.Scanner;

public class HomeTaskJS10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String planet, frase;

        System.out.print("Введите название планеты ->");
        planet = input.next();

        frase = (planet.equals("земля") || planet.equals("Земля")) ? "Привет, землянин!" : "Привет, инопланетянин!";
        System.out.print(frase);
    }
}
