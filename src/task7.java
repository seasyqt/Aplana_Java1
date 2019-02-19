import java.util.Scanner;

public class task7

{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int X = 10;
        int Y = 4;
        int Z = 7;
        System.out.println("Введите число : ");
        int T = scan.nextInt();
        if(T!=X && T!=Y && T!=Z){
            System.out.println("Такой константы нет!");
        }
        else {
            System.out.println("Данное значение имеется в константах");
        }



    }


}