package batalla;

import java.util.Map;

import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

public class Heuristica {
	private static final int delay = 0;
	
	public static void bindReglas(String nomArch) {
		
		Query q1 = new Query("consult", new Term[] { new Atom(nomArch) });

		if(!q1.hasSolution())
			return;
		
	}
	
	public static void sugerirObjetivoDeseable(String nomArch, String tipo, String ronda) {
		
		Query q1 = new Query("consult", new Term[] { new Atom(nomArch) });
		
		if(!q1.hasSolution())
			return;
		
		Query consulta = new Query("objetivo_deseable_" + tipo + "(" + "X" + "," + "Y" + ","  + "Z" + "," + ronda + ").");
		
		if(consulta.hasNext()){
			Map<String, Term> solution = consulta.next();
			Term x = (Term) solution.get("X");
			System.err.println("\nEn la próxima ronda se recomienda atacar a: " + x);
		}
		
	}
}