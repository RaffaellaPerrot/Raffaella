package Entity;

import java.time.LocalDate;

public class videoEventi extends Video{
	
	
	public videoEventi(String nome, Sport sport, LocalDate dataRegistrazione) {
		super( nome, sport, dataRegistrazione);
		
	}
		
	
	public videoEventi(int id, String nome, Sport sport, LocalDate dataRegistrazione) {
		super(id, nome, sport, dataRegistrazione);
		
	}

	

	public String toString() {
		
		StringBuffer buf = new StringBuffer();
		
		buf.append("VIDEO EVENTO: "+id+", "+nome+", "+dataRegistrazione+", "+sport+"\n");
		
		
		
		return buf.toString();
	}
}
