package presentacion;

import java.util.Scanner;

public class IOManager {

    public void print(String mensaje) {
        System.out.print(mensaje);
    }

    public void println(String mensaje) {
        System.out.println(mensaje);
    }

    public void println() {
        System.out.println();
    }

    public void print(int mensaje) {
        System.out.println(mensaje);
    }

    public void print(Double mensaje) {
        System.out.println(mensaje);
    }

    public void print(Float mensaje) {
        System.out.println(mensaje);
    }

    public int getInt() {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()) {
            this.print("Debe ingresar un entero.");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public int getInt(String message) {
        this.println(message);
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()) {
            this.print("Debe ingresar un entero.");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public int getIntRange(int min, int max) {
        int num = getInt();
        while(num < min || num > max) {
            println("El numero ingresado se encuentra fuera de rango, ingrese un numero adecuado: ");
            num = getInt();
        }
        return num;
    }

    public Double getDouble() {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextDouble()) {
            this.print("Debe ingresar un numero.");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    public String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getString(String message) {
        this.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
