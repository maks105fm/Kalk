import java.util.Scanner;

public class Menu {
private Scanner sc =  new Scanner(System.in);
private Calc calc = new Calc();


    public void glavmenu(){
        int a, b;
        String z;
        System.out.println("Введите первое число: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите знак: ");
        z = sc.nextLine();

        System.out.println("Введите второе число: ");
        b = sc.nextInt();

        calc.glavcalc(a, z, b);

    }

}
