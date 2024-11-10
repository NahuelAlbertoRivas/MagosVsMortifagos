package mortifagos;

import clases.Personaje;
import clases.TipoPersonaje;

//Se pleantea que los mortífagos tienen el siguiente puntaje de nivel mágico:
//	-Comandantes: 10
//	-Seguidor: 3
public abstract class Mortifago extends Personaje {
	public Mortifago(TipoPersonaje tipo, String nombrePersonaje, int nivelMagia, float puntosVida, boolean armado,
			boolean protegido) {
		super(tipo, nombrePersonaje, nivelMagia, puntosVida, armado, protegido);
	}
}