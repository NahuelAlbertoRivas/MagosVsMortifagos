package hechizos;

import clases.Personaje;

//Interfaz Hechizo (Strategy)

//Formula de daño: DAÑO_BASE * (lanzador.getNivelMagico() / 10)
public interface Hechizo {
	void ejecutar(Personaje lanzador, Personaje objetivo);
}