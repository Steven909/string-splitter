import java.io.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        try {
            File myObj = new File("C:\\Users\\steve\\OneDrive - MMU\\Desktop\\file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                for (int i = 0; i < data.length(); i++) {
                    System.out.println(data.charAt(i));

                }
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}



