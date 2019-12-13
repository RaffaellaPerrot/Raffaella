package Entity;

import java.time.LocalDate;
import Entity.Giornalisti;

public class Video {
	protected int id;
	protected String nome;
	protected Sport sport;
	protected LocalDate dataRegistrazione;
	public Video(int id , String nome, Sport sport, LocalDate dataRegistrazione) {
		this.id=id;
		this.nome=nome;
		this.sport=sport;
		this.dataRegistrazione=dataRegistrazione;
	}
	public Video(Giornalisti nomeGiornalista,Giornalisti cognome,int id , String nome, Sport sport, LocalDate dataRegistrazione) {
		this.id=id;
		this.nome=nome;
		this.sport=sport;
		this.dataRegistrazione=dataRegistrazione;
	}
	public Video(String nome, Sport sport, LocalDate dataRegistrazione) {
		this.nome=nome;
		this.sport=sport;
		this.dataRegistrazione=dataRegistrazione;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setNome(String giornalisti) {
		this.nome=giornalisti;
	}
	public String getNome() {
		return nome;
	}
	public void setSport(Sport sport) {
		this.sport=sport;
	}
	public Sport getSport () {
		return sport;
	}
	public LocalDate getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(LocalDate dataRegistrazione) {
		this.dataRegistrazione=dataRegistrazione;
	}
	
}
