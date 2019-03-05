import java.io.*;

public class task17 {
    public static void main(String[] args) {
        try {
            System.out.println("Данная программа позволяет считывать с клавиатуры текст и записывать его в файл.");
            File file = new File("test.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            System.out.println("Для того чтобы сохранить текст в файл,введите слово stop " +
                    "\nВведите текст который хотите записать : ");
            String s;
            while (!(s = reader.readLine()).equals("stop")){
                writer.write(s);
            }

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
