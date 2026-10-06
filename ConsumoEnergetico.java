import java.util.Scanner;

public class ConsumoEnergetico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lunes, martes, miercoles, jueves, viernes;
        double promedio;
        String clasificacion;

        double promedioAnterior;
        double porcentaje;
        String clasificacionCambio;

        System.out.println("===REGISTRO DE CONSUMO SEMANAL ACTUAL");

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

        System.out.println("===COMPARATIVA CON PERIODO ANTEIOR===");
        System.out.println("Ingrese el promedio anterior para comparar");
        promedioAnterior = teclado.nextDouble();

        porcentaje = ((promedio - promedioAnterior) / promedioAnterior) * 100;

        if (porcentaje < 0) {
            clasificacionCambio = "El consumo disminuyó";
        } else if (porcentaje <= 10) {
            clasificacionCambio = "El consumo aumentó ligeramente";
        } else if (porcentaje <= 25) {
            clasificacionCambio = "El consumo aumentó considerablemente";
        } else {
            clasificacionCambio = "Aumento elevado del consumo";
        }

        System.out.println("============================================");
        System.out.println("==========ANALIZADOR DE CONSUMO=============");
        System.out.println("============================================");
        System.out.println("Promedio del consumo: " + promedio);
        System.out.println("Nivel: " + clasificacion);
        System.out.println("Promedio Anterior: " + promedioAnterior);
        System.out.println("Promedio Actual: " + promedio);
        System.out.println("Variacion: " + porcentaje);
        System.out.println("=====RESULTADO=====");
        System.out.println(clasificacionCambio);
      
        teclado.close();
    }
}