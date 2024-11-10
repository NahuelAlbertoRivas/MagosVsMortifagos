package magos;

import clases.TipoPersonaje;

public class Auror extends Mago {
	private static final int NIVEL_MAGICO = 10;
	
    public Auror(String nombrePersonaje, float puntosVida, boolean armado, boolean protegido) {
        super(TipoPersonaje.Auror, nombrePersonaje, NIVEL_MAGICO, puntosVida, armado, protegido);
    }
} 