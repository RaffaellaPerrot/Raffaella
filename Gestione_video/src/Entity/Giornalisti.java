package Entity;

public class Giornalisti {
	protected String nomeGiornalista;
	protected String cognome;
	public Giornalisti(String nome,String cognome) {
		this.nomeGiornalista=nomeGiornalista;
		this.cognome=cognome;
	}

	public String getNome() {
		return nomeGiornalista;
	}
	public void setNome(String nome) {
		this.nomeGiornalista = nomeGiornalista;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
