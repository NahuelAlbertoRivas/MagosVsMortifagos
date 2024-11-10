package clases;

import hechizos.HechizoFactory;
import hechizos.TipoHechizo;
import magos.*;
import mortifagos.*;

public class PersonajeFactory {
	//Se pensó que este será el estado inicial de la vida, si está armado y si está protegido.
	private static final float PUNTOS_VIDA = 100;
	private static final boolean ARMADO = true;
	private static final boolean PROTEGIDO = false;
	
	public static Mago crearMago(TipoPersonaje tipo, String nombrePersonaje) {
		Mago magoNuevo;

		switch (tipo) {
		case TipoPersonaje.Auror:
			magoNuevo = new Auror(nombrePersonaje, PUNTOS_VIDA, ARMADO, PROTEGIDO);
			break;

		case TipoPersonaje.Profesor:
			magoNuevo = new Profesor(nombrePersonaje, PUNTOS_VIDA, ARMADO, PROTEGIDO);
			break;
			
		case TipoPersonaje.Estudiante:
			magoNuevo = new Estudiante(nombrePersonaje, PUNTOS_VIDA, ARMADO, PROTEGIDO);
			break;

		default:
			throw new IllegalArgumentException("Tipo de mago desconocido");
		}
		
		//Se pensó que los magos conozcan todos los mismos hechizos, pero su daño es en base a su nivel mágico
		magoNuevo.agregarHechizo(HechizoFactory.crearHechizo(TipoHechizo.Expelliarmus));
		magoNuevo.agregarHechizo(HechizoFactory.crearHechizo(TipoHechizo.Protego));
		magoNuevo.agregarHechizo(HechizoFactory.crearHechizo(TipoHechizo.Sectumsempra));
		
		return magoNuevo;
	}

	public static Mortifago crearMortifago(TipoPersonaje tipo, String nombrePersonaje) {
		Mortifago mortifagoNuevo;

		switch (tipo) {
		case TipoPersonaje.Comandante:
			mortifagoNuevo = new Comandante(nombrePersonaje, PUNTOS_VIDA, ARMADO, PROTEGIDO);
			break;
			
		case TipoPersonaje.Seguidor:
			mortifagoNuevo = new Seguidor(nombrePersonaje, PUNTOS_VIDA, ARMADO, PROTEGIDO);
			break;
			
		default:
			throw new IllegalArgumentException("Tipo de mortifago desconocido");
		}
		
		//Se pensó que los mortífagos conozcan todos los mismos hechizos, pero su daño es en base a su nivel mágico
		mortifagoNuevo.agregarHechizo(HechizoFactory.crearHechizo(TipoHechizo.AvadaKedavra));
		mortifagoNuevo.agregarHechizo(HechizoFactory.crearHechizo(TipoHechizo.Crusio));
		mortifagoNuevo.agregarHechizo(HechizoFactory.crearHechizo(TipoHechizo.Imperio));
		mortifagoNuevo.agregarHechizo(HechizoFactory.crearHechizo(TipoHechizo.Protego));
		
		return mortifagoNuevo;
	}

}
