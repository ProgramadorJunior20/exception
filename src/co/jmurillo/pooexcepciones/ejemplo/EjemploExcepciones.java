package co.jmurillo.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args){

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero Numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero Denominador: ");

        int divisor;
        double division;

        try {
            //divisor = Integer.parseInt(valor);
            //division = cal.dividir(10,  divisor);
            //System.out.println(division);

            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);

        }catch (NumberFormatException nfe){
            System.out.println("Se detecto una excepción: ingrese un valor numerico: " + nfe.getMessage());
            main(args);
        }catch (FormatoNumeroException fe){
            System.out.println("Se detecto una excepción: ingrese un valor numerico: " + fe.getMessage());
        }
        catch (DivisionPorZeroException de){
            System.out.println("Capturamos el excepcion en tiempo de ejecución: " + de.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin exception!");
        }
        System.out.println("Seguimos con el flujo de nuestra aplicación!!!!");
    }
}
