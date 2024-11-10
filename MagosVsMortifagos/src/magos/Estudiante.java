package magos;

import clases.TipoPersonaje;

public class Estudiante extends Mago {
	private static final int NIVEL_MAGICO = 3;
	
    public Estudiante(String nombrePersonaje,float puntosVida, boolean armado, boolean protegido) {
        super(TipoPersonaje.Estudiante,  nombrePersonaje, NIVEL_MAGICO, puntosVida, armado, protegido);
    }
}