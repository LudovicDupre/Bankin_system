package fr.bankSyst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test_admin {

	public static void main(String[] args) {

		// init client
		ArrayList<Client> listClient = new ArrayList<>();
		listClient.add(new Client("T659", "Dupont"));
		listClient.add(new Client("Z784", "Fleury"));
		listClient.add(new Client("J546", "Leroy"));
		listClient.add(new Client("M958", "Bonnet"));
		listClient.add(new Client("A017", "Moreau"));

		// init Admin
		ArrayList<Admin> listAdmin = new ArrayList<>();
		listAdmin.add(new Admin(1, "Ludovic"));
		listAdmin.add(new Admin(2, "Raphael"));
		listAdmin.add(new Admin(3, "Guillaume"));
		listAdmin.add(new Admin(4, "Benoit"));

		// init epargneDB
		HashMap<String, Savings> savingsDB = new HashMap<String, Savings>();
		savingsDB.put("T659", new Savings("T659", "Dupont", "E605", 9000, 6));
		savingsDB.put("Z784", new Savings("Z784", "Fleury", "H685", 8000, 5));
		savingsDB.put("J546", new Savings("J546", "Leroy", "R965", 1500, 2));
		savingsDB.put("M958", new Savings("M958", "Bonnet", "D874", 875, 5));
		savingsDB.put("A014", new Savings("A017", "Moreau", "H685", 7500, 5));

		// init courantDB
		HashMap<String, Current> currentDB = new HashMap<String, Current>();
		currentDB.put("T659", new Current("T659", "Dupont", "G836", 6000, -500));
		currentDB.put("Z784", new Current("Z784", "Fleury", "Z513", 8750, -2500));
		currentDB.put("J546", new Current("J546", "Leroy", "D943", 4620, -400));
		//currentDB.put("M958", new Current("M958", "Bonnet", "F842", 4500, -300));
		currentDB.put("A017", new Current("A017", "Moreau", "A946", 7850, -1500));

		Scanner sc = new Scanner(System.in);

		int choice1 = -1;
		System.out.println(
				"Souhaiter vous selectionnez un client existant ou créer un client? \nTapez: 1 puis Entrer pour selectionnez un client existant."
						+ "\nTapez: 2 puis Entrer pour créer un nouveau client."
						+ "\nTapez: 3 puis Entrer pour Quitter l'app");
		while (choice1 != 3) {
			choice1 = sc.nextInt();
			while (choice1 > 3 || choice1 < 0) {
				choice1 = sc.nextInt();
			}
			switch (choice1) {

			case 1: // first sub-menu

				System.out.println("Liste des Clients:");
				int count = 1;

				for (Client c : listClient) {
					System.out.println(count + ": " + c);
					count++;
				}
				System.out.println("Ecrivez son ID puis cliquer sur entrer.");
				String existingCustomer = sc.next();
				
				Client clientChoose = null;
				
				for(Client client : listClient) {
					if(client.getIdC().equals(existingCustomer)) {
						clientChoose = client;
					
					}
				}
				
				if(currentDB.containsKey(existingCustomer)) {
					System.out.println(currentDB.get(existingCustomer));
				} else {
					System.out.println("New current account to create");
					generateCurrent(currentDB, sc, clientChoose);
					System.out.println("Congratulation ! New current account is create");
					for(String key : currentDB.keySet()) {
						
						System.out.println(currentDB.get(key)); 
						System.out.println("-----------------");
					}
					
				}
				
				if(savingsDB.containsKey(existingCustomer)) {
					System.out.println(savingsDB.get(existingCustomer));
				} else {
					System.out.println("New saving account to create");
					generateSavings(savingsDB, sc, clientChoose);
					System.out.println("Congratulation ! New saving account is create");
					for(String key : savingsDB.keySet()) {
						
						System.out.println(savingsDB.get(key)); 
						System.out.println("-----------------");
					}
				}
				System.out.println(
						"Souhaiter vous selectionnez un client existant ou créer un client? \nTapez: 1 puis Entrer pour selectionnez un client existant."
								+ "\nTapez: 2 puis Entrer pour créer un nouveau client."
								+ "\nTapez: 3 puis Entrer pour Quitter l'app");
				choice1 = sc.nextInt();
//				int choice2 = -1;
//				while (choice2 != 4) {
//					choice2 = sc.nextInt();
//					while (choice2 > 4 || choice2 < 0) {
//						choice2 = sc.nextInt();
//					}
//
//					switch (choice2) {
//
//					case 1:
//						break;
//
//					case 2:
//						break;
//
//					case 3:
//						break;
//					}
//
//					break;
//				}
			case 2: // second sub-menu
				String iDRandomC = generateIDCurrent();

				System.out.println("Entrer le nom du nouveau client");
				String newClient = sc.next();

				Client newOneClient = new Client(iDRandomC, newClient);
				listClient.add(newOneClient);

				System.out.println("Pour Le Client : " + newClient + ", ID: " + iDRandomC + " souhaitez vous créer:"
						+ "\nTapez: 1 puis Entrer pour un compte Courant"
						+ "\nTapez: 2 puis Entrer pour un compte Epargne");

				int value = Integer.parseInt(sc.next());

				int choice3 = -1;
				while (choice3 != 3) {
					choice3 = sc.nextInt();
					while (choice3 > 3 || choice3 < 0) {
						choice3 = sc.nextInt();
					}
					switch (choice3) {

					case 1:
						generateCurrent(currentDB, sc, newOneClient);
						break;

					case 2:
						generateSavings(savingsDB, sc, newOneClient);
						break;
					}
					break;
				}
			}
		}

		// if user ou Admin

//		int value = Integer.parseInt(scanner.next());
//		if (value == 1) {
//
//			System.out.println("Liste des Clients:");
//			int count = 1;
//
//			for (Client c : listClient) {
//				System.out.println(count + ": " + c);
//				count++;
//			}
//			System.out.println("Ecrivez son ID puis cliquer sur entrer.");
//			String existingCustomer = scanner.next();

		// création d'un compte épargne courant

//		} else if (value == 2) {
//			String iDRandomC = generateIDCurrent();
//
//			System.out.println("Entrer le nom du nouveau client");
//			String newClient = scanner.next();
//
//			Client newOneClient = new Client(iDRandomC, newClient);
//			listClient.add(newOneClient);
//
//			System.out.println("Pour Le Client : " + newClient + ", ID: " + iDRandomC + " souhaitez vous créer:"
//					+ "\nTapez: 1 puis Entrer pour un compte Courant"
//					+ "\nTapez: 2 puis Entrer pour un compte Epargne");
//
//			value = Integer.parseInt(scanner.next());
//			if (value == 1) {
//				generateCurrent(currentDB, scanner, newOneClient);
//
//			} else if (value == 2) {
//				generateSavings(savingsDB, scanner, newOneClient);
//
//			}

//		}

	}

	private static void generateSavings(HashMap<String, Savings> savingsDB, Scanner scanner, Client newOneClient) {
		System.out.println("Choisir un taux d'intérêts: ");
		int interestsRate = Integer.parseInt(scanner.next());

		String iDRandomCurrent = generateIDCurrent();

		savingsDB.put(newOneClient.getIdC(),
				new Savings(newOneClient.getIdC(), newOneClient.getName(), iDRandomCurrent, 0, interestsRate));

		for (String c : savingsDB.keySet()) {
			if (c == newOneClient.getIdC()) {
				System.out.println("Trouvé " + savingsDB.get(c));
			}
		}
	}

	private static void generateCurrent(HashMap<String, Current> currentDB, Scanner scanner, Client newOneClient) {
		System.out.println("Choisir un découvert autorisé:" + "\nEcrire le Nombre, il sera en négatif:");
		int authorizedOverdraft = Integer.parseInt(scanner.next());

		String iDRandomCurrent = generateIDCurrent();

		currentDB.put(newOneClient.getIdC(),
				new Current(newOneClient.getIdC(), newOneClient.getName(), iDRandomCurrent, 0, -authorizedOverdraft));

//		for (String c : currentDB.keySet()) {
//			if (c == newOneClient.getIdC()) {
//				System.out.println("Trouvé " + currentDB.get(c));
//			}
//		}
	}

	private static String generateIDCurrent() {
		Random random = new Random();
		int iDRandom;
		iDRandom = random.nextInt(998 - 100);
		String iDRandomS = String.valueOf(iDRandom);

		Random r = new Random();
		char c = (char) (r.nextInt(26) + 'a');

		String code = c + iDRandomS;

		code = code.toUpperCase();

		return code;
	}

}
