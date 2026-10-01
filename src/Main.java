import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Sumatorias Sum1 = new Sumatorias();
        Regresion Reg = new Regresion();

        System.out.println(" X ");
        System.out.println(Arrays.toString(Sum1.x));
        System.out.println(" Y ");
        System.out.println(Arrays.toString(Sum1.y));
        System.out.println();
        System.out.println(" 'Sumatorias' ");
        System.out.println(" Sumatoria de X : ");
        System.out.println(Sum1.sumarX());
        System.out.println(" Sumatoria de Y : ");
        System.out.println(Sum1.sumarY());
        System.out.println(" Sumatoria de X^2 : ");
        System.out.println(Sum1.sumarXCuadrada());
        System.out.println(" Sumatoria de X * Y : ");
        System.out.println(Sum1.sumarXPorY());
        System.out.println(" Cuantas x hay : ");
        System.out.println(Sum1.cantidadX());
        System.out.println();
        System.out.println(" Beta 1 : ");
        System.out.println("El valor de Beta 1 es: ");
        System.out.println(Reg.calcularBeta1(Sum1));
        System.out.println();
        System.out.println(" Beta 0 : ");
        System.out.println(Reg.calcularBeta0(Sum1));

        }
    }