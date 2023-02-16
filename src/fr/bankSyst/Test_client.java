package fr.bankSyst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test_client {

	static Scanner sc = new Scanner(System.in);
	Client client = new Client();

	public static void main(String[] args) {

		//init des maps
		HashMap<String, Savings> savingsDB =  intiSDB();
		HashMap<String, Current> currentDB =  intiCDB();
		ArrayList< Client> listClient   = initClient();

		System.out.println("Who are you?");
		String identity = sc.next();
		//choix du compte
		System.out.println(mainMenu());
		int choice1 =-1;
		while(choice1!=3) {
			choice1 = sc.nextInt();
			while (choice1>3 || choice1<0)  {choice1 = sc.nextInt();}
			switch(choice1)   {

			
			case 1 : System.out.println(opMenu());// Savings
			System.out.println(savingsDB.get(identity));
			int choice2 = -1;
			while (choice2!=4) {
				choice2 = sc.nextInt();
				while (choice2>4 || choice2<0) {choice2 =sc.nextInt();}
				
				switch(choice2) {
				
				case 1 : System.out.println("Back to operation menu\n\n"+opMenu());
				break;//retrait(String x, double y, double montant)
				case 2: System.out.println("Back to operation menu\n\n"+opMenu()); break;//versement(String x, double y, double montant)
				case 3: System.out.println("Back to operation menu\n\n"+opMenu()); break;//virement(String x , String y, double z)
				}
			} System.out.println("Back to account menu\n\n"+mainMenu());
			break;

			case 2 : System.out.println(opMenu());// Current
			System.out.println(currentDB.get(identity));
			int choice3 = -1;
			while (choice3!=4) {
				choice3 = sc.nextInt();
				while (choice3>4 || choice3<0) {choice3 =sc.nextInt();}

				switch(choice3) {

				case 1 :  System.out.println("Back to operation menu\n\n"+opMenu());break;//retrait(String x, double y, double montant)
				case 2: System.out.println("Back to operation menu\n\n"+opMenu()); break;//versement(String x, double y, double montant)
				case 3: System.out.println("Back to operation menu\n\n"+opMenu());break; //virement(String x , String y, double z)
				}
			}
			System.out.println("Back to account menu\n\n"+mainMenu());
			break;
			}
		}
		System.out.println("GoodBye.");
	}
	/** initialization of the map object  
	 * @return map of object epargne
	 */
	public static HashMap<String, Savings> intiSDB() {
		HashMap<String, Savings> savingsDB = new HashMap<String, Savings>(); 
		Savings e1 =  new Savings("E605", 9000, 6);
		Savings e2 = new  Savings("H685", 8000, 5);
		Savings e3 = new  Savings("R965", 1500, 2);
		Savings e4 = new  Savings("D874", 875, 5);
		Savings e5 = new  Savings("H685", 7500, 5);
		savingsDB.put("T65R", e1);
		savingsDB.put("Z78Q", e2);
		savingsDB.put("J546", e3);
		savingsDB.put("M95L", e4);
		savingsDB.put("A01B", e5);
		return savingsDB;

	}
	/** initialization of the map of object courant 
	 * @return map of object courant
	 */
	public static HashMap<String, Current> intiCDB() {
		HashMap<String, Current> currentDB = new HashMap<String, Current>(); 
		Current c1 =  new Current("G836", 6000, -500);
		Current c2 = new  Current("Z513", 8750, -2500);
		Current c3 = new  Current("D943", 4620, -400);
		Current c4 = new  Current("F842", 4500, -300);
		Current c5 = new  Current("A946", 7850, -1500);
		currentDB.put("T65R", c1);
		currentDB.put("Z78Q", c2);
		currentDB.put("J546", c3);
		currentDB.put("M95L", c4);
		currentDB.put("A01B", c5);
		return currentDB;

	}
	/** initialization client list
	 * @return lclient list
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
	/**
	 * init main menu
	 * @return main menu
	 */
	public static  String  mainMenu() {
		return "Select an account :\n 1 - Savings account. \n 2 - Current account.  \n 3 - Leave the app.";
	}
	/**
	 * init operation menu
	 * @return operation menu
	 */
	public static String opMenu() {
		return "Select an operation :\n1 - Withdrawal. \n2 - Deposit. \n3 - Transfer. \n4 - Back to main menu.  ";
	}
}
