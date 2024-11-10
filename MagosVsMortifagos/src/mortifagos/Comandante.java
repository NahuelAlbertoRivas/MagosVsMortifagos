package mortifagos;

import clases.TipoPersonaje;

public class Comandante extends Mortifago {
	private static final int NIVEL_MAGICO = 10;
	
    public Comandante(String nombrePersonaje, float puntosVida, boolean armado, boolean protegido) {
        super(TipoPersonaje.Comandante, nombrePersonaje, NIVEL_MAGICO, puntosVida, armado, protegido);
    }
}