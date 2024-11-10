package batalla;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import clases.Personaje;
import hechizos.Hechizo;

public class Batallon {
	//ATRIBUTOS
	private List<Personaje> atacantes;
	private Map<Personaje, List<Hechizo>> personajeHechizo;
	private Set<Hechizo> hechizosUsados;

	//GETTERS & SETTERS
	public List<Personaje> getAtacantes() {
		return atacantes;
	}

	public Map<Personaje, List<Hechizo>> getPersonajeHechizo() {
		return personajeHechizo;
	}

	//CONSTRUCTORES
	public Batallon() {
		this.atacantes = new ArrayList<Personaje>();
		this.personajeHechizo = new HashMap<Personaje, List<Hechizo>>();
		this.hechizosUsados = new HashSet<Hechizo>();
	}
	
	//METODOS
	public void vaciarHechizosUsados() {
		this.hechizosUsados.clear();
	}
	
	public boolean agregarPersonaje(Personaje personaje) {
		if (personaje == null)
			return false;

		atacantes.add(personaje);
		personajeHechizo.put(personaje, new ArrayList<Hechizo>());

		return true;
	}

	public boolean tienePersonajesSaludables() {
		for (Personaje pers : atacantes)
			if (pers.getPuntosVida() > 0)
				return true;

		return false;
	}

	public void atacar(Batallon oponente) {
		Random random = new Random();
		Personaje oponenteSeleccionado;
		int indexOponente, indexHechizo;

		for (Personaje atacante : atacantes) {
			if (atacante.getPuntosVida() <= 0)
				continue;

			if (!atacante.getArmado()) {
				System.out.println(atacante.getNombre() + " quiere atacar, pero está desarmado.");
				continue;
			}
			
			if (oponente.tienePersonajesSaludables()) {
				do {
					indexOponente = random.nextInt(oponente.atacantes.size());
					oponenteSeleccionado = oponente.atacantes.get(indexOponente);
				} while (oponenteSeleccionado.getPuntosVida() <= 0);

				indexHechizo = random.nextInt(atacante.getHechizos().size());
				Hechizo hechizoSeleccionado = atacante.getHechizos().get(indexHechizo);

				if(!this.hechizosUsados.contains(hechizoSeleccionado)) {
					atacante.lanzarHechizo(hechizoSeleccionado, oponenteSeleccionado);
					personajeHechizo.get(atacante).add(hechizoSeleccionado);
					hechizosUsados.add(hechizoSeleccionado);
				}
				else
					System.out.println(atacante.getNombre() + " ya lanzó " + hechizoSeleccionado.toString() + " en esta ronda. ¡No se puede repetir!");
			}
		}
	}
}
