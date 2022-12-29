package gestion;

public class Medicament {
	private String nom;
	//private int quantite;
	private String[][] stock = {{"Doliprane", "20"},{"Kardegic", "10"},{"Ketoprofene", "12"}, {"Contramal", "17"},{"Contramal", "8"},{"Primperan", "2"},{"Spiriva", "13"},{"Fragmin", "16"},{"Fraxiparine","4"},{"Domperidone", "9"},{"Levothyrox", "18"},{"Smecta", "14"},{"Modopar","7"},{"Amlor","15"},{"Coumadine","19"},{"Sterdex","6"},{"Topalgic", "5"},{"Temerite", "3"},{"Tahor", "11"},{"Fucidine","2"}};
	private int[] dotation = {20,10,12,17,8,2,13,16,4,9,18,14,7,15,19,6,5,3,11,2};
	//private int[] quantiteAct; //dotation + besoin des patients en medicament 
	private int nbMedoc = 20;
	
	public Medicament(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	//voir le stock
	public void checkStock() {
		for (int i = 0; i<nbMedoc; i++) {
			String dot = Integer.toString(dotation[i]);
			System.out.println("- "+ stock[i][0] + stock[i][1] + " /" + dot);
		}
	}
	//verifier la présence du médoc saisi
	public boolean checkMedInList(Medicament medoc) {
		int i = 0;
		while(stock[i][0] != medoc.nom || i<nbMedoc) {
			i++;
		}
		if(stock[i][0] == medoc.nom) {
			return true;
		} else { return false; }
		
	}
	//ajouter quantité medoc
	public void add1Medoc(Medicament medoc) {
		int i = 0;
		while (stock[i][0] != medoc.nom) {
			i++;
		}
		int quantite = Integer.parseInt(stock[i][1]);
		quantite ++;
		stock[i][1] = Integer.toString(quantite);
	}
	//supprimer quantité médoc
	public void dell1Medoc(Medicament medoc) {
		int i = 0;
		while (stock[i][0] != medoc.nom) {
			i++;
		}
		int quantite = Integer.parseInt(stock[i][1]);
		if (dotation[i] > quantite) {
			quantite --;
		}
		stock[i][1] = Integer.toString(quantite);
	}
}

