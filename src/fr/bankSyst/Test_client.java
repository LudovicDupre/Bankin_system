package fr.bankSyst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test_client {

	static Scanner sc = new Scanner(System.in);
	Client client = new Client();


	public static void main(String[] args) {
		Epargne epargne = new Epargne();
		//init des maps
		HashMap<String, Epargne> epargneDB =  intiEDB();
		HashMap<String, Courant> courantDB =  intiCDB();
		ArrayList< Client> listClient   = initClient();

		System.out.println("Qui êtes vous?");
		//String identite = sc.next();
		//System.out.println(epargneDB.get(identite));
		//choix du compte
		System.out.println("Séléctionner un compte :\n 1 - pour Epargne \n 2 - pour Courant :  \n 3 - Quitter l'application.");
		int choice1 =-1;
		while(choice1!=3) {
			choice1 = sc.nextInt();
			while (choice1>3 || choice1<0)  {choice1 = sc.nextInt();}
			switch(choice1)   {


			case 1 : System.out.println("Séléctionner une opération :\n1 - Retrait. \n2 - Versement \n3 - Virement \n4 - Retour menu compte : ");
			int choice2 = -1;
			while (choice2!=4) {
				choice2 = sc.nextInt();
				while (choice2>4 || choice2<0) {choice2 =sc.nextInt();}

				switch(choice2) {

				case 1 : System.out.println("Back to operation menu");
				break;//retrait(String x, double y, double montant)
				case 2: System.out.println("Back to operation menu"); break;//versement(String x, double y, double montant)
				case 3: System.out.println("Back to operation menu"); break;//virement(String x , String y, double z)
				}
			} System.out.println("Back to account menu");
			break;

			case 2 : System.out.println("Séléctionner une opération :\n1 - Retrait. \n2 - Versement \n3 - Virement \n4 - Retour menu compte : ");
			int choice3 = -1;
			while (choice3!=4) {
				choice3 = sc.nextInt();
				while (choice3>4 || choice3<0) {choice3 =sc.nextInt();}

				switch(choice3) {

				case 1 :  System.out.println("Back to operation menu");break;//retrait(String x, double y, double montant)
				case 2: System.out.println("Back to operation menu"); break;//versement(String x, double y, double montant)
				case 3: System.out.println("Back to operation menu");break; //virement(String x , String y, double z)
				}
			}
			System.out.println("Back to account menu");
			break;
			}

		}
	}

	/**
	 * @return map des epargnes
	 */
	public static HashMap<String, Epargne> intiEDB() {
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
		return epargneDB;

	}
	/**
	 * @return map des courants
	 */
	public static HashMap<String, Courant> intiCDB() {
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
		return courantDB;

	}
	/**
	 * @return liste clients
	 */
	public static ArrayList<Client> initClient() {
		ArrayList< Client> listClient   = new ArrayList<>();
		listClient.add(new Client("T65R", "Dupont"));
		listClient.add(new Client("Z78Q", "Fleury"));
		listClient.add(new Client("J546", "Leroy"));
		listClient.add(new Client("M95L", "Bonnet"));
		listClient.add(new Client("A01B", "Moreau"));
		return listClient;
	}

	public static  void  selecOp(int x) {


	}
}
