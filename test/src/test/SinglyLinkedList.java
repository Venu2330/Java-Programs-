package test;

import java.util.Scanner;

class Node{
	protected int data;
	protected Node link;
	
	public Node() {
		data = 0;
		link = null;
	}
	
	public Node(int d, Node n) {
		data = d;
		link = n;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int d) {
		this.data = d;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node n) {
		this.link = n;
	}	
}

class LinkedList{
	protected Node start;
	protected Node end;
	public int size;
	
	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public void insert(int val) {
		Node nptr = new Node(val, null);
		size++;
		if() {
			
		}
		else {
			nptr.setLink(start);
			start = nptr;
		}
	}
	
	public void insertPos(int val,int pos)
	{
		Node nptr = new Node();
	}
	
	public void delete(int pos) {
		if(pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if(pos == size) {
			Node s = start;
			Node t = start;
			while{
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos - 1;
		for(int i = 1; i < size - 1; i++) {
			if(i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;	
	}
	
	public void display() {
		if(size == 0) {
			System.out.println("Emp"));
			ptr = start.getLink();
			
		}
	}
	
}

public class SinglyLinkedList {
	Scanner scanner = new Scanner(System.in);
	LinkedList list = new LinkedList();
	
	do {
		System.out.println("1. Insert	2. Delete	3. Display	4. Exit");
		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();
		switch(choice) {
			case 1 : System.out.println("Enter an integer to insert:"); 
					list.insert(scanner.nextInt());
				break;
			case 2 : System.out.println("Enter Psoition where you need to delete");
				int p = sc.nextInt();
				if(p < 1 || p > list.delete())
					System.out.println("Invalid Position");
				else
					list.delete();
				break;
			case 3 : list.display();
				break;
			case 4 : list = null;
				break;
			default : System.out.println("Invalid choice");
		}
	}while(choice != 4);

}