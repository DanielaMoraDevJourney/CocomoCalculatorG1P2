public class CocomoCalculator {
    public static void main(String[] args) {
        // Constantes COCOMO para proyectos semi-desarrollados
        double a = 3.0; // Constante de esfuerzo
        double b = 1.12; // Exponente de escala
        int sloc = 5088; // SLOC estimados

        // Cálculo del esfuerzo
        double esfuerzo = a * Math.pow(sloc, b);

        System.out.printf("Esfuerzo estimado: %.2f persona-mes\n", esfuerzo);
    }
}
