package magos;

import clases.Personaje;
import clases.TipoPersonaje;

//Se pleantea que los magos tienen el siguiente puntaje de nivel mágico:
//	-Autores: 10
//	-Profesores: 5
//	-Estudiantes: 3
public abstract class Mago extends Personaje {
	public Mago(TipoPersonaje tipo, String nombrePersonaje, int nivelMagia, float puntosVida, boolean armado,
			boolean protegido) {
		super(tipo, nombrePersonaje, nivelMagia, puntosVida, armado, protegido);
	}
}
