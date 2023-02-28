package iu;

import java.util.Scanner;

import com.cursoceat.calculadora.Calculadora;

public class MenuPrincipal extends Calculadora{
	
	static Scanner sc = new Scanner(System.in);
	static Calculadora micalculo = new Calculadora();
	static int num1, num2;
	static double resultado;
	
	static public void Menu() {
		
		int opcion;
		do {
			MenuCalculadora();
			opcion = getOpcion();
			switch (opcion)
			{
				case 1 ->
				{
					datos(opcion);
					resultado = micalculo.Suma(num1, num2);
					System.out.println("La Suma Es :" +(int)resultado );
				}
				case 2 ->
				{
					datos(opcion);
					resultado = micalculo.Resta(num1, num2);
					System.out.println("La Resta Es :" + (int)resultado );
				}
				case 3 ->
				{
					datos(opcion);
					resultado = micalculo.Multiplicacion(num1, num2);
					System.out.println("La Multiplicacion Es :" + (int)resultado );
				}
				case 4 ->
				{
					datos(opcion);
					resultado = micalculo.Division(num1, num2);
					System.out.printf("La Division Es : %.2f\n" , resultado );
				}
				case 5 ->
				{
					datos(opcion);
					resultado = micalculo.Radicacion(num1, num2);
					System.out.printf("La Raiz Es : %.2f\n" , resultado );
				}
				case 6 ->
				{
					datos(opcion);
					resultado = micalculo.Modulacion(num1, num2);
					System.out.printf("El Módulo De La Division Es : %.2f\n" , resultado );
				}
				case 7 ->
				{
					datos(opcion);
					resultado = micalculo.Potenciacion(num1, num2);
					System.out.println("La Resultado Es :" + (int)resultado );
				}
					
				case 8 -> System.out.print("...Fin De Programa...");
				default -> System.out.println("Eleccion Errada");
						
			}
			
			if(opcion == 8)
				break;
		} while (opcion > 0 || opcion < 9);
	}

	static void MenuCalculadora() {
		System.out.println("-------------------------");
		System.out.println("        Calculadora      ");
		System.out.println("-------------------------");
		System.out.println("1. Suma                  ");
		System.out.println("2. Resta                 ");
		System.out.println("3. Multiplicacion        ");
		System.out.println("4. Division              ");
		System.out.println("5. Radicacion            ");
		System.out.println("6. Modulacion            ");
		System.out.println("7. Potenciacion          ");
		System.out.println("8. Salida.               ");
		System.out.println("-------------------------");
	}
	
	
	static int getOpcion()
	  {
		int num;
		System.out.println("Ingrese Opcion :");
		if(sc.hasNextInt())
			num = sc.nextInt();
		else 
		  {
			System.out.println("Error... Vuelva a Intentarlo");
			sc.next();
			num = getOpcion();
		  }
		return num;
	 }
	
	static void datos(int opc)
	{
		
		if(opc == 1 || opc == 2 || opc == 3 || opc == 4 || opc == 6)
		{
			System.out.println("Ingrese Numero 1 :");
			num1 = sc.nextInt();
			micalculo.setNumero1(num1);
			System.out.println("Ingrese Numero 2 :");
			num2 = sc.nextInt();
			micalculo.setNumero2(num2);
		}
		if(opc == 5)
		  {
			System.out.println("Recuerde el numero debe ser positivo");
			System.out.println("Mayor que 0 y la raiz debe ser mayor que cero\n\n");
			
			System.out.println("Ingrese Numero :");
			num1 = sc.nextInt();
			System.out.print("Ingrese Numero De Raiz :");
			num2 = sc.nextInt();
		  }
		if(opc == 7)
		 {
			System.out.print("Ingrese 1º Valor :");
			num1 = sc.nextInt();
			System.out.print("Ingrese Numero De Exponente :");
			num2 = sc.nextInt();
		 }
	}
	
	
}
