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


    }
}



