import java.util.Scanner;

public class SecondTask {
public void SecTask() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть розмір масиву: ");
    int n = scanner.nextInt();
    if (n == 0 || n == 1) {
        System.out.println("Некорректний розмір!");
    }
    int[] A = new int[n];
    int[] B = new int[n];
    System.out.println("Введіть елементи масиву А:");
    for (int i = 0; i < n; i++) {
        A[i] = scanner.nextInt();
    }
    int bIndex = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (A[i] == A[j]) {
                B[bIndex] = A[i];
                bIndex++;
            }
        }
    }
    if(bIndex == 0) {System.out.println("Немає однакових елементів.");}
    else {
        System.out.println("Масив B :");
        for (int i = 0; i < bIndex; i++) {
            System.out.print(B[i] + " ");
        }
    }
        }
    }

