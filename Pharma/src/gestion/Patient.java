package gestion;

public class Patient {
	private String nom;
	private String prenom;
	private int age;
	private String[] prescription;
	//base de données des patients a faire avec OCaml et CSV...
	
	public Patient(String nom, String prenom, int age, String[] prescription) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.prescription = new String[20];
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
	
	public String[] getPrescription() {//Medicament... 
		return prescription;
	}
	
	@Override
	public String toString() {
		return "Patient [nom =" + nom + ", prenom =" + prenom + ", age =" + age + ", prescription =" + prescription + "]";
	}
}
