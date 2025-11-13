package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int a = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int b = sc.nextInt();
        System.out.print("Que quieres hacer?(1-suma, 2-resta, 3-multiplicacion, 4-division)");
        int opcion = sc.nextInt();
        operacion(a, b, opcion);
    }
    
    public static int sumar(int a, int b){
        return a + b;
    }
    public static int restar(int a, int b){
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a*b;
    }
    public static int division(int a, int b) {
        return a/b;
    }
    
    public static void operacion(int a, int b, int operacion){
        switch(operacion){
            case 1:
                System.out.println(sumar(a, b));
                break;
            case 2:
                System.out.println(restar(a, b));
                break;
            case 3:
                System.out.println(multiplicacion(a,b));
            case 4:
                System.out.println(division(a,b));
        }
    }
}
