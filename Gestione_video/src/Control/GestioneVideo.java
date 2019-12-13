package Control;

import java.util.ArrayList;

import Entity.Sport;
import Entity.Video;

public class GestioneVideo {
	private static ArrayList <Video> lista_video;
	
	public GestioneVideo() {
		ArrayList <Video> lista_video= new ArrayList<Video>(); 
	}
	
	
	public void  caricaVideo(Video v) {
		lista_video.add(v);
	}
	public ArrayList<Video> ricercaVideo(String testo,Sport Sport) {
		for (Video v: lista_video) {
			if( (Sport  == null || v.getSport().equals(Sport)) && 
					(testo == null || v.getNome().contains(testo)) ) {
			
					lista_video.add(v);
				}
				
			}
		return lista_video;
		}
	
	
	public void visualizzaVideo(Video v) {
		
	}
	public void  attivaNotifiche() {
		
	}
	public static void eliminaVideo(Video v) {
		lista_video.remove(v);
	}

	public int consultaVisualizzazioni(Video v) {
		return 0;
	}
}
