package hechizos;

import clases.Personaje;

public class AvadaKedavra implements Hechizo {
	private static final int DANIO_BASE = 100;
	
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		System.out.println(lanzador.getNombre() + " lanza Avada Kedavra contra " + objetivo.getNombre() + ".");

		//Si el personaje objetivo está protegido por Protego, el hechizo lanzado por el lanzador, no tendrá efecto.
		if (objetivo.getProtegido()) {
			System.out.println(objetivo.getNombre() + " se protegió del hechizo y no tuvo efecto.");
			objetivo.setProtegido(false);
		} else {
			//Si el personaje objetivo no está prtegido, recibirá daño.
			double multiplicadorNivel = lanzador.getNivelMagico() / 10.0;
			double danioReal = DANIO_BASE * multiplicadorNivel;
			objetivo.recibirDanio(danioReal);
		}
	}

	@Override
	public String toString() {
		return "Avada Kedabra";
	}
}