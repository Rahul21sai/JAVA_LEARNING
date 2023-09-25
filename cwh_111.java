import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111 {
    public static void main(String[] args) throws FileNotFoundException {
        // code to create a file
//        File myFile = new File("cwh111file.txt");
//        try{
//            myFile.createNewFile();
//
//        }catch(IOException e){
//            System.out.println("unable to create this new file");
//            e.printStackTrace();
//
//        }
        // code to write a file
//        try {
//            FileWriter fileWriter = new FileWriter("cwh111file.txt");
//            fileWriter.write("this is our first file from this java course\n okay now bye");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//          reading a file
//        File myFile = new File("cwh111file.txt");
//        try{
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
// deleting a file
        File myFile = new File ("cwh111file.txt");
        if (myFile.delete()){
            System.out.println("i have deleted:"+
            myFile.getName());

        }else {
            System.out.println(" some problem occured while deleting the file");
        }
    }
}
