package magos;

import clases.TipoPersonaje;

public class Profesor extends Mago {
	private static final int NIVEL_MAGICO = 5;
	
    public Profesor(String nombrePersonaje, float puntosVida, boolean armado, boolean protegido) {
        super(TipoPersonaje.Profesor, nombrePersonaje, NIVEL_MAGICO, puntosVida, armado, protegido);
    }
}