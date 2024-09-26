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
                                Ejercicio3.main(args);
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