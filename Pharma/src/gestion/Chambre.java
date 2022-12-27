package gestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chambre {
	private Patient[] patients;
	private int nbPatients = 0;
	private int  NBPATIENTMAX = 20;
	
	public void addPatient(Patient patient) {
		if(nbPatients == NBPATIENTMAX) {
			System.out.println("L'hopital est déjà saturé");
		} else {
			patients[nbPatients] = patient;
			nbPatients ++;
		}
	}
	public void delPatient(int numPatient) {
		if(nbPatients == 0) {
			System.out.println("L'hopital est déjà vide");
		} else {
			patients[numPatient] = null;
			nbPatients --;
		}
	}
	
	public void editPatient(int numPatient) {
		System.out.println("1. Modifier le nom");
		System.out.println("2. Modifier le prenom");
		System.out.println("3. Modifier l'age");
		System.out.println("4. Modifier la prescription");
		
		try {
			int userInput = Integer.parseInt(inputOutput("Votre saisie est incorrecte. Veuillez entrer un chiffre correspondant au choix proposé ci-dessus."));
			
			if(userInput >= 1 && userInput <= 4){
				if(userInput == 1) {
					String newNom = inputOutput("\nSaisissez le nouveau Nom: ");
					//patients[numPatient].nom = newNom;
				}
				if(userInput == 2) {
					String newPrenom = inputOutput("\nSaisissez le nouveau prénom: ");
					//patients[numPatient].prenom = newPrenom;
				}
				if(userInput == 3) {
					String newAgeS = inputOutput("\nSaisissez le nouvel age du patient: ");
					int newAge = Integer.parseInt(newAgeS);
					//patients[numPatient].age = newAge;
				}
				if(userInput == 4) {
					// modifier la prescription...
				}
			}
	} catch (NumberFormatException e) {
    	System.out.println("Please enter a number from 1 - 4");
    	}
	}
	
	public Patient findPatient(int numPatient) {
		return patients[numPatient];
	}
	
	public void listePatients() {
		for(int i = 0; i < nbPatients; i++) {
			System.out.println("- " + patients[i]);
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
