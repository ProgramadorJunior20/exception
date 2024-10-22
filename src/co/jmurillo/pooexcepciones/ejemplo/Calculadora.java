package co.jmurillo.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir (int numerador, int divisor) throws DivisionPorZeroException{
        if (divisor == 0){
            throw new DivisionPorZeroException("Estas Dividiendo Po Zero");
        }
        return numerador / (double) divisor;
    }

    public double dividir (String numerador, String divisor) throws DivisionPorZeroException,
            FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return dividir(num, div);
        }catch (NumberFormatException e){
            throw new FormatoNumeroException("Debe ingresar un número en el numerador o divisor!!");
        }
    }
}
