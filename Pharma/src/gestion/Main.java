package gestion;

import java.io.BufferedReader;

public class Main {
	public static void mainMenu() {
		
		/*
		 * Affiche le menu et s'occupe des saisies
		 * de l'utilisateur.
		 */
		System.out.println("1. Patient");
		System.out.println("2. Pharmacie");
		System.out.println("3. Commande");
		System.out.println("4. Soin");
		System.out.println("0. Exit\n");
		
		//Prend la réponse de l'utilisateur
		
		try {
			int userInput = Integer.parseInt(inputOutput("Votre saisie est incorrecte. Veuillez entrer un chiffre correspondant au menu."));
			
			if(userInput >= 0 && userInput <= 4){
				if (userInput == 1) {
					System.out.println("1. Voir la liste des patients");
					System.out.println("2. Ajouter un patient");
					System.out.println("3. Supprimer un patient");
					System.out.println("4. Modifier un patient");
					
					try { 
						//TODO
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 6");
			        	mainMenu();
			        }
				}
				if(userInput == 2) {
					System.out.println("1. Voir l'état des stocks");
					// médicaments = enum ou médicament = liste de n-uplets
					try {
						//TODO
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 6");
			        	mainMenu();
			        }
				}
				if(userInput == 3) {
					System.out.println("1. Voir l'état de la commande");
					System.out.println("2. Ajouter un médicament à la commande");
					System.out.println("3. Supprimer un médicament de la commande");
					System.out.println("4. Supprimer toute la commande");
					
					try {
						//TODO
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 6");
			        	mainMenu();
			        }
				}
				if(userInput == 4) {
					System.out.println("1. Effectuer des soins à un patient");
					
					try {
						//TODO
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 6");
			        	mainMenu();
			        }
				}
				if(userInput == 0) {
					System.exit(0);
				}
			}
		} catch (NumberFormatException e) {
        	System.out.println("Merci de rentrer un chiffre de 0 à 6");
        	mainMenu();
        }	
	}
}
