package actividad_2;

public class punto_a {

	public static void main(String[] args) {
		int ingresos=300000;
		int vehiculos=1;
		int inmuebles=4;
		boolean VdeLujo=true;
		
		if(ingresos>=489083 || vehiculos>=1 || inmuebles>=1 || VdeLujo==true){
			System.out.println("Tiene ingresos Altos");
		}
		else {
			System.out.println("No tiene ingresos Altos");
		}


	}

}
