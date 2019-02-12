import java.util.Scanner;

public class InPut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинарном коде : ");
        String s = scan.nextLine();
int Num = Integer.parseInt(s,2);
        System.out.println("Переобразованно в это : " + Num);



    }
}
