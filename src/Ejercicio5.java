import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean key = false;
        String suma = "0";
        String[][] mercado = {
                {"KitKat","32","10"},
                {"Chicles","2","50"},
                {"Caramelos de Menta","2","50"},
                {"Huevo Kinder","25","10"},
                {"Chetoos","30","10"},
                {"Twix","26","10"},
                {"M&M'S","35","10"},
                {"Papas Lays","40","20"},
                {"Milkybar","30","10"},
                {"Alfajor Tofi","20","15"},
                {"Lata Coca","50","20"},
                {"Chitos","45","10"},
        };
        do {
            System.out.println("--------MAQUINA EXPENDEDORA DE GOLOSINAS---------");
            System.out.println("Ingresa:\n 1- Mostrar Golosinas  \n 2- Pedir golosinas \n 3- Rellenar Golosinas \n 4- Apagar Maquina");
            int pos = sc.nextInt();
            if (pos>= 1 && pos<=4) {
                switch(pos) {
                    case 1:
                        System.out.println("----------GOLOSINAS----------");
                        for(int i = 0; i < mercado.length; i++) {
                            for(int j = 0; j < 1; j++) {
                                System.out.print(i +"- "+ mercado[i][0]+" -- ");
                                System.out.print(" "+"$"+mercado[i][1]+" -- ");
                                System.out.println(" "+"Stock: "+mercado[i][2] + " ");
                            }
                        }
                        System.out.println("-----------------------------");
                        break;
                    case 2:
                        System.out.println("Seleccione la posición de la golosina que desea:");
                        pos = sc.nextInt();
                        if (pos>=0 && pos<=11){
                            suma = FuncionesEjercicio5.apagado(mercado,pos,suma);
                            mercado[pos][2]= FuncionesEjercicio5.RestarStock(mercado,pos);
                            System.out.println("Compró: "+ mercado[pos][0]);
                        }else {
                            System.out.println("Error - Número fuera de rango");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese la contraseña para apagar la máquina:");
                        String contraseña = sc.next();
                        if (contraseña.equals("AdminXYZ")){
                            System.out.println("Seleccione el producto que desea cargar stock:");
                            pos = sc.nextInt();
                            mercado[pos][2]= FuncionesEjercicio5.SumarStock(mercado,pos);

                        }else {
                            System.out.println("ERROR - Contraseña incorrecta");
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese la contraseña para apagar la máquina:");
                        contraseña = sc.next();
                        if (contraseña.equals("AdminXYZ")){
                            System.out.println("El dinero total recaudado es de: $"+suma);
                            System.out.println("-----Máquina apagada-----");

                            key = true;
                        }else {
                            System.out.println("Contraseña incorrecta");
                        }
                }
            }else {
                System.out.println("Error - Número fuera de rango");
            }
        }while(key == false);
    }
}