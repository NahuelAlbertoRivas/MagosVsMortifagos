package hechizos;

public class HechizoFactory {
	public static Hechizo crearHechizo(TipoHechizo tipo) {
		switch (tipo) {
		case TipoHechizo.AvadaKedavra:
			return new AvadaKedavra();
		
		case TipoHechizo.Crusio:
			return new Crusio();
			
		case TipoHechizo.ExpectoPatronum:
			return new ExpectoPatronum();
			
		case TipoHechizo.Expelliarmus:
			return new Expelliarmus();

		case TipoHechizo.Imperio:
			return new Imperio();
			
		case TipoHechizo.Sectumsempra:
			return new Sectumsempra();
			
		case TipoHechizo.Protego:
			return new Protego();

		default:
			throw new IllegalArgumentException("Tipo de hechizo desconocido");
		}
	}
}
