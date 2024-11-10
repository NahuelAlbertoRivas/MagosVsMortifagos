package app;

import java.io.IOException;

import batalla.Batalla;
import batalla.Heuristica;

public class Main {
	
	// setear la ruta a cada archivo .pl, se encuentra en la misma carpeta del tp
	public static String reglasMagosPath = "C:/Users/Admin/N/UNLaM/PdP/MagosVsMortifagos/reglasMagos.pl",
		                 reglasMortifagosPath = "C:/Users/Admin/N/UNLaM/PdP/MagosVsMortifagos/reglasMortifagos.pl",
		                 baseDeConocimientosMagos = "C:/Users/Admin/N/UNLaM/PdP/MagosVsMortifagos/tmpBaseDeConocimientosMagos.pl",
		                 baseDeConocimientosMortifagos = "C:/Users/Admin/N/UNLaM/PdP/MagosVsMortifagos/tmpBaseDeConocimientosMortifagos.pl";
	
	public static void main(String[] args) throws IOException {
		
		Batalla batalla = new Batalla();

		batalla.simularBatalla();

	}
}