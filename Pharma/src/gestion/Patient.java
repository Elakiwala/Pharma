package gestion;

public class Patient {
	private String nom;
	private String prenom;
	private int age;
	private String prescription;
	private String[][] patients = {{"Manoban", "Lalisa", "25", "Doliprane"}, {"Fraser", "Jamie", "27", "Fucidine", "Doliprane"}, {"Windsor", "Elizabeth", "96", "Doliprane", "Tahor", "Amlor", "Modopar", "Fraxiparine"}, {"Oda", "Eiichiro", "47", "Doliprane", "Spiriva", "Vogalene", "Contramal"}, {"Watson", "Emma", "32", "Doliprane", "Kardegic"},{"Ortega", "Jenna", "20", "Doliprane"}, {"Macron", "Emmanuel", "45", "Doliprane", "Smecta"}, {"Musk", "Elon", "51", "Doliprane", "Primperan", "Fragmin"}, {"Zimmer", "Hans", "65", "Doliprane", "Domperidone", "Levothyrox", "Ketoprofene"}, {"Orlinski", "Jakub", "32", "Doliprane", "Coumadine", "Sterdex", "Topaldic"}, {"Desplat", "Alexandre", "61", "Doliprane"}}; 
	
	//base de données des patients a faire avec OCaml et CSV...
	
	public Patient(String nom, String prenom, int age, String prescription) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.prescription = prescription;
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
	
	/*public String[] getPrescription() {//Medicament... 
		return prescription;
	}*/
	
	@Override
	public String toString() {
		return "Patient [nom =" + nom + ", prenom =" + prenom + ", age =" + age + ", prescription =" + prescription + "]";
	}
	
	
}
