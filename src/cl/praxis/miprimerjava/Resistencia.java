package cl.praxis.miprimerjava;

import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float resistencia1;
        float resistencia2;
        float resistencia3;
        float resistenciaT;

        System.out.println("Ingrese resistencia 1");
        resistencia1 = sc.nextInt();
        System.out.println("Ingrese resistencia 2");
        resistencia2 = sc.nextInt();
        System.out.println("Ingrese resistencia 3");
        resistencia3 = sc.nextInt();
        resistenciaT =(1/((1/resistencia1)+(1/resistencia2)+(1/resistencia3)));

        if (resistencia1 <= 0 || resistencia2 <= 0 || resistencia3 <= 0 ) {
            System.out.println("ingrese solo valores positivos");
        }
        else {
            System.out.println("La resistencia total es de " + resistenciaT);
        }

    }
}
