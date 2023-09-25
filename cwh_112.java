import java.io.FileWriter;
import java.io.IOException;

public class cwh_112 {
    public static void main(String[] args) {
        int i = 5;
        String table = "";
        for (int j = 1; j <= 10; j++){
            table += i + "x"+(j)+"="+i*(j*1);
            table +="\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("multiplicationtable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
