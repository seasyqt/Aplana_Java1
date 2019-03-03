import java.util.Scanner;

public class task14

{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число : ");
        String s = scan.nextLine();
        int x = Integer.parseInt(s);
        double y = (double) x;
        System.out.println("Строка : " + s + "\nЦелое число : " + x + "\nДробное число : " + y);


    }

}

