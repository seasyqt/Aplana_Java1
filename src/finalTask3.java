import java.util.Scanner;

public class finalTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double courseRur,amountRur,resultUsd;
        System.out.println("Введите текущий курс рубля :" );
        courseRur =scanner.nextDouble();
        System.out.println("Введите сколько рублей поменять в USD : ");
        amountRur=scanner.nextDouble();
        resultUsd=amountRur/courseRur;
        System.out.format("Получилось %.4f USD",resultUsd);



    }



}
