import java.io.*;

public class task16 {
    public static void main(String[] args) {

        try
        {
          //  File file = new File("test.txt");
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String s;
            while ((s = reader.readLine()) != null){
                System.out.println(s);
            }

        }catch (IOException exc){
            System.out.println("Ошибочка вышла" + exc);
        }

    }
}
