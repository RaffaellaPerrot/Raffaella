package Main;
import Control.GestioneVideo;
import Entity.Video;
import Entity.Cameraman;
import Entity.Giornalisti;
import Entity.Sport;
import Entity.videoApprofondimento;
import Entity.videoEventi;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class main {


	public static void main(String[] args) {

		GestioneVideo gestionevideo = new GestioneVideo();


		String nome = "Partita Fiorentina-Napoli";
		LocalDate dataRegistrazione = LocalDate.of(2019, Month.AUGUST, 24);
		videoEventi v1 = new videoEventi(nome,Sport.CALCIO,dataRegistrazione);

		nome = "Partita Juventus-Napoli";
		dataRegistrazione = LocalDate.of(2019, Month.AUGUST, 31);
		videoEventi v2 = new videoEventi(nome,Sport.CALCIO,dataRegistrazione);

	
		nome = "Partita Napoli-Sampdoria";
		dataRegistrazione = LocalDate.of(2019, Month.SEPTEMBER, 14);
		videoEventi v3 = new videoEventi(nome,Sport.CALCIO,dataRegistrazione);


		nome = "Commento Napoli-Sampdoria";
		dataRegistrazione = LocalDate.of(2019, Month.SEPTEMBER, 14);
		videoApprofondimento v4 = new videoApprofondimento(nome,Sport.CALCIO,dataRegistrazione);


		v4.addGiornalista(new Giornalisti("TIZIO", "CAIO"));
		v4.addGiornalista(new Giornalisti("PIPPO", "PLUTO"));




		gestionevideo.caricaVideo(v1);
		gestionevideo.caricaVideo(v2);
		gestionevideo.caricaVideo(v3);
		gestionevideo.caricaVideo(v4);

		ArrayList<Video> v_ricerca = gestionevideo.ricercaVideo("Samp", Sport.CALCIO);


		System.out.println("Risultati della ricerca:\n");

		for(Video v : v_ricerca) {

			System.out.println(v+"\n");
		}



		GestioneVideo.eliminaVideo(v1);
		GestioneVideo.eliminaVideo(v2);
		GestioneVideo.eliminaVideo(v3);
		GestioneVideo.eliminaVideo(v4);



		
	}

}
