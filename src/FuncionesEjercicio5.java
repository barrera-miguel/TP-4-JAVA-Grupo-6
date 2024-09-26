import java.util.Scanner;

public class FuncionesEjercicio5 {
    static Scanner sc = new Scanner(System.in);
    static String RestarStock(String mercado[][], int numero) {
        int stock = Integer.parseInt(mercado[numero][2]);
        if (stock>0){
            stock--;
            String stock2 = Integer.toString(stock);
            return stock2;
        }else {
            System.out.println("------------------------");
            System.out.println("   Producto sin Stock");
            System.out.println("Seleccione otra golosina");
            System.out.println("------------------------");
            String stock2 = Integer.toString(stock);
            return stock2;
        }


    }
    static String SumarStock(String mercado[][], int numero) {
        int stock = Integer.parseInt(mercado[numero][2]);
        System.out.println("Introdusca el nuevo stock:");
        int stock2 = sc.nextInt();
        int suma = stock+stock2;
        String resultado = Integer.toString(suma);

        return resultado;



    }
    static String apagado(String mercado[][], int numero,String suma){
        int stock = Integer.parseInt(mercado[numero][2]);
        if(stock>0){
            int precio = Integer.parseInt(mercado[numero][1]);
            int sumado = Integer.parseInt(suma);
            sumado = sumado + precio;
            String total = Integer.toString(sumado);
            return total;
        }else {
            int precio = Integer.parseInt(suma);
            String total = Integer.toString(precio);
            return total;
        }
    }
}