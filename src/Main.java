import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Виберіть завдання:"+"\n"+"First task -> 1"+"\n"+"Secont task -> 2"+"\n"+
                "Third task -> 3"+"\n"+"Fourth task -> 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть вaш вибір: ");
        int tasks = scanner.nextInt();
       System.out.println("\n");
        Firsttask first = new Firsttask();
        SecondTask second = new SecondTask();
        Thirdtask third = new Thirdtask();

        Fourthtask fourth = new Fourthtask();
switch (tasks){
    case 1: first.FirstTask();break;
    case 2: second.SecTask();break;
    case 3: third.thirdtask();break;
    case 4: fourth.fourthtask();break;
}

    }
}
