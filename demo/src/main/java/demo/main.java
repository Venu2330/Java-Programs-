package demo;

import java.util.Scanner;

public class main {
	static {
		Scanner sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1.Insert\n 2.Delete\n 3.Display\n 4.update\n 5.Exit\n Enter the choice..?");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				insert();
				break;

			case 2:
				del();
				break;
				
			case 3:
				display();
				break;
				
			case 4:
				update();
				break;
				
			case 5:
				System.exit(0);
				
			default:
				System.out.println("Invalid choice entered");
			}

		} while (choice != 5);

	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void display() {
		// TODO Auto-generated method stub
		
	}

	private static void del() {
		// TODO Auto-generated method stub
		
	}

	private static void insert() {
		// TODO Auto-generated method stub
		
	}

}
