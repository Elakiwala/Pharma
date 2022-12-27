package gestion;

public class Patient {
	private String nom;
	private String prenom;
	private int age;
	private Medicament[] prescription = new Medicament[20];
	
	public Patient(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	 
	public String getPrenom() {
		return prenom;
	}
	
	public int getAge() {
		return age;
	}
	
	public Medicament[] getPrescription() {
		return prescription;
	}
	
	@Override
	public String toString() {
		return "Patient [nom =" + nom + ", prenom =" + prenom + ", age =" + age + ", prescription =" + prescription + "]";
	}
}
