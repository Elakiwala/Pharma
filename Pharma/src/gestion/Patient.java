package gestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Patient {
	//private Medicament medoc;
	
	private String nom;
	private String prenom;
	private int age;
	private String prescription;
	private String[][] patients = {{"Manoban", "Lalisa", "25", "Doliprane"}, {"Fraser", "Jamie", "27", "Fucidine Doliprane"}, {"Windsor", "Elizabeth", "96", "Doliprane Tahor Amlor Modopar Fraxiparine"}, {"Oda", "Eiichiro", "47", "Doliprane Spiriva Vogalene Contramal"}, {"Watson", "Emma", "32", "Doliprane Kardegic"},{"Ortega", "Jenna", "20", "Doliprane"}, {"Macron", "Emmanuel", "45", "Doliprane Smecta"}, {"Musk", "Elon", "51", "Doliprane Primperan Fragmin"}, {"Zimmer", "Hans", "65", "Doliprane Domperidone Levothyrox Ketoprofene"}, {"Orlinski", "Jakub", "32", "Doliprane Coumadine Sterdex Topaldic"}, {"Desplat", "Alexandre", "61", "Doliprane"}}; 
	private int nbPatients = 11;
	private int NBPATIENTMAX = 20;
	private final String SEPARATEUR = " ";
	
	//les medicaments viennent de la classe Medicament 
	//dans cette liste on va juste garder le String nom du medicament en question soit : medoc.nom
	//
	
	public Patient(String nom, String prenom, int age, String prescription) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.prescription = prescription;
	}
	
	
	//saisir un nouveau patient de la forme = "Nom", "Prenom", age , "Medicament 1, Medicament 2..."
	// ---> "Lad"
	// ---> "Koba"
	// ---> 21
	// ---> nombre de médicaments
	//for nbMedoc
		//"Doliprane" -> verifier si present dans la liste sinon resaisir
		//quand ok ajouter le médoc en plus dans le stock de la pharmacie
		//concatener tous les médicaments en un seul string avec des espaces seulement
	// Patient "Lad" = new Patient("Lad", "Koba", 21, "Doliprane", Smecta") 
	public void addPatient(Patient patient) {
		if(nbPatients == NBPATIENTMAX) {
			System.out.println("L'hopital est déjà saturé");
		} else {
			nbPatients ++;
			//ajouter un emplacement a la liste
			patients = Arrays.copyOf(patients, patients.length+1);
			//mettre l'age int vers String
			String ageStr = Integer.toBinaryString(patient.age);
			//completer le profile du patient dans la liste
			patients[nbPatients-1][0] = nom;
			patients[nbPatients-1][1] = prenom;
			patients[nbPatients-1][2] = ageStr;
			patients[nbPatients-1][3] = prescription;
		}
	}
	
	public void delPatient(Patient patient) {
		if(nbPatients == 0) {
			System.out.println("L'hopital est déjà vide");
		} else {
			//fonction de recherche dans un liste ---> Classe MERE!!!!!!
			//trouver le patient dans la liste
			int numPatient=0;
			for(int i = 0; i<nbPatients; i++) {
				if(patient.nom == patients[i][0]) {
					numPatient = i;
				}
			}
//			String nom = patients[numPatient][0];
//			String prenom = patients[numPatient][1];
//			String age = patients[numPatient][2];
//			String prescription = patients[numPatient][3];
			
			String medoc[] = prescription.split(SEPARATEUR);
			//for chaque medoc le deduire du stock de la pharmacie
			
			//supprimer le patient de la liste (si c'est seulement ça qui est necessaire pour vraiment le supprimer)
			//patients.remove(numPatient);
			nbPatients --;
		}
	}
	
	public void editPatient(Patient patient) {
		//fonction de recherche dans un liste ---> Classe MERE!!!!!!
		//trouver le patient dans la liste
		int numPatient=0;
		for(int i = 0; i<nbPatients; i++) {
			if(patient.nom == patients[i][0]) {
				numPatient = i;
			}
		}
		
		System.out.println("1. Modifier le nom");
		System.out.println("2. Modifier le prenom");
		System.out.println("3. Modifier l'age");
		System.out.println("4. Modifier la prescription");
		
		try {
			int userInput = Integer.parseInt(inputOutput("Veuillez entrer un chiffre correspondant au choix proposé ci-dessus."));
			
			if(userInput >= 1 && userInput <= 4){
				if(userInput == 1) {
					String newNom = inputOutput("\nSaisissez le nouveau Nom: ");
					patient.nom = newNom;
					patients[numPatient][0] = newNom;
				}
				if(userInput == 2) {
					String newPrenom = inputOutput("\nSaisissez le nouveau prénom: ");
					patient.prenom = newPrenom;
					patients[numPatient][1] = newPrenom;
				}
				if(userInput == 3) {
					String newAgeStr = inputOutput("\nSaisissez le nouvel age du patient: ");
					patient.age = Integer.parseInt(newAgeStr);
					patients[numPatient][2] = newAgeStr;
				}
				if(userInput == 4) {
					//String ordonance;
					String nbMedicaments = inputOutput("\nSaisissez le nombre de medicaments que le patient devra desormais prendre: ");
					int quantite = Integer.parseInt(nbMedicaments);
					for(int i = 0; i<quantite; i++) {
						//String medoc = inputOutput("\nSaisissez le nom du nouveau medicament: ");
						//verifier s'il est dans la liste
						//concatener: ordonnance = ordonnance + medoc
						//mettre remplacer ancienne prescription par l'ordonnance
						//modifier la liste
					}
				}
			}
	} catch (NumberFormatException e) {
    	System.out.println("Please enter a number from 1 - 4");
    	}
	}
	
	public void listePatients() {
		for(int i = 0; i < nbPatients; i++) {
			System.out.println("- " + patients[i] + "\n"); //ameliorer l'affichage
		}
	}
	
	public void findFichePatient(Patient patient) {
		System.out.println(patient.nom + patient.prenom + ": ");
		System.out.println("\nAge :" + patient.age);
		System.out.println("\nPrescription:\n");
		System.out.println(patient.prescription);
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
	
	public String getPrescription() {//Medicament... 
		return prescription;
	}
	
//	@Override
//	public String toString() {
//		return "Patient [nom =" + nom + ", prenom =" + prenom + ", age =" + age + ", prescription =" + prescription + "]";
//	}
//	
	

	/**
     * Passes a prompt to the user and returns the user specified 
     * string.
     * @param message
     * @return String
     */
    private static String inputOutput(String message) {
        System.out.println(message);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String returnString = "";
	    try {
	        returnString = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println("Error reading in value");
	    }
	    return returnString;
    }
	
    public static void main(String[] args) {
    	//System.out.println(listePatients());
    	Patient eloy;
    	eloy = new Patient("Mbeleck", "Eloy", 9, "Doliprane Smecta");
    	eloy.listePatients();
	}
    
}
