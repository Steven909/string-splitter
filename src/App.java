public class App {

    public static void main(String[] args) {

        //Program that slits and prints a strting into individual charcaters. An upgrade reads a string from text file and splits indudual characters
        String word = "Expensive";
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }


    }
}
