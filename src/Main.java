import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        System.out.println("----------------------------------- \n¡Bienvenido al Trabajo Práctico 4!\n-----------------------------------");
        System.out.println("Grupo: 6 \nIntegrantes: - Miguel Barrera - Emilia Barros -  Federico Frankenberger  - Guadalupe Maricchiolo - \n-----------------------------------");
        System.out.println("-Ingrese-\n1 / Continuar \n2 / Salir\n-----------------------------------");
        do {
            num = sc.nextInt();
            switch (num) {
                case 1:
                    do {
                        System.out.println("------------\n EJERCICIOS \n------------");
                        System.out.println("-Ingrese-\n-- 1 a 5 para ejercicios\n-- 6 para salir");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 1:");
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
                                        System.out.print("\t" + ciudadesPorPais[i][j]);
                                    }
                                    System.out.println();
                                }
                                break;

                            case 2:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 2:");

                                break;

                            case 3:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 3:");
                                Scanner scanner = new Scanner(System.in);
                                int h;
                                int k;
                                System.out.println("Ingrese un valor entero mayor o igual a 3");
                                int X = scanner.nextInt();
                                if (X <= 3) {
                                    System.out.println("El número ingresado no cumple con el parámetro, intente nuevamente");
                                }
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
                                        System.out.println(arrayCase3[h][k] + " ");
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
                                    sumaColumnas[h]=suma; //asignamos la suma al nuevo array
                                }
                                System.out.println("Suma de cada columna:");
                                for (k = 0; k<X; k++) {
                                    System.out.println("Columna " + k + ": " + sumaColumnas[k]);
                                }
                                int sumaTotal = 0;
                                for (int i = 0; i <sumaColumnas.length ; i++) {
                                    sumaTotal+=sumaColumnas[i];
                                }
                                System.out.println("Suma total de todas las columnas: " + sumaTotal);
                                break;

                            case 4:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 4:");

                                break;
                            case 5:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 5:");

                                break;
                            case 6:
                                System.out.println("-------------------------------------");
                                System.out.println("Gracias por su corección!");
                                System.out.println("-------------------------------------");
                                num = 2;
                                break;
                            default:
                                System.out.println("--------------------------------------------------");
                                System.out.println("ERROR - número fuera de rango - vuleva a intentar!");
                                System.out.println("--------------------------------------------------");
                        }
                    } while (num != 2);
                case 2:
                    System.out.println("--------");
                    System.out.println("Gracias!");
                    System.out.println("--------");
                    break;
                default:
                    System.out.println("- Número fuera de rango - Intente nuevamente -\n1 / Continuar \n2 / Salir");
            }
        } while (num != 2);
    }
}