package app.model.veicolo;

public class StatoVeicolo {
	private Boolean attivo;
	private Boolean miglioramento;
	private Boolean riparazione;

	public StatoVeicolo() {
		this.attivo = false;
		this.miglioramento=false;
		this.riparazione=false;
	}

	public Boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}

	public Boolean isInMiglioramento() {
		return miglioramento;
	}

	public void setMiglioramento(Boolean miglioramento) {
		this.miglioramento = miglioramento;
	}

	public Boolean isInRiparazione() {
		return riparazione;
	}

	public void setRiparazione(Boolean riparazione) {
		this.riparazione = riparazione;
	}
	
	public String getStato() {
		if(this.isAttivo())
			return "Attivo";
		if(this.isInMiglioramento())
			return "Miglioramento";
		if(this.isInRiparazione())
			return "Riparazione";
		return "Inutilizzato";
	}
}
