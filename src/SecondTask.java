import java.util.Scanner;
import java.util.ArrayList;

public class SecondTask {
    public static void SecTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву A: ");
        int n = scanner.nextInt();
        if(n == 0 || n == 1){
            System.out.println("Неправильний розмір масиву.");
            return;
        }

        int[] A = new int[n];

        System.out.println("Введіть елементи масиву A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

       ArrayList<Integer> B = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j] && !B.contains(A[i])) {
                    B.add(A[i]);
                }
            }
        }


        if(B.isEmpty()){
            System.out.println("Немає однакових елементів.");
        }else {
            System.out.print("Масив В: ");
            for (int num : B) {
                System.out.print(num + " ");
            }
        }
    }
}
