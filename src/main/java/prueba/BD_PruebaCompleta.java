package prueba;

import java.util.List;

import controladores.BD_ControladorConductorCRUD;
import controladores.BD_ControladorPasajeroCRUD;
import controladores.BD_ControladorUsuarioCRUD;
import controladores.BD_ControladorViajeCRUD;
import entidades.Conductor;

public class BD_PruebaCompleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BD_ControladorUsuarioCRUD cu = new BD_ControladorUsuarioCRUD();
		BD_ControladorViajeCRUD cv= new BD_ControladorViajeCRUD();
		BD_ControladorPasajeroCRUD cp= new BD_ControladorPasajeroCRUD();
		BD_ControladorConductorCRUD cc= new BD_ControladorConductorCRUD();
		List<Conductor> listaVehiculos = cc.findAll();

		System.out.println("-------------BIENVENIDO A MOVIMAD----------");
		System.out.println("\n\tActualmente estos son los conductores que tenemos disponibles:\n");
		imprimirConductoresDisponibles(listaVehiculos);

	}
	
	private static void imprimirConductoresDisponibles(List<Conductor> listaConductores) {
		for (Conductor conduct : listaConductores) {
			if(conduct.getDispo()) {
				System.out.println("\tNombre: " + conduct.getUsuario().getNombre() + "\tDireccion : " 
						+conduct.getUsuario().getDireccion());
			}
			
		
		}
	}

}
