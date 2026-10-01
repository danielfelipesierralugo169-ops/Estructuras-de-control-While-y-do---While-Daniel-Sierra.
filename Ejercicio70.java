import java.util.Scanner;

public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dias = 0;
        int errores = 0;
        int totalTemperaturas = 0;

        double sumaMaximas = 0;
        double sumaMinimas = 0;

        while (true) {

            System.out.print("Temperatura maxima (0 para terminar): ");
            double max = sc.nextDouble();

            System.out.print("Temperatura minima (0 para terminar): ");
            double min = sc.nextDouble();

            if (max == 0 && min == 0) {
                break;
            }

            dias++;

            sumaMaximas += max;
            sumaMinimas += min;

            totalTemperaturas += 2;

            if (max < 14 || max > 30) {
                errores++;
            }

            if (min < 14 || min > 30) {
                errores++;
            }
        }

        if (dias > 0) {

            double promedioMaxima = sumaMaximas / dias;
            double promedioMinima = sumaMinimas / dias;

            double porcentajeErrores =
                    errores * 100.0 / totalTemperaturas;

            System.out.println("--- RESULTADOS ---");
            System.out.println("Numero de dias: " + dias);
            System.out.println("Promedio temperatura maxima: "
                    + promedioMaxima);
            System.out.println("Promedio temperatura minima: "
                    + promedioMinima);
            System.out.println("Numero de errores: " + errores);
            System.out.println("Porcentaje de errores: "
                    + porcentajeErrores + "%");

        } else {
            System.out.println("No se ingresaron temperaturas.");
        }
    }
}