import java.util.Scanner;

public class ConsumoEnergetico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lunes, martes, miercoles, jueves, viernes;
        double promedio;
        String clasificacion;

        System.out.println("Ingrese el consumo del Lunes: ");
        lunes = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Martes: ");
        martes = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Miércoles: ");
        miercoles = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Jueves: ");
        jueves = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Viernes: ");
        viernes = teclado.nextDouble();

        promedio = (lunes + martes + miercoles + jueves + viernes) / 5;
        if (promedio < 8) {
            clasificacion = "Consumo bajo";
        } else if (promedio <= 12) {
            clasificacion = "Consumo normal";
        } else if (promedio <= 16) {
            clasificacion = "Consumo alto";
        } else {
            clasificacion = "Consumo crítico";
        }

        System.out.println("=====RESULTADOS=====");
        System.out.println("El promedio de consumo es: " + promedio);
        System.out.println("Clasificación obtenida: " + clasificacion);

        teclado.close();
    }
}