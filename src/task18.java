import java.io.*;

public class task18{


    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            int lineCountReader = 0;
            String s,b;
            System.out.println("Данные из файла :\n");
  while ((s=reader.readLine()) !=null){
    lineCountReader++;
    System.out.println(s);

}
int lineCountWriter =0;
reader.close();
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("test.txt",false))) {
            System.out.println("\nВведите текст для записи в файл: \n");
            while (lineCountReader>lineCountWriter){
               b = read.readLine();

               b+="\r\n";
               fileWriter.write(b);
                lineCountWriter++;
            }
            }

            System.out.println("\nФайл успешно записан");
        }

        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}