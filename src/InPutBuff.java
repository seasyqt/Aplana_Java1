import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InPutBuff {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число в бинарном коде : ");

        String bin = reader.readLine();

        int sBin = Integer.parseInt(bin,2);

        System.out.println("Переобразованно в это : " + sBin);
    }



}

