package test;

import java.util.Scanner;

class node
{
	//To implement the operations
	protected int data;
	protected node link;
	
	//create a constructor to initialize zero to data and null to link
	public node()
	{
		link = null;
		data = 0;
	}
	
	public node(int d,node n)
	{
		
	}
}

class linkedlist
{
	//To implement the methods
}
public void display()
{
	if(size==0)
	{
		System.out.println("Empty");
		return;
	}
	Node ptr = start;
	syso
}

public class Linked_list {

	public static void main(String[] args) {
		short choice;
		Scanner sc =new Scanner(System.in);
		linkedlist obj = new linkedlist(); 
		do
		{
		System.out.println("1.Insert\n 2.Delete\n 3.Update\n 4.Display\n5.Exit");
		System.out.println("Enter the choice");
		choice = sc.nextShort();
		switch(choice)
		{
		case 1:
			System.out.println("Enter an Integer to insert");
			obj.insert(sc.nextInt());
			break;
		case 2:
			System.out.println("Enter the position to be deleted");
			int p = sc.nextInt();
			if(p<1 || p>list.getSize())
				System.out.println("Invalid Position");
			else
				list.delete(p);
			break;
	    case 3:System.out.println(""); 
			
			
		}
		}while(choice!=5);
		

	}

}
