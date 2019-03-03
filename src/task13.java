import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку :");
            String num1 = scan.nextLine();
        System.out.println("Введите вторую строку :");
            String num2 = scan.nextLine();
            if (num1.equals(num2)){
                System.out.println("Две строки равны");
            }
            else {
                if (num1.length() == num2.length()){
                    System.out.println("Кол-во символов в строке равны");
                }
                else if (num1.length() > num2.length()) {
                    System.out.println("Строка : " + num1 + " длинее");
                } else {
                    System.out.println("Строка : " + num2 + " длинее");
                }
            }

    }

}
