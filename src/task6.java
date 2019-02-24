import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        System.out.println("Введите 3 числа : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        double result = (a+b+c)/3; //Либо можно было оставить объявление переменных с int , а тут переопределить 
        int sresult = (int)result/2;

        System.out.println("Среднее арифметическое число " + result);
        System.out.println("Деление " + result + " на 2 : " + sresult);

        if (sresult >3){
            System.out.println("Программа выполнена корректно");
        }
    }



}
