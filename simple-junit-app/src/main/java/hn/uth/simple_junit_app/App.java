package hn.uth.simple_junit_app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public double sumar(double numero1, double numero2) {
		return numero1 + numero2;
	}

	public double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	public double restar(double numero1, double numero2) {
		return numero1 - numero2;
	}

	public Double dividir(double dividendo, double divisor) {
		Double resultado;
		if(divisor == 0) {
			resultado = null;
		}else {
			resultado = dividendo / divisor;
		}
		
		return resultado;
	}
}
