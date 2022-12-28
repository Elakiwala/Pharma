package gestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//private static Patient patient;
	private static Chambre chambre;
	//private static Pharmacie stock;
	//private static Medicament medicament;
	
	
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
			int userInput = Integer.parseInt(inputOutput("Veuillez entrer un chiffre correspondant au menu."));
			
			if(userInput >= 0 && userInput <= 4){
				if (userInput == 1) {
					System.out.println("1. Voir la liste des patients");
					System.out.println("2. Ajouter un patient");
					System.out.println("3. Supprimer un patient");
					System.out.println("4. Modifier un patient");
					System.out.println("0. Menu exit");
					try { 
						int userInput2 = Integer.parseInt(inputOutput("Veuillez entrer un chiffre correspondant au menu."));

						if(userInput2 >= 0 && userInput2 <= 4) {
							if(userInput2 == 1) {
								listePatients();
							}
							if(userInput2 == 2) {
								addPatient();
							}
							if(userInput2 == 3) {
								delPatient();
							}
							if(userInput2 == 4) {
								editPatient();
							}
							if(userInput2 == 0) {
								mainMenu();
							}
						} else {
			        		System.out.println("Please enter a number from 0 - 6");
			            	mainMenu();
			        	}
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 6");
			        	mainMenu();
			        }
				}
			}
				if(userInput == 2) {
					System.out.println("1. Voir l'état des stocks");
					System.out.println("0. Menu exit");
					// médicaments = enum ou médicament = liste de n-uplets
					try {
						int userInput2 = Integer.parseInt(inputOutput("Veuillez entrer un chiffre correspondant au menu."));

						if(userInput2 >= 0 && userInput2 <= 1) {
							if(userInput2 == 1) {
								//voirStock();
							}
							if(userInput2 == 0) {
								mainMenu();
							} 
						} else {
				        		System.out.println("Please enter a number from 0 - 1");
				            	mainMenu();
				        	}
						
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 1");
			        	mainMenu();
						}
					}
				
				if(userInput == 3) {
					System.out.println("1. Voir l'état de la commande");
					System.out.println("2. Ajouter un médicament à la commande");
					System.out.println("3. Supprimer un médicament de la commande");
					System.out.println("4. Supprimer toute la commande");
					System.out.println("0. Menu Exit");
					
					try {
						int userInput2 = Integer.parseInt(inputOutput("Veuillez entrer un chiffre correspondant au menu."));

						if(userInput2 >= 0 && userInput2 <= 4) {
							if(userInput2 == 1) {
								//voirCommande();
							}
							if(userInput2 == 2) {
								//addToCommande();
							}
							if(userInput2 == 3) {
								//delFromCommande();
							}
							if(userInput2 == 4) {
								//delAllCommande();
							}
							if(userInput2 == 0) {
								mainMenu();
							} 
						} else {
				        		System.out.println("Please enter a number from 0 - 4");
				            	mainMenu();
				        	}
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 4");
			        	mainMenu();
			        }
				}
				if(userInput == 4) {
					System.out.println("1. Effectuer des soins à un patient");
					System.out.println("0. Menu exit");
					
					try {
						int userInput2 = Integer.parseInt(inputOutput("Veuillez entrer un chiffre correspondant au menu."));

						if(userInput2 >= 0 && userInput2 <= 1) {
							if(userInput2 == 1) {
								//faireSoins();
							}
							if(userInput2 == 0) {
								mainMenu();;
							} 
						} else {
				        		System.out.println("Please enter a number from 0 - 1");
				            	mainMenu();
				        	}
					} catch (NumberFormatException e) {
			        	System.out.println("Merci de rentrer un chiffre de 0 à 1");
			        	mainMenu();
			        }
				}
				if(userInput == 0) {
					System.out.println("Au revoir!");
					System.exit(0);
				}
			
		} catch (NumberFormatException e) {
        	System.out.println("Merci de rentrer un chiffre de 0 à 6");
        	mainMenu();
        }	
	}

	public static void listePatients() {
		//afficher la liste des patients avec leurs prescriptions associées
		System.out.println(chambre.listePatients());
		mainMenu();
	}
	public static void addPatient() {
		//verifier que le nombre max de patients dans l'hopital n'est pas atteint
		
		//lire le nom du patient
		String nom = inputOutput("\nEntrer le nom du patient: ");
		
		//lire le prenom du patient
		String prenom = inputOutput("\nEntrer le prenom du patient: ");
		
		//lire l'age du patient
		String ageStr = inputOutput("\nEntrer l'age du patient: ");
		int age = Integer.parseInt(ageStr);
		
		//lire le nombre de médicaments dont il a besoin
		String quantiteStr = inputOutput("\nEntrer la quantité de médicament le patient a besoin: ");
		int quantite = Integer.parseInt(quantiteStr);
		
		String[] prescription = new String[20];
		for(int i = 0; i<quantite; i++){
			String medoc = inputOutput("\nSaisissez le nom du médicament: ");
			prescription[i] = medoc;
		}
			//TODO
			//lire le nom de chaque médicaments	
				//verifier que le médicament existe dans la liste!!!!!
				//si oui
					// +1 médicament dans la pharmacie (dotation)
					// ajouter le médicament dans la préscription (fiche) du patient 
				//sinon
					//demander de resaisir ou d'arreter
		/*Patient name; 
		name = new Patient(nom, prenom, age, prescription);
		chambre.addPatient();*/
		/**ajouter le patient a la liste**/
	}
	public static void delPatient() {
		//lire le nom du patient
		String nom = inputOutput("\nEntrer le nom du patient: ");
		
		//supprimer le patient de la liste
	}
	public static void editPatient() {
		//lire le nom du patient
		String nom = inputOutput("\nEntrer le nom du patient: ");
		
		//choisir quoi modifier (nom ou prénom ou un médicament de la prescription (ajouter ou supprimer ou réécrire))
		//faire la modification
			//supprimer le détail choisi et permettre a l'utilisateur de le réécrire
	}
	public static void voirStock() {
		//afficher la liste des médicaments de la pharmacie (nom + quantité présente)
	}
	public static void voirCommande() {
		//afficher l'état de la commande (liste de nom + quantité)
	}
	public static void addToCommande() {
		//lire nom du médicament
		String nom = inputOutput("\nEntrer le nom du médicament a ajouter: ");
		
		//lire la quantité
		String quantite = inputOutput("\nEntrer la quantité a ajouter a la commande: ");
		
		//ajotuer a la commande
	}
	public static void delFromCommande() {
		//lire le nom du médicament
		String nom = inputOutput("\nEntrer le nom du médicament a supprimer: ");
		
		//lire la quantité 
		String quantite = inputOutput("\nEntrer la quantité a supprimer de la commande:");
			//si la quantité est supérieur a la quantité présente dans la liste de la commande
				//juste tout supprimer
		//supprimer de la commande
	}
	public static void delAllCommande() {
		//ajouter les médicaments manquants a la pharmacie
		//supprimer toute la commande
	}
	public static void faireSoins() {
		//lire nom du patient à soigner
		String nom = inputOutput("\nEntrer le nom du patient: ");
		
		//déduire les médicaments utilisé de la pharmacie
		//ajouter les médicaments utilisé a la commande (nom + quantité)
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
	        mainMenu();
	    }
	    return returnString;
    }
    
    public static void main(String[] args) {
		System.out.println("Bienvune a l'hopital Lansalot!\n");
		mainMenu();
	}
}
