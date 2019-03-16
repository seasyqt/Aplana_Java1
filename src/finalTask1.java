import java.io.*;

public class finalTask1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в двоичной системе : ");
        String stringBin = reader.readLine();

        int massive[] = new int[stringBin.length()];
        for(int i=0;i<stringBin.length();i++){
            massive[i] = Character.digit(stringBin.charAt(i), 10);
        }
int result = 0;
        int a = stringBin.length();
       for (int i = 0; i < stringBin.length() ; i++,a--) {
            result += ((massive[i])* (Math.pow(2,(a-1))));
       }
        System.out.println("В 10-ной системе счисления получается : "+result);
    }
}
