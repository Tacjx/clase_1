package actividad_1;

import java.util.Scanner;

public class punto_c {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int inicio=5;
		int fin=14;
		
		System.out.println("¿Mostrar pares o impares?");
		String respuesta;
		respuesta= leer.next();
		
		while(inicio<=fin){
			switch(respuesta) {
			case "pares":
				if(inicio%2==0) {
					System.out.println(inicio);
				} break;
			case "impares":
				if(inicio%2!=0) {
					System.out.println(inicio);
				}
				
			inicio++;
			}
		}

	}

}
