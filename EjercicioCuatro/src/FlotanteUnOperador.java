//Verdadero o falso: Las sentencias IF/ELSE se pueden sustituir siempre con sentencias SWITCH.

//FALSO por que  las sentencias if/else no siempre se pueden sustituir por sentencias switch	


import java.util.Scanner;
public class FlotanteUnOperador {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        double num1 = input.nextDouble();

	        System.out.print("Introduce el segundo número: ");
	        double num2 = input.nextDouble();

	        System.out.print("Introduce el operador (/, *, +, / o %): ");
	        char operador = input.next().charAt(0);

	        double resultado = 0.0;

	        if (operador == '*') {
	        	resultado = num1 * num2;
	        }  else if (operador == '-') {
	        	resultado = num1 - num2;
	        } else if (operador == '+') {
	        	resultado = num1 + num2;
	        } else if (operador == '/') {
	        	resultado = num1 / num2;
	        } else if (operador == '%') {
	        	resultado = num1 % num2;
	        } else {
	            System.out.println("Operador inválido");
	            return;
	        }

	        System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);
	    }
	}


