import java.util.Scanner;

public class Thirdtask {
    public void thirdtask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір матриці: ");
        int n = scanner.nextInt();
        double[][]A = new double[n][n];
        double[]B = new double[n];
        System.out.println("Введіть елементи матриці:");
        for(int i = 0 ; i<n;i++){
            for (int j = 0;j<n;j++){
                A[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            double rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += A[i][j];
            }
            B[i] = rowSum / n; // Середнє арифметичне для рядка
        }

        // Виведення вектора B
        System.out.println("Вектор B:");
        for (int i = 0; i < n; i++) {
            System.out.println(B[i]);
        }

    }
}
