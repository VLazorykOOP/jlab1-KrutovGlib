import java.util.Scanner;
//вилучає слова найбільшої довжини
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
        boolean firstWord = true; // Флаг для першого слова максимальної довжини

        for (String word : words) {
            if (word.length() == maxlengh) {
                if (firstWord) {
                    System.out.print("Оброблений текст: " + word);
                    firstWord = false;
                } else {
                    System.out.print(" " + word);
                }
            }
        }
    }
    }

