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
            mass[i] = 2*scan.nextInt();

        }

        System.out.println("Массив получен : " + Arrays.toString(mass));

    }
}