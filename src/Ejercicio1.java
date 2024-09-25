import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] ciudadesPorPais = new String[4][4];
        System.out.println("Ingrese cuatro países y tres ciudades de cada país:");
        for (int i = 0; i < 4; i++) {
            System.out.println("PAÍS " + (i + 1) + ":");
            ciudadesPorPais[i][0] = sc.nextLine();
            for (int j = 1; j < 4; j++) {
                System.out.println("Ciudad " + j + ":");
                ciudadesPorPais[i][j] = sc.nextLine();
            }
            System.out.println();
        }
        System.out.println("Ciudades por país:");
        for (int i = 0; i < 4; i++) {
            System.out.print("País: " + ciudadesPorPais[i][0] + "\t\tCiudades:");
            for (int j = 1; j < 4; j++) {
                System.out.print( "\t" + ciudadesPorPais[i][j]);
            }
            System.out.println();
        }
    }
}