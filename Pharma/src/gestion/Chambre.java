package gestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chambre {
	//private Patient[] patients;
	private String[][] patients = {{"Manoban", "Lalisa", "25", "Doliprane"}, {"Kim", "Jisoo", "27", "Fucidine", "Doliprane"}, {"Hisaishi", "Joe", "72", "Doliprane", "Tahor", "Amlor", "Modopar", "Fraxiparine"}, {"Oda", "Eiichiro", "47", "Doliprane", "Spiriva", "Vogalene", "Contramal"}, {"Watson", "Emma", "32", "Doliprane", "Kardegic"},{"Ortega", "Jenna", "20", "Doliprane"}, {"Jeon", "Jungkook", "25", "Doliprane", "Ketoprofene"}, {"Musk", "Elon", "51", "Doliprane", "Primperan", "Fragmin"}, {"Zimmer", "Hans", "65", "Doliprane", "Domperidone", "Levothyrox", "Smecta"}, {"Orlinski", "Jakub", "32", "Doliprane", "Coumadine", "Sterdex", "Topaldic"}, {"Desplat", "Alexandre", "61", "Doliprane"}}; 
	private int nbPatients = 11;
	private int  NBPATIENTMAX = 20;
	
	public void addPatient() {
		if(nbPatients == NBPATIENTMAX) {
			System.out.println("L'hopital est déjà saturé");
		} else {
			nbPatients ++;
			//ajotuer un emplacement dans la liste
			String nom = inputOutput("\nEntrer le nom du patient: ");
			String prenom = inputOutput("\nEntrer le prenom du patient: ");
			String age = inputOutput("\nEntrer l'age du patient: ");
			//saisir le nombre de médoc
			/*-> for le nombre de medoc
				//saisir le nom du médoc
				//vérifier qu'il fait bien parti de la liste de médoc de la pharmacie
				//ajouter +1 de ce médicament à la liste*/   //OKAY
		}
	}
	public void delPatient() {
		if(nbPatients == 0) {
			System.out.println("L'hopital est déjà vide");
		} else {
			String nom = inputOutput("\nEntrer le nom du patient: ");
			//for le nombre de patient present dans la liste
				//check si le nom du patient i equals le nom du patient saisi
				//si le 
				//remove(liste[i][])
			nbPatients --;
		}
	}
	
	public void editPatient() {
		String nom = inputOutput("\nEntrer le nom du patient: ");
		//for le nombre de patient present dans la liste
			//check si le nom du patient i equals le nom du patient saisi
			//int taille = liste[i][].size()
			//nom = liste[i][0]
			//prenom
			//age
			//liste[i][:taille-3] (->kes médicaments)
		System.out.println("1. Modifier le nom");
		System.out.println("2. Modifier le prenom");
		System.out.println("3. Modifier l'age");
		System.out.println("4. Modifier la prescription");
		
		try {
			int userInput = Integer.parseInt(inputOutput("Veuillez entrer un chiffre correspondant au choix proposé ci-dessus."));
			
			if(userInput >= 1 && userInput <= 4){
				if(userInput == 1) {
					//String newNom = inputOutput("\nSaisissez le nouveau Nom: ");
					//nom = newNom;
				}
				if(userInput == 2) {
					//String newPrenom = inputOutput("\nSaisissez le nouveau prénom: ");
					//prenom = newPrenom;
				}
				if(userInput == 3) {
					//String newAgeStr = inputOutput("\nSaisissez le nouvel age du patient: ");
					//age = newAgeStr;
				}
				if(userInput == 4) {
					// modifier la prescription...
					//for taille-3
						//saisir le nom du nouveau médicament
						//liste[i][j] = nouveau médicament
						//...
				}
			}
	} catch (NumberFormatException e) {
    	System.out.println("Please enter a number from 1 - 4");
    	}
	}
	
	public void findPatient() {
		//saisir le nom du patient 
		//for le nombre de patient present dans la liste
			//check si le nom du patient i equals le nom du patient saisi
			//afficher le patient (nom, prenom, age, tous les médicaments qu'il prend)
	}
	
	public void listePatients() {
		for(int i = 0; i < nbPatients; i++) {
			System.out.println("- " + patients[i] + "\n");
		}
	}
	
	
	
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
}
