import java.util.Arrays;
import java.util.Scanner;

public class task9
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве : ");
        int numMass = scan.nextInt();
        int mass[] = new int [numMass];
        System.out.println("Введите в массив числа");
        for (int i = 0; i < mass.length ; i++) {
            mass[i] = scan.nextInt();

        }

        System.out.println("Массив получен : " );
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]*2 + " ");

        }

    }
}