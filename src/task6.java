import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Введите 3 числа : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        int result = (a+b+c)/3;
        int sresult = result/2;

        System.out.println("Среднее арифметическое число " + result);
        System.out.println("Деление " + result + " на 2 : " + sresult);

        if (sresult >3){
            System.out.println("Программа выполнена корректно");
        }
    }



}
