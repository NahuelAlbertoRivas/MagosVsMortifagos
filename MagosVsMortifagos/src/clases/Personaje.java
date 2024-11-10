package clases;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;

public abstract class Personaje {
	// ATRIBUTOS
	protected TipoPersonaje tipo;
	protected String nombre;
	protected float puntosVida;
	protected int nivelMagia;
	protected boolean armado, protegido;
	protected List<Hechizo> hechizos;

	// GETTERS & SETTERS
	public List<Hechizo> getHechizos(){
		return this.hechizos;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public float getPuntosVida() {
		return this.puntosVida;
	}
	
	public boolean getArmado() {
		return this.armado;
	}
	
	public int getNivelMagico() {
		return this.nivelMagia;
	}
	
	public TipoPersonaje getTipo() {
		return this.tipo;
	}
	
	public boolean getProtegido() {
		return this.protegido;
	}
	
	public void setArmado(boolean nuevoArmado) {
		this.armado = nuevoArmado;
	}
	
	public void setProtegido(boolean nuevoProtegido) {
		this.protegido = nuevoProtegido;
	}
	
	// CONSTRUCTORES
	public Personaje(TipoPersonaje tipo, String nombre, int nivelMagia, float puntosVida, boolean armado, boolean protegido) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.nivelMagia = nivelMagia;
		this.puntosVida = puntosVida;
		this.armado = armado;
		this.protegido = protegido;
		this.hechizos = new ArrayList<>();
	}

	// METODOS
	@Override
	public String toString() {
		return "Personaje [tipo=" + tipo + ", nombre=" + nombre + ", nivelMagia=" + nivelMagia + ", puntosVida="
				+ puntosVida + ", armado=" + armado + ", protegido=" + protegido + ", hechizos=" + hechizos + "]";
	}
	
	//Lanza el hechizo seleccionado al enemigo especificado.
	public void lanzarHechizo(Hechizo hechizo, Personaje enemigo) {
		if (hechizos.contains(hechizo))
			hechizo.ejecutar(this, enemigo);
        else
            System.out.println(nombre + " no puede lanzar el hechizo " + hechizo);
	}

	//Agrega un hechizo al personaje.
	public void agregarHechizo(Hechizo hechizo) {
		hechizos.add(hechizo);
	}

	//Recibe el daño el personaje.
	public void recibirDanio(double danioReal) {
		this.puntosVida -= danioReal;
		if (puntosVida <= 0)
			System.out.println(nombre + " ha sido derrotado.");
		else
			System.out.println(nombre + " tiene " + puntosVida + " puntos de vida restantes.");
	}
	
	
	public void actualizarEstadisticaPorRonda(PrintWriter escritor, String tipo, int ronda) {
		escritor.println("estado_" + tipo + "(" + nombre.toLowerCase() + ", " + nivelMagia + ", " + puntosVida + ", " + Integer.toString(ronda) + ").");
	}
	
}