
import java.util.Scanner;
public class Planetas {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("ingrese su peso en la tierra en libras : ");
	        double peso = input.nextDouble();
	        
	        System.out.println("\nseleccoione un planeta:");
	        
	        System.out.println("1. Mercurio\n2. Venus\n3. Marte\n4. Jupiter\n5. Saturno\n6. Uranos\n7. Neptuno");
	        
	        System.out.print("ingrese el numero del plneta que desea hacer la convercion : ");
	        int planeta = input.nextInt();
	        
	        double factordeConvercion;
	        
	        String nomplaneta;
	        
	        switch (planeta) {
	            case 1:
	          factordeConvercion = 0.38;
	          nomplaneta = "Mercurio";
	          
	                break;
	            case 2:
	            	factordeConvercion = 0.91;
	            	nomplaneta = "Venus";
	            	
	                break;
	            case 3:
	            	factordeConvercion = 0.38;
	            	nomplaneta = "Marte";
	            	 break;
	            
	            case 4:
	            	factordeConvercion = 2.36;
	            	nomplaneta = "Jupiter";
	            	
	                break;
	            case 5:
	            	factordeConvercion = 0.92;
	            	nomplaneta = "Saturno";
	                break;
	                
	                
	            case 6:
	            	factordeConvercion = 0.89;
	            	nomplaneta = "Urano";
	              break;
	            case 7:
	            	factordeConvercion = 1.13;
	            	nomplaneta = "Neptuno";
	                break;
	            default:
	            	factordeConvercion = 1;
	            	nomplaneta = "tiera";
	                break;
	        }
	        
	        double pesoenPlatena = peso * factordeConvercion;
	        
	        System.out.println("\ntu peso en el planeta " + nomplaneta + " es " + pesoenPlatena + " lbs.");
	    }

}
