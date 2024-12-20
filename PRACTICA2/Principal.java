package PRACTICA2;
//CODE CREADO POR J.ALFREDO L.D.C
public class Principal {


	//CONTAR CUANTAS SERIES Y VIDEOJUEGOS HAY ENTREGADOS
	public static void contadorSV(Serie[] array1,Videojuego[] array2) {
		int contadorSeries=0;
		int contadorVideojuegos=0;
		
		for(Serie serie:array1) {
			if(serie.isEntregado()) {
				contadorSeries++;
			}
		}
		for(Videojuego juego: array2) {
			if(juego.isEntregado()) {
				contadorVideojuegos++;
			}
		}
		
		System.out.println("Hoy hay "+contadorSeries+"/"+array1.length+" Entregados series");
		System.out.println("Hoy hay "+contadorVideojuegos+"/"+array2.length+" Entregados videojuegos");
	}
	
	//ENCONTRAR EL VIDEOJUEGO CON MAS HORA ESTIMADA Y LA SERIE CON MAS TEMPORADA
	public static void maxSV(Serie[] array1,Videojuego[] array2) {
		int indiceSerie=0;
		int indiceVideojuego=0;
		
		int comienzoVideojuego=array2[0].getHorasEstimada();
		int comienzoSerie = array1[0].getnDeTemporada();
		
		for(int i=1;i<array2.length;i++) {
			if(array2[i].getHorasEstimada()>comienzoVideojuego) {
				comienzoVideojuego=array2[i].getHorasEstimada();
				indiceVideojuego=i;
			}
		}
		
		for(int i=1;i<array1.length;i++) {
			if(array1[i].getnDeTemporada()>comienzoSerie) {
				comienzoSerie=array1[i].getnDeTemporada();
				indiceSerie=i;
			}
		}
		System.out.println("La serie con mas temporada: ");
		System.out.println(array1[indiceSerie].toString());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("El videojuego con mas horas estimadas: ");
		System.out.println(array2[indiceVideojuego].toString());
	}
	
	
	public static void main (String[] args) {
		Serie [] serie=new Serie[5];
		Videojuego [] videojuego=new Videojuego[5];
		
		//SERIES
		serie[0]= new Serie("La brea","David Appelbaum");
		serie[1]=new Serie("Stranger Things",5,"Ficcion","Duffer Brothers");
		serie[2]=new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
		serie[3]=new Serie("Chernóbil","Craig Mazin");
		serie[4]=new Serie("Rick y Morty","Dan Harmon y Justin Roiland");
		
		//VIDEOJUEGOS
		videojuego[0]=new Videojuego("Terraria",48);
		videojuego[1]=new Videojuego("Cuphead",16);
		videojuego[2]=new Videojuego("Minecraft",120,"Ficcion","Microsoft");
		videojuego[3]=new Videojuego("GTA V",35,"Acción-Aventura","Rockstar");
		videojuego[4]=new Videojuego("Red Dead Redemption 2",60,"Aventura","Rockstar");
		
		//ENTREGANDO ALGUNAS SERIES Y VIDEOJUEGOS
		serie[1].entregar();
		serie[4].entregar();
		serie[2].entregar();
		
		videojuego[2].entregar();
		videojuego[3].entregar();
		videojuego[1].entregar();
		
		//MOSTRAR DATOS
		contadorSV(serie,videojuego);
		System.out.println("---------------------------------------------------------------------------------------");
		maxSV(serie,videojuego);
		
		//DEVOLVEMOS
		serie[1].devolver();
		serie[4].devolver();
		serie[2].devolver();
		
		videojuego[2].devolver();
		videojuego[3].devolver();
		videojuego[1].devolver();
		
		System.out.println("---------------------------------------------------------------------------------------");
		contadorSV(serie,videojuego);
	}
}