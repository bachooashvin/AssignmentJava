import java.util.Scanner;
public class LabInventory {

	public LabInventory() {
		// TODO Auto-generated constructor stub
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//create scanner
			Scanner keyboard = new Scanner(System.in);
			
			//initialising variable
			int size = 0;
			int choice = 0;
			String pwrd = null;
			final String PASSWORD = "DitProg123";
			int wrong = 0;
			
			System.out.println("Welcome to the lab inventory");
			
			System.out.println("Enter maximum number of Items to be store: ");
			size = keyboard.nextInt();
			
			//Create an empty array
			Item[] itemDatabase = new Item[size];
			
			do {
				System.out.println("What do you want to do? ");
				System.out.println("Enter 1 to add new Item to the inventory ");
				System.out.println("Enter 2 to change information of an existing Item ");
				System.out.println("Enter 3 to display all the Items with specified category ");
				System.out.println("Enter 4 to display all Item to be re-ordered ");
				System.out.println("Enter 5 to know number of Items currently in store ");
				System.out.println("Enter 6 to quit ");
				System.out.println("Enter your choice: ");
				choice = keyboard.nextInt();
				
				if (choice == 1) {
					System.out.println("Add new Item to the inventory");
					for(int attempt = 0; attempt < 3; attempt++) {
						System.out.println("Enter your password. Attempt "+(attempt + 1)+": ");
						pwrd = keyboard.next();
						
						if(!pwrd.equals(PASSWORD)) {
							wrong++;
							System.out.println("Try again ");
							
							if(wrong == 12) {
								System.out.println("Dell1234");
								break;
							}
						}
						else {
							break;
						}
					}
				}
				
			}
			while(!pwrd.equals(PASSWORD));
			
		}

	}