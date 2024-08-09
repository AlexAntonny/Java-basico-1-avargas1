
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cal=0;
        System.out.print(" Ingrese Calificación:");
        Scanner scanner1= new Scanner(System.in);
        cal= scanner1.nextInt();
        System.out.println(cal);


        switch (( cal >= 1 && cal <=2) ? 0 : (cal > 2 && cal <= 4) ? 1 : (cal >4 && cal <= 6) ? 2 : (cal >6 && cal <= 8) ? 3 : (cal >8 && cal <= 10) ? 4 : 5) {

            case 0: System.out.println("Su Calificación es: F");
                break;
            case 1: System.out.println("Su Calificación es: D");
                break;
            case 2: System.out.println("Su Calificación es: C");
                break;
            case 3: System.out.println("Su Calificación es: B");
                break;
            case 4: System.out.println("Su Calificación es: A");
                break;
            case 5: System.out.println("Número no válido, por favor verifique");
                break;
        }
    }
}