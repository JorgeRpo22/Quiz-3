package poo.desafio.calculadora.dominio;

import javax.swing.*;
import java.util.ArrayList;

public class Calculadora {


    public static double sumar(ArrayList<Double> numeros) {
        double suma = 0;

        if (numeros.size() != 0) {
            for (double numero : numeros) {
                suma += numero;
            }
        }
        return suma;
    }

    public static double restar(ArrayList<Double> numeros) {
        double resta = 0;

        if (numeros.size() != 0) {
            resta = numeros.get(0);

            for (int i = 1; i < numeros.size(); i++) {
                resta -= numeros.get(i);
            }
        }
        return resta;
    }

    public static double multiplicar(ArrayList<Double> numeros) {
        double producto = 1;

        if (numeros.size() != 0) {
            for (double numero : numeros) {

                producto *= numero;
            }
        }
        return producto;
    }

//    public static double dividir(double num1, double num2) {
//        double cociente = 0;
//
//        if(num2 != 0) {
//            cociente = num1 / num2;
//        } else {
//            //System.out.println("Math ERROR");
//            String dato = "Math ERROR";
//            JOptionPane.showMessageDialog(null, dato, "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
//        }
//        return cociente;
//    }

    public static double dividir(ArrayList<Double> numeros) {
        double cont = 1;
        double resultado = 1;

        for (double num : numeros) {
            if (cont == 1) {
                if (num == 0) {
                    String dato = "Math ERROR";
                    JOptionPane.showMessageDialog(null, dato, "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
                }
                resultado = num;
                cont++;
            } else {
                if (num == 0) {
                    String dato = "Math ERROR";
                    JOptionPane.showMessageDialog(null, dato, "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
                }
                resultado = resultado / num;
                cont++;
            }
        }
        return resultado;
    }
}
