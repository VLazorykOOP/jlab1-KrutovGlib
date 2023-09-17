import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Виберіть завдання:"+"\n"+"First task -> 1"+"\n"+"Secont task -> 2"+"\n"+
                "Third task -> 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть вaш вибір: ");
        int tasks = scanner.nextInt();
        System.out.println("\n");
        Firsttask first = new Firsttask();
        SecondTask second = new SecondTask();
        Thirdtask third = new Thirdtask();

switch (tasks){
    case 1: first.FirstTask();
    case 2: second.SecTask();
    case 3: third.thirdtask();
}

    }
}
