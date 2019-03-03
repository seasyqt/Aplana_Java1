import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое сочетание слов с пробелами: ");
        String str = scan.nextLine();
        System.out.println("Ваш текст теперь без пробелов : ");
        String replStr = str.replace(" ", "");
        System.out.println(replStr);

    }
}
