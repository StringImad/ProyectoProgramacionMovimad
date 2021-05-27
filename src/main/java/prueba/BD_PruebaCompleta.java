package prueba;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import controladores.BD_ControladorConductorCRUD;
import controladores.BD_ControladorPasajeroCRUD;
import controladores.BD_ControladorUsuarioCRUD;
import controladores.BD_ControladorViajeCRUD;
import entidades.Conductor;
import entidades.Pasajero;
import entidades.Usuario;

public class BD_PruebaCompleta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		BD_ControladorUsuarioCRUD cu = new BD_ControladorUsuarioCRUD();
		BD_ControladorViajeCRUD cv = new BD_ControladorViajeCRUD();
		BD_ControladorPasajeroCRUD cp = new BD_ControladorPasajeroCRUD();
		BD_ControladorConductorCRUD cc = new BD_ControladorConductorCRUD();
		List<Conductor> listaVehiculos = cc.findAll();
		List<Usuario> listaUsuarios = cu.findAll();
//		System.out.println("-------------BIENVENIDO A MOVIMAD----------");
//		System.out.println("\n\tActualmente estos son los conductores que tenemos disponibles:\n");
//		imprimirConductoresDisponibles(listaVehiculos);
//		int codCliente = 0;
//		System.out.println("\nIntroduce tu codigo de pasajero: ");
//		codCliente = teclado.nextInt();
//		Pasajero pasaj = cp.findByPK(codCliente);
//		System.out.println("Eres el pasajero " + pasaj.getUsuario().getNombre());

		// ---------------------------------------------------------------------------------------------
		// JOptionPane.showMessageDialog(null, "Bienvenido al sistema, ¿Qué desea
		// realizar?");
		String[] botones = { "Mostrar", "Modificar", "Crear", "Borrar" };
		int ventana = JOptionPane.showOptionDialog(null, "Bienvenido al sistema, ¿Qué desea realizar?", " ",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
		switch (ventana) {
		case 0: {
			JOptionPane.showMessageDialog(null, "¿Qué desea mostrar?");
			String[] botonesEntidades = { "Usuarios", "Pasajeros", "Conductores", "Viajes" };
			int ventanaMostrar = JOptionPane.showOptionDialog(null, "Pulsa un boton:", " ", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, botonesEntidades, botonesEntidades[0]);
			switch (ventanaMostrar) {
			case 0:
				JOptionPane.showMessageDialog(null,
						"Actualmente tenemos registrados los siguientes usuarios: \n" + cu.findAll());

				break;
			case 1:
				JOptionPane.showMessageDialog(null,
						"Actualmente tenemos registrados los siguientes pasajeros: \n" + cp.findAll());
				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						"Actualmente tenemos registrados los siguientes conductores: \n" + cc.findAll());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,
						"Actualmente tenemos registrados los siguientes viajes: \n" + cv.findAll());
				break;

			}
			break;
		}
		case 1: {

			break;
		}
		case 2: {

			break;
		}
		case 3: {

			break;
		}

		}
	}

	private static void imprimirConductoresDisponibles(List<Conductor> listaConductores) {
		for (Conductor conduct : listaConductores) {
			if (conduct.getDispo()) {
				System.out.println("\tNombre: " + conduct.getUsuario().getNombre() + "\tDireccion : "
						+ conduct.getUsuario().getDireccion());
			}

		}
	}

	private static void imprimirUsuarios(List<Usuario> listaUsuarios) {
		for (Usuario user : listaUsuarios) {
			System.out.println(user.toString());

		}
	}

}
