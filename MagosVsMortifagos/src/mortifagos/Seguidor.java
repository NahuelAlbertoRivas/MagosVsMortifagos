package mortifagos;

import clases.TipoPersonaje;

public class Seguidor extends Mortifago {
	private static final int NIVEL_MAGICO = 3;
	
    public Seguidor(String nombrePersonaje, float puntosVida, boolean armado, boolean protegido) {
        super(TipoPersonaje.Seguidor, nombrePersonaje, NIVEL_MAGICO, puntosVida, armado, protegido);
    }
}