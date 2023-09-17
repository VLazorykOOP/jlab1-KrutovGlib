import java.util.Scanner;

public class Fourthtask {
    public void fourthtask() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть текст:");
        String inputtext = scan.nextLine();

        String[] words = inputtext.split("[\\s.,;!?]+");//розділ тексту на окремі слова

        int maxlengh = 0;

        for (String word : words) {
            if (word.length() > maxlengh) {
                maxlengh = word.length();
            }
        }
        for (String word : words) {
            if (word.length() != maxlengh) {
                System.out.print(word + " ");
            }

        }
    }
}
