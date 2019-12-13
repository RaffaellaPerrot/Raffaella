package Entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class videoApprofondimento extends Video {
	private ArrayList<Giornalisti> giornalisti = new ArrayList<Giornalisti>();
	public videoApprofondimento(int id, String nome, Sport sport, LocalDate dataRegistrazione) {
		super(id, nome, sport, dataRegistrazione);
		
	}
	public videoApprofondimento( String nome, Sport sport, LocalDate dataRegistrazione) {
		super( nome, sport, dataRegistrazione);
		
	}
	public ArrayList<Giornalisti> getGiornalisti() {
		return giornalisti;
	}
public String toString() {
		
		StringBuffer buf = new StringBuffer();
		
		buf.append("VIDEO APPROFONDIMENTO: "+id+", "+nome+", "+dataRegistrazione+", "+sport+"\n");
		
		for(Giornalisti g : giornalisti) {
			buf.append("  GIORNALISTA: "+g.getNome()+" "+g.getCognome()+"\n");
		}
		
		return buf.toString();
	}
public void addGiornalista(Giornalisti giornalisti2) {
	// TODO Auto-generated method stub
	
}

}
