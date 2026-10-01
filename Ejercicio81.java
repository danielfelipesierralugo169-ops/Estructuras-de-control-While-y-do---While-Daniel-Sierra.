import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de estados: ");
        int estados = sc.nextInt();

        int ciudadesTotales = 0;
        int ciudadesNoEsperadas = 0;

        for (int e = 1; e <= estados; e++) {

            System.out.println("\n========== ESTADO "
                    + e + " ==========");

            System.out.print("Codigo del estado: ");
            int codigoEstado = sc.nextInt();

            System.out.print("Nombre del estado: ");
            String nombreEstado = sc.next();

            System.out.print("Cantidad de ciudades: ");
            int cantidadCiudades = sc.nextInt();

            int ciudadesEntre40y60 = 0;

            for (int c = 1; c <= cantidadCiudades; c++) {

                System.out.println("\n--- CIUDAD " + c + " ---");

                System.out.print("Nombre ciudad: ");
                String nombreCiudad = sc.next();

                System.out.print("Codigo ciudad: ");
                int codigoCiudad = sc.nextInt();

                System.out.print("Cantidad esperada de unidades: ");
                int esperado = sc.nextInt();

                System.out.print("Tipo de comercializacion (2,3,4): ");
                int tipo = sc.nextInt();

                System.out.print("Unidades tienda: ");
                int unidadesTienda = sc.nextInt();

                System.out.print("Unidades calle: ");
                int unidadesCalle = sc.nextInt();

                System.out.print("Cantidad vendedores tienda: ");
                int vendedoresTienda = sc.nextInt();

                System.out.print("Cantidad vendedores calle: ");
                int vendedoresCalle = sc.nextInt();

                double precioUnidad;

                if (tipo == 2) {
                    precioUnidad = 100;
                } else if (tipo == 3) {
                    precioUnidad = 150;
                } else {
                    precioUnidad = 200;
                }

                int totalUnidades =
                        unidadesTienda + unidadesCalle;

                double montoBruto =
                        totalUnidades * precioUnidad;

                double comisionTienda =
                        montoBruto * 0.10;

                double comisionCalle =
                        montoBruto * 0.15;

                int vendedorMenor;

                if (unidadesTienda < unidadesCalle) {
                    vendedorMenor = vendedoresTienda;
                } else {
                    vendedorMenor = vendedoresCalle;
                }

                double porcentajeEsperado =
                        totalUnidades * 100.0 / esperado;

                ciudadesTotales++;

                if (totalUnidades < esperado) {
                    ciudadesNoEsperadas++;
                }

                if (totalUnidades >= esperado * 1.40 &&
                    totalUnidades <= esperado * 1.60) {

                    ciudadesEntre40y60++;
                }

                System.out.println("--- RESULTADO CIUDAD ---");

                System.out.println("Codigo: " + codigoCiudad);
                System.out.println("Nombre: " + nombreCiudad);
                System.out.println("Unidades vendidas: "
                        + totalUnidades);

                System.out.println("Monto bruto: $"
                        + montoBruto);

                System.out.println("Comision vendedores tienda: $"
                        + comisionTienda);

                System.out.println("Comision vendedores calle: $"
                        + comisionCalle);

                System.out.println("Codigo vendedor con menor "
                        + "numero de unidades: "
                        + vendedorMenor);
            }

            double porcentajeCiudadesNoEsperadas =
                    ciudadesNoEsperadas * 100.0
                    / ciudadesTotales;

            System.out.println("--- RESULTADO ESTADO ---");

            System.out.println("Codigo estado: "
                    + codigoEstado);

            System.out.println("Nombre: "
                    + nombreEstado);

            System.out.println("Ciudades entre 40% y 60% "
                    + "por encima de lo esperado: "
                    + ciudadesEntre40y60);

            System.out.println("Porcentaje de ciudades que "
                    + "no alcanzaron lo esperado: "
                    + porcentajeCiudadesNoEsperadas + "%");
        }

        System.out.println("\n--- PROCESO FINALIZADO ---");
    }
}