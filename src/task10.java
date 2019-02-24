import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во строк в массиве :");
        Scanner scan = new Scanner(System.in);
        int numStrok = scan.nextInt();
        System.out.println("Введите кол-во столбцов в массиве :");
        int numStolbec = scan.nextInt();
        
        int[][] mass = new int[numStrok][numStolbec];

        System.out.println("Введите числа : ");
        for (int i = 0; i < numStrok ; i++) {
            for (int j = 0; j < numStolbec ; j++) {
                mass[i][j] = scan.nextInt();

            }
            System.out.println();
        }
        System.out.println("Первая строка массива : ");
        for (int i = 0; i < 1 ; i++) {
            for (int j = 0; j < numStolbec; j++) {
                System.out.print((mass[i][j]*3) + " "); }
            System.out.println();
        }
    }
}
