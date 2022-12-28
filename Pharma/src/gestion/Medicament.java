package gestion;

public enum Medicament {
	DOLIPRANE("Doliprane"), CARDEGIQUE("Cardegique"), KETOPROFENE("Ketoprofene"), CONTRAMAL("Contramal"), VOGALENE("Vogalene"), PRIMPERAN("Primperan"), SPIRIVA("Spiriva"), FRAGMINE("Fragmine"), FRAXIPARIE("Fraxiparine"), DOMPERIDOME("Domperidome"), LEVOTIROX("Levotirox"), PRIMEGKUTINE("Primeglutine"), MODOPARE("Modopare"), AMLOR("Amlor"), COUMADIE("Coumadine"), STARDEX("Stardex"), TOPALGIQUE("Topalgique"), TEMERITE("Temerite"), TAOR("Taor"), FUCIDINE("Fucidine");
	
	private String nom;
	
	private Medicament(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
