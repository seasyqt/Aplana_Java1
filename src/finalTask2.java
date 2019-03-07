import java.util.Arrays;
import java.util.Scanner;

public class finalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько чисел заполнить в массиве : ");
        int j = scan.nextInt();
        int mass[] = new int[j];
        System.out.println("Запоните массив числами : ");
        for (int i = 0; i < j ; i++) {
            mass[i]=scan.nextInt();
        }
        for (int c = 0; c < mass.length; c++) {
            for (int l = c+1; l < mass.length; l++) {
                if (mass[c] > mass[l]){
                    int temp = mass[c];
                    mass[c]=mass[l];
                    mass[l]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
