package action;

import gestion.Medicament;

public class Commande {
	//private Medicament medoc;
	
	private String[][] commande = {{"Doliprane", "0"},{"Kardegic", "0"},{"Ketoprofene", "0"}, {"Contramal", "0"},{"Contramal", "0"},{"Primperan", "0"},{"Spiriva", "0"},{"Fragmin", "0"},{"Fraxiparine","0"},{"Domperidone", "0"},{"Levothyrox", "0"},{"Smecta", "0"},{"Modopar","0"},{"Amlor","0"},{"Coumadine","0"},{"Sterdex","0"},{"Topalgic", "0"},{"Temerite", "0"},{"Tahor", "0"},{"Fucidine","0"}};
	int nbMedoc = 20;
	
	//fonctions:
	
	public void voirCommande() {
		for (int i = 0; i<nbMedoc; i++) {
			System.out.println("- "+ commande[i][0] + commande[i][1] );
		}
	}
	
	public void add1ToCommande(Medicament medoc) {
		//fonction de recherche dans un liste ---> Classe MERE!!!!!!
		int numMedoc=0;
		for(int i = 0; i<nbMedoc; i++) {
			if(medoc.getNom() == commande[i][0]) {
				numMedoc = i;
			}
		}
		int quantite = Integer.parseInt(commande[numMedoc][0]);
		quantite ++;
		commande[numMedoc][1] = Integer.toString(quantite);
	}
	
	public void del1FromCommande(Medicament medoc) {
		//fonction de recherche dans un liste ---> Classe MERE!!!!!!
		int numMedoc=0;
		for(int i = 0; i<nbMedoc; i++) {
			if(medoc.getNom() == commande[i][0]) {
				numMedoc = i;
			}
		}
		int quantite = Integer.parseInt(commande[numMedoc][0]);
		quantite --;
		commande[numMedoc][1] = Integer.toString(quantite);
	}
	
	public void delAllCommande() {
		for(int i = 0; i <nbMedoc; i ++) {
			int quantite = Integer.parseInt(commande[i][1]);
			quantite = 0;
			commande[i][1] = Integer.toString(quantite);
		}
	}
	
	public void passerCommande() {
		//remettre la commande a 0
		//remplire toute la pharmacie : dotation + besoin des patients
	}
	
}
