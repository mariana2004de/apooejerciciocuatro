	import java.util.Scanner;
public class EstudianteExamenFinal {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        double promedioNotas, puntajeSAT;
	        int rankingInstituto, numAlumnosInstituto;

	        System.out.print("Ingrese el promedio de notas del estudiante: ");
	        
	        
	        promedioNotas = entrada.nextDouble();

	        System.out.print("Ingrese el puntaje SAT del estudiante: ");
	        
	        
	        puntajeSAT = entrada.nextDouble();

	        System.out.print("Ingrese el ranking del estudiante en su instituto: ");
	        
	        
	        rankingInstituto = entrada.nextInt();

	        System.out.print("Ingrese el número de alumnos de su instituto: ");
	        
	        
	        numAlumnosInstituto = entrada.nextInt();

	        if ((rankingInstituto <= 2 && numAlumnosInstituto >= 1400) ||
	            (promedioNotas >= 4.0 && puntajeSAT >= 1100) ||
	            (promedioNotas >= 3.5 && puntajeSAT >= 1300) ||
	            (promedioNotas >= 3.0 && puntajeSAT >= 1500)) {
	        	
	            System.out.println("El estudiante cumple los requisitos para ingresar a la Universidad Mountville.");
	            
	        } else {
	        	
	            System.out.println("El estudiante no cumple los requisitos para ingresar a la Universidad  Mountville.");
	        }
	    }
	}


