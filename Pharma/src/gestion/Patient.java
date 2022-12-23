package gestion;

public class Patient {
	private String nom;
	private String prenom;
	private int age;
	private String[] medocs = new String[NBMEDOCMAX];
	private final static int NBPATIENTMAX = 20;
	private final static int NBMEDOCMAX = 10;
	
	
	public Patient(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	
}
