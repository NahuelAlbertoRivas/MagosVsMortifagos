package hechizos;

import clases.Personaje;

public class Protego implements Hechizo {
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		//Si el personaje lanzador no está protegido, se protege.
		if (!lanzador.getProtegido()) {
			lanzador.setProtegido(true);
			System.out.println(lanzador.getNombre() + " lanza Protego y se protege de los ataques.");
		} else
			//Si el personaje lanzador ya estaba protegido, no se lanza nuevamente el hechizo.
			System.out.println(lanzador.getNombre() + " lanza Protego, pero ya estaba protegido.");
	}

	@Override
	public String toString() {
		return "Protego";
	}
}