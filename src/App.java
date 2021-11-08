import java.io.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word > ");

        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        scanner.close();


        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));

        }

        try {
            File myObj = new File("C:\\Users\\steve\\OneDrive - MMU\\Desktop\\file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}



