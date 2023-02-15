package fr.bankSyst;

import java.util.ArrayList;
import java.util.HashMap;

public class Test_client {

	public static void main(String[] args) {
		
		
		// init data
		HashMap<String, Epargne> epargneDB = new HashMap<String, Epargne>(); 
		Epargne e1 =  new Epargne("E605", 9000, 6);
		Epargne e2 = new  Epargne("H685", 8000, 5);
		Epargne e3 = new  Epargne("R965", 1500, 2);
		Epargne e4 = new  Epargne("D874", 875, 5);
		Epargne e5 = new  Epargne("H685", 7500, 5);
		epargneDB.put("T65R", e1);
		epargneDB.put("Z78Q", e2);
		epargneDB.put("J546", e3);
		epargneDB.put("M95L", e4);
		epargneDB.put("A01B", e5);

		HashMap<String, Courant> courantDB = new HashMap<String, Courant>(); 
		Courant c1 =  new Courant("G836", 6000, -500);
		Courant c2 = new  Courant("Z513", 8750, -2500);
		Courant c3 = new  Courant("D943", 4620, -400);
		Courant c4 = new  Courant("F842", 4500, -300);
		Courant c5 = new  Courant("A946", 7850, -1500);
		courantDB.put("T65R", c1);
		courantDB.put("Z78Q", c2);
		courantDB.put("J546", c3);
		courantDB.put("M95L", c4);
		courantDB.put("A01B", c5);
		//init client
		ArrayList< Client> listClient   = new ArrayList<>();
		listClient.add(new Client("T65R", "Dupont"));
		listClient.add(new Client("Z78Q", "Fleury"));
		listClient.add(new Client("J546", "Leroy"));
		listClient.add(new Client("M95L", "Bonnet"));
		listClient.add(new Client("A01B", "Moreau"));
		
		
		
		
		}
		//choix du compte
		
		// choix de l'operation
		
		
	
}
