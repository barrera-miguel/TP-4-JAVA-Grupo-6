import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);

        //Pedimos por pantalla la dimension del primer array para filas y coumnas
        System.out.println("Ingrese el valor de X (Filas primer array): ");
        int x = sc.nextInt();
        System.out.println("Ingrese el valor de Y (Columnas primer array): ");
        int y = sc.nextInt();

        //Creamos el primer array tamaño [x][y]
        int[][] primer_array = new int[x][y];
        System.out.println("Introduce los valores del primer array [x] [y] ");

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.println("Primer array [" + i + "][" + j + "]");
                primer_array[i][j] = sc.nextInt();
            }
        }

        //Creamos el segundo array tamaño [y][x]
        int[][] segundo_array = new int[y][x];
        System.out.println("Introduce los valores del segundo array [y] [x] ");

        for (i = 0; i < y; i++) {
            for (j = 0; j < x; j++) {
                System.out.println("Segundo array [" + i + "][" + j + "]");
                segundo_array[i][j] = sc.nextInt();
            }
        }
        // Creamos un tercer array de tamaño [X,Y] que será el resultante de multiplicar cada una de las
        // posiciones de las filas del array uno por
        // cada una de las posiciones de las columnas del array 2

        int[][] resultado = new int[x][y];
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                resultado[i][j] = primer_array[i][j] * segundo_array[j][i];
            }
        }

        //Mostramos por pantalla el primer array
        System.out.println("RESULTADO PRIMER ARRAY");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.print(primer_array[i][j] + "\t");
            }
            System.out.println();
        }
        //Mostramos por pantalla el segundo array
        System.out.println("RESULTADO SEGUNDO ARRAY");
        for (i = 0; i < y; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(segundo_array[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostramos por pantalla el resultado de la multiplicacion
        System.out.println("RESULTADO DE LA MULTIPLICACION");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}