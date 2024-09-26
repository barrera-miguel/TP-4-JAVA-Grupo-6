import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int[][] matriz;

        // Crear matriz

        while (true) {
            System.out.println("Ingrese un valor entero mayor o igual que 4 y menor o igual que 10:");
            X = sc.nextInt();
            if (X < 4 || X > 10) {
                System.out.println("Valor fuera de rango");
            } else {
                matriz = new int[X][X];
                System.out.println("--------------------------------------------------------");
                System.out.println("Se ha creado una matriz de tamaño [" + X + "," + X + "]");
                break;
            }
        }

        // Menú de opciones

        int num;
        boolean log = true;
        boolean matrizVacia = true;
        while (log) {
            System.out.println("--------------------------------------------------------\n-Ingrese una opción-");
            System.out.println("1 / Rellenar la matriz");
            System.out.println("2 / Sumar valores de una fila");
            System.out.println("3 / Sumar valores de una columna");
            System.out.println("4 / Sumar la diagonal principal");
            System.out.println("5 / Sumar la diagonal inversa");
            System.out.println("6 / Calcular la media de todos los valores de la matriz");
            System.out.println("0 / Salir");
            System.out.println("--------------------------------------------------------");
            num = sc.nextInt();

            switch (num) {
                case 1:

                    // Rellenar matriz

                    System.out.println("Ingrese los valores de la matriz");
                    for (int i = 0; i < X; i++) {
                        for (int j = 0; j < X; j++) {
                            System.out.println("Valor [" + i + "][" + j + "]: ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }
                    matrizVacia = false;
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Se ha rellenado la matriz");

                    // Mostrar matriz

                    System.out.println("--------------------------------------------------------");
                    System.out.println("Matriz ingresada:");
                    for (int i = 0; i < X; i++) {
                        for (int j = 0; j < X; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    if (matrizVacia) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("ERROR - Primero debe rellenar la matriz");
                    } else {

                        // Sumar valores de una fila

                        int fila;
                        while (true) {
                            System.out.println("Ingrese fila a sumar (0 a " + (X - 1) + ")");
                            fila = sc.nextInt();
                            if (fila < 0 || fila >= X) {
                                System.out.println("ERROR - Valor fuera de rango - Vuelva a intentar");
                            } else {
                                break;
                            }
                        }

                        int sumaFila = 0;
                        for (int j = 0; j < X; j++) {
                            sumaFila += matriz[fila][j];
                        }
                        System.out.println("La suma de los valores de la fila " + fila + " es " + sumaFila);
                    }
                    break;
                case 3:
                    if (matrizVacia) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("ERROR - Primero debe rellenar la matriz");
                    } else {

                        // Sumar valores de una columna

                        int columna;
                        while (true) {
                            System.out.println("Ingrese columna a sumar (0 a " + (X - 1) + ")");
                            columna = sc.nextInt();
                            if (columna < 0 || columna >= X) {
                                System.out.println("ERROR - Valor fuera de rango - Vuelva a intentar");
                            } else {
                                break;
                            }
                        }

                        int sumaColumna = 0;
                        for (int i = 0; i < X; i++) {
                            sumaColumna += matriz[i][columna];
                        }
                        System.out.println("La suma de los valores de la columna " + columna + " es " + sumaColumna);
                    }
                    break;
                case 4:
                    if (matrizVacia) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("ERROR - Primero debe rellenar la matriz");
                    } else {

                        // Sumar diagonal principal

                        int sumaDiagonalPrincipal = 0;
                        for (int i = 0; i < X; i++) {
                            sumaDiagonalPrincipal += matriz[i][i];
                        }
                        System.out.println("La suma de la diagonal principal es " + sumaDiagonalPrincipal);
                    }
                    break;
                case 5:
                    if (matrizVacia) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("ERROR - Primero debe rellenar la matriz");
                    } else {

                        // Sumar la diagonal inversa

                        int sumaDiagonalInversa = 0;
                        for (int i = 0; i < X; i++) {
                            sumaDiagonalInversa += matriz[i][X - 1 - i];
                        }
                        System.out.println("La suma de la diagonal inversa es " + sumaDiagonalInversa);
                    }
                    break;
                case 6:
                    if (matrizVacia) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("ERROR - Primero debe rellenar la matriz");
                    } else {

                        // Calcular la media de todos los valores de la matriz

                        int sumaMatriz = 0;
                        int cantidadValores = X * X;
                        for (int i = 0; i < X; i++) {
                            for (int j = 0; j < X; j++) {
                                sumaMatriz += matriz[i][j];
                            }
                        }
                        double mediaMatriz = (double) sumaMatriz / cantidadValores;
                        System.out.println("La media de la matriz es " + mediaMatriz);
                    }
                    break;
                case 0:

                    // Salir

                    log = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ERROR - Valor fuera de rango - Vuelva a intentar");
            }
        }
    }
}