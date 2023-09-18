import java.util.Scanner;

public class Firsttask {
    public void calculateDD(){//double+double
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть а : ");
        double a = scan.nextDouble();
        System.out.print("Введіть в : ");
        double b = scan.nextDouble();
        double result = (1.0/((a*(b*b)-(2.0*b)))) + (1.0/(3.0*(a*a)+2.0))*b;
        System.out.print("Результат: "+ result);
    }

    public void calculateID(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть а: ");
        int a = scan.nextInt();
        System.out.print("Введіть b: ");
        int b = scan.nextInt();
        double rez = (1.0/((a*(b*b)-(2.0*b))))+(1.0/(3.0*(a*a)+2.0))*b;
        System.out.print("Результат :"+(double) rez);
    }
    public void calculateDI(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть а: ");
        double a = scan.nextDouble();
        System.out.print("Введіть b: ");
        double b = scan.nextDouble();
         double rez = (1.0/((a*(b*b)-(2.0*b))))+(1.0/(3.0*(a*a)+2.0))*b;
        System.out.print("Результат :"+ (int)rez);
    }
    public void FirstTask(){
        System.out.println("Виберіть спосіб обчислення:"+"\n"+"1. Ввід дійсний, результат - дійсний"+"\n"+
                "2. Ввід цілий, результат - дійсний"+"\n"+"3. Ввід дійсний, результат - цілий");
        System.out.print("Ваш вибір: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch (input){
            case 1: calculateDD();break;
            case 2: calculateID();break;
            case 3: calculateDI();break;
        }

    }
}

