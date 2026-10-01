public class Regresion {

    public Regresion(){
    }

    public double calcularBeta1(Sumatorias datos) {

        double n = datos.x.length;
        double sumaX = datos.sumarX();
        double sumaY = datos.sumarY();
        double sumaXY = datos.sumarXPorY();
        double sumaX2 = datos.sumarXCuadrada();

        double numerador = (n * sumaXY) - (sumaX * sumaY);

        double denominador = (n * sumaX2) - (sumaX * sumaX);

        if (denominador == 0) {
            System.out.println("Error: El denominador es cero.");
            return 0;
        }

        return numerador / denominador;
    }

    public double calcularBeta0(Sumatorias datos) {
        double n = datos.x.length;
        double sumaX = datos.sumarX();
        double sumaY = datos.sumarY();
        double sumaXY = datos.sumarXPorY();
        double sumaX2 = datos.sumarXCuadrada();

        double numerador = (sumaY * sumaX2) - (sumaX * sumaXY);

        double denominador = (n * sumaX2) - (sumaX * sumaX);

        if (denominador == 0) {
            System.out.println("Error: El denominador es cero.");
            return 0;
        }

        return numerador / denominador;
    }
}
