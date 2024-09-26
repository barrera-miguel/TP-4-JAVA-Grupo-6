import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h;
        int k;
        System.out.println("Ingrese un valor entero mayor o igual a 3");
        int X = scanner.nextInt();
        if (X >= 3 && X <= 10) {
            int[][] arrayCase3 = new int[X][X];
            System.out.println("Ingrese los valores del array");
            for ( h = 0; h < X; h++) {
                for ( k = 0; k < X; k++) {
                    System.out.println("Elemento [" + h + "][" + k + "]: ");
                    arrayCase3[h][k]= scanner.nextInt();
                }
            }
            System.out.println("Array ingresado:");
            for (h = 0; h <X; h++) {
                for (k = 0; k <X; k++) {
                    System.out.print(arrayCase3[h][k] + "\t");
                }
                System.out.println(); //esto es una nueva línea para cada fila
            }

            int[] sumaColumnas = new int[X];
            //para sumar los valores de cada columna:
            for ( h = 0; h <X; h++) {
                int suma = 0;
                for (k = 0; k<arrayCase3.length; k++) {
                    suma += arrayCase3[k][h];
                }
                sumaColumnas[h] = suma; //asignamos la suma al nuevo array
            }
            System.out.println("Suma de cada columna:");
            for (k = 0; k < X; k++) {
                System.out.println("Columna " + k + ": " + sumaColumnas[k]);
            }
            int sumaTotal = 0;
            for (int i = 0; i < sumaColumnas.length; i++) {
                sumaTotal += sumaColumnas[i];
            }
            System.out.println("Suma total de todas las columnas: " + sumaTotal);

        } else {
            System.out.println("El número ingresado no cumple con el parámetro, intente nuevamente");
        }
    }
}