package com.cursoceat.calculadora;

public class Calculadora {
	
	private int numero1;
	private int numero2;
	
	// constructor
	public Calculadora() {
	}

	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// metodos get y set
	
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	
	// operaciones
	
	public int Suma(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

	public int Resta(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}

	public int Multiplicacion(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	
	public double Division(int num1, int num2) {
		int resultado = num1 / num2;
		return resultado;
	}
	
	public double Radicacion(int num1, int num2) {
		double x = num1 , z = num2; // convierto el tipo de dato int a double
		
		double	resul = Math.pow(x, (1/z));
		return resul;
	}
	
	public int Modulacion(int num1, int num2) {
		int resultado = num1 % num2;
		return resultado;
	}
	
	public int Potenciacion(int num1, int num2) {
		double x= num1 , z = num2;  // convierto el tipo de dato int a double
		double resultado = Math.pow(x, z) ;
		return (int)resultado;
	}
}
