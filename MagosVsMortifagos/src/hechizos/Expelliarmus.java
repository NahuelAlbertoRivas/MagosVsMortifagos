package hechizos;

import clases.Personaje;

public class Expelliarmus implements Hechizo {
    @Override
    public void ejecutar(Personaje lanzador, Personaje objetivo) {
    	System.out.println(lanzador.getNombre() + " lanza Expelliarmus a " + objetivo.getNombre() + ".");
		
    	//Si el personaje objetivo está protegido por Protego, el hechizo lanzado por el lanzador, no tendrá efecto.
		if (objetivo.getProtegido()) {
			System.out.println(objetivo.getNombre() + " se protegió del hechizo y no tuvo efecto.");
			objetivo.setProtegido(false);
		} else if(objetivo.getArmado()){
			//Si el personaje objetivo tiene varita, se lo desarma.
			System.out.println(objetivo.getNombre() + " fue desarmado.");
			objetivo.setArmado(false);
		} else
			//Si el perosnaje objetivo no tiene varita, no se lo desarma, ya que no posee una.
			System.out.println(objetivo.getNombre() + " ya estaba desarmado.");
    }
    
    @Override
    public String toString() {
    	return "Expelliarmus";
    }
}