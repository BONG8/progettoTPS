package app.model.veicolo;

public abstract class Veicolo {
	private int nPosti;
	private Double Serbatoio; // su 100, ogni tot distanza percorsa si leva tot (bus piu costosi consumano meno e sono piu capienti)
	//private Rotta rotta; // rotta seguita
	private Double prezzoVeicolo;
	private StatoVeicolo stato; // attivo,non attivo,miglioramneto,riparazione
	
	
}
