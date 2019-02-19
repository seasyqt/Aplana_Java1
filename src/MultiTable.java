import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число от 1 до 10");
        int in = scan.nextInt();
        System.out.println("Таблица умножения для числа : " +in);
        System.out.println(in + "x1=" + in);
        System.out.println(in + "x2=" + in*2);
        System.out.println(in + "x3=" + in*3);
        System.out.println(in + "x4=" + in*4);
        System.out.println(in + "x5=" + in*5);
        System.out.println(in + "x6=" + in*6);
        System.out.println(in + "x7=" + in*7);
        System.out.println(in + "x8=" + in*8);
        System.out.println(in + "x9=" + in*9);
        System.out.println(in + "x10=" + in*10);

        //System.out.println(in + "x1=" + in + " " + in*2 + " " + in*3 + " " + in*4 + " " +in*5 + " " + in*6 + " " + in*7+ " " +in*8 + " " + in*9 + " " +in*10);
    }
}
